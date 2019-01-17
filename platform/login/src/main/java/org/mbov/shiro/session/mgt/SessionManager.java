/*
 * 文 件 名:  SessionManager.java
 * 版    权:  Copyright © 2017 mbov Orginization  Ltd.All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  2019年1月29日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package org.mbov.shiro.session.mgt;

import java.util.Collection;
import java.util.Date;

import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionException;
import org.apache.shiro.session.mgt.DefaultSessionKey;
import org.apache.shiro.session.mgt.DelegatingSession;
import org.apache.shiro.session.mgt.NativeSessionManager;
import org.apache.shiro.session.mgt.SessionContext;
import org.apache.shiro.session.mgt.SessionFactory;
import org.apache.shiro.session.mgt.SessionKey;
import org.apache.shiro.session.mgt.SimpleSessionFactory;
import org.apache.shiro.web.servlet.Cookie;
import org.apache.shiro.web.servlet.ShiroHttpSession;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.WebSessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, 2019年1月29日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class SessionManager implements NativeSessionManager,WebSessionManager
{
    
    private static final Logger log = LoggerFactory.getLogger(SessionManager.class);
    
    private boolean deleteInvalidSessions;// 是否清理过期session
    
    private Cookie sessionIdCookie;
    
    private boolean sessionIdCookieEnabled;
    
    private boolean sessionIdUrlRewritingEnabled;
    
    private SessionFactory sessionFactory;
    
    /**
     * <默认构造函数>
     */
    public SessionManager()
    {
        Cookie cookie = new SimpleCookie(ShiroHttpSession.DEFAULT_SESSION_ID_NAME);
        cookie.setHttpOnly(true); // more secure, protects against XSS attacks
        this.sessionIdCookie = cookie;
        this.sessionIdCookieEnabled = true;
        this.sessionIdUrlRewritingEnabled = true;
        this.sessionFactory = new SimpleSessionFactory();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Session start(SessionContext context)
    {
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Session getSession(SessionKey key)
        throws SessionException
    {
        Session s = retrieveSessionFromDataSource(key);
        return s != null ? new DelegatingSession(this, new DefaultSessionKey(s.getId())) : null;
    }
    
    /**
     * <一句话功能简述> 首先从cookies或者http请求header中获取sessionId或者token，然后通过获取的sessionId读取缓存中的session信息 <功能详细描述>获取session
     * 
     * @param key
     * @return
     * @see [类、类#方法、类#成员]
     */
    private Session retrieveSessionFromDataSource(SessionKey key)
    {
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Date getStartTimestamp(SessionKey key)
    {
        return getSession(key).getStartTimestamp();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Date getLastAccessTime(SessionKey key)
    {
        return getSession(key).getLastAccessTime();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public boolean isValid(SessionKey key)
    {
        checkValid(key);
        return true;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void checkValid(SessionKey key)
        throws InvalidSessionException
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public long getTimeout(SessionKey key)
        throws InvalidSessionException
    {
        return getSession(key).getTimeout();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void setTimeout(SessionKey key, long maxIdleTimeInMillis)
        throws InvalidSessionException
    {
        getSession(key).setTimeout(maxIdleTimeInMillis);
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void touch(SessionKey key)
        throws InvalidSessionException
    {
        Session s = getSession(key);
        s.touch();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public String getHost(SessionKey key)
    {
        return getSession(key).getHost();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void stop(SessionKey key)
        throws InvalidSessionException
    {
        getSession(key).stop();
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Collection<Object> getAttributeKeys(SessionKey sessionKey)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Object getAttribute(SessionKey sessionKey, Object attributeKey)
        throws InvalidSessionException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    /** {@inheritDoc} */
    
    @Override
    public void setAttribute(SessionKey sessionKey, Object attributeKey, Object value)
        throws InvalidSessionException
    {
        // TODO Auto-generated method stub
        
    }
    
    /** {@inheritDoc} */
    
    @Override
    public Object removeAttribute(SessionKey sessionKey, Object attributeKey)
        throws InvalidSessionException
    {
        // TODO Auto-generated method stub
        return null;
    }

    /** {@inheritDoc} */
     
    @Override
    public boolean isServletContainerSessions()
    {
        return true;
    }
    
}
