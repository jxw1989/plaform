/*
 * 文 件 名:  RedissonCache.java
 * 版    权:  Copyright © 2017 mbov Orginization  Ltd.All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  2019年1月11日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package org.mbov.cache;

import java.lang.reflect.Constructor;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.redisson.api.RLock;
import org.redisson.api.RMap;
import org.redisson.api.RMapCache;
import org.redisson.api.RedissonClient;
import org.redisson.spring.cache.CacheConfig;
import org.redisson.spring.cache.NullValue;
import org.springframework.cache.Cache;
import org.springframework.cache.support.SimpleValueWrapper;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, 2019年1月11日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class RedissonCache implements Cache {

	private RMapCache<Object, Object> mapCache;

	private final RMap<Object, Object> map;

	private CacheConfig config;

	private final boolean allowNullValues;

	private final AtomicLong hits = new AtomicLong();

	private final AtomicLong puts = new AtomicLong();

	private final AtomicLong misses = new AtomicLong();

	private CacheRelationHandler cacheRelationHandler;
	
	private RedissonClient redisson;

	private String cacheName;

	public RedissonCache(RMapCache<Object, Object> mapCache, CacheConfig config, boolean allowNullValues,
			String cacheName, CacheRelationHandler cacheRelationHandler,RedissonClient redisson) {
		this(mapCache, allowNullValues, cacheName, cacheRelationHandler,redisson);
		this.mapCache = mapCache;
		this.config = config;
	}

	public RedissonCache(RMap<Object, Object> map, boolean allowNullValues, String cacheName,
			CacheRelationHandler cacheRelationHandler,RedissonClient redisson) {
		this.map = map;
		this.allowNullValues = allowNullValues;
		this.cacheRelationHandler = cacheRelationHandler;
		this.cacheName = cacheName;
	}

	@Override
	public String getName() {
		return map.getName();
	}

	@Override
	public RMap<?, ?> getNativeCache() {
		return map;
	}

	@Override
	public ValueWrapper get(Object key) {
		Object value = map.get(key);
		if (value == null) {
			addCacheMiss();
		} else {
			addCacheHit();
		}
		return toValueWrapper(value);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Object key, Class<T> type) {
		Object value = map.get(key);
		if (value == null) {
			addCacheMiss();
		} else {
			addCacheHit();
			if (value.getClass().getName().equals(NullValue.class.getName())) {
				return null;
			}
			if (type != null && !type.isInstance(value)) {
				throw new IllegalStateException(
						"Cached value is not of required type [" + type.getName() + "]: " + value);
			}
		}
		return (T) fromStoreValue(value);
	}

	@Override
	public void put(Object key, Object value) {
		if (!allowNullValues && value == null) {
			if (null != cacheRelationHandler) {
				cacheRelationHandler.handleCache(cacheName,redisson);
			}
			map.remove(key);
			return;
		}

		value = toStoreValue(value);
		if (mapCache != null) {
			if (null != cacheRelationHandler) {
				cacheRelationHandler.handleCache(cacheName, redisson);
			}
			mapCache.fastPut(key, value, config.getTTL(), TimeUnit.MILLISECONDS, config.getMaxIdleTime(),
					TimeUnit.MILLISECONDS);
		} else {
			if (null != cacheRelationHandler) {
				cacheRelationHandler.handleCache(cacheName, redisson);
			}
			map.fastPut(key, value);
		}
		addCachePut();
	}

	public ValueWrapper putIfAbsent(Object key, Object value) {
		Object prevValue;
		if (!allowNullValues && value == null) {
			prevValue = map.get(key);
		} else {
			value = toStoreValue(value);
			if (mapCache != null) {
				if (null != cacheRelationHandler) {
					cacheRelationHandler.handleCache(cacheName, redisson);
				}
				prevValue = mapCache.putIfAbsent(key, value, config.getTTL(), TimeUnit.MILLISECONDS,
						config.getMaxIdleTime(), TimeUnit.MILLISECONDS);
			} else {
				if (null != cacheRelationHandler) {
					cacheRelationHandler.handleCache(cacheName, redisson);
				}
				prevValue = map.putIfAbsent(key, value);
			}
			if (prevValue == null) {
				addCachePut();
			}
		}

		return toValueWrapper(prevValue);
	}

	@Override
	public void evict(Object key) {
		if (null != cacheRelationHandler) {
			cacheRelationHandler.handleCache(cacheName, redisson);
		}
		map.fastRemove(key);
	}

	@Override
	public void clear() {
		map.clear();
	}

	private ValueWrapper toValueWrapper(Object value) {
		if (value == null) {
			return null;
		}
		if (value.getClass().getName().equals(NullValue.class.getName())) {
			return NullValue.INSTANCE;
		}
		return new SimpleValueWrapper(value);
	}

	@SuppressWarnings("unchecked")
	public <T> T get(Object key, Callable<T> valueLoader) {
		Object value = map.get(key);
		if (value == null) {
			addCacheMiss();
			RLock lock = map.getLock(key);
			lock.lock();
			try {
				value = map.get(key);
				if (value == null) {
					try {
						value = toStoreValue(valueLoader.call());
					} catch (Throwable ex) {
						RuntimeException exception;
						try {
							Class<?> c = Class.forName("org.springframework.cache.Cache$ValueRetrievalException");
							Constructor<?> constructor = c.getConstructor(Object.class, Callable.class,
									Throwable.class);
							exception = (RuntimeException) constructor.newInstance(key, valueLoader, ex);
						} catch (Exception e) {
							throw new IllegalStateException(e);
						}
						throw exception;
					}
					put(key, value);
				}
			} finally {
				lock.unlock();
			}
		} else {
			addCacheHit();
		}

		return (T) fromStoreValue(value);
	}

	protected Object fromStoreValue(Object storeValue) {
		if (storeValue instanceof NullValue) {
			return null;
		}
		return storeValue;
	}

	protected Object toStoreValue(Object userValue) {
		if (userValue == null) {
			return NullValue.INSTANCE;
		}
		return userValue;
	}

	/**
	 * The number of get requests that were satisfied by the cache.
	 * 
	 * @return the number of hits
	 */
	long getCacheHits() {
		return hits.get();
	}

	/**
	 * A miss is a get request that is not satisfied.
	 * 
	 * @return the number of misses
	 */
	long getCacheMisses() {
		return misses.get();
	}

	long getCachePuts() {
		return puts.get();
	}

	private void addCachePut() {
		puts.incrementAndGet();
	}

	private void addCacheHit() {
		hits.incrementAndGet();
	}

	private void addCacheMiss() {
		misses.incrementAndGet();
	}

}