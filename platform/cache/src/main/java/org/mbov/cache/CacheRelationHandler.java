package org.mbov.cache;

import org.redisson.api.RedissonClient;

/**
 * 缓存关系处理器
 * 
 * @author jinxiuwei
 *
 */
public abstract class CacheRelationHandler {

	public abstract void handleCache(String cacheName, RedissonClient redisson);

}
