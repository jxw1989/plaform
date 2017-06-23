/*
 * 文 件 名:  CommonRuntimeException.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 22, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.common.exception;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 22, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public abstract class AppException extends RuntimeException
{
    private static final long serialVersionUID = 3477129101766155300L;
    
    /**
     * <默认构造函数>
     */
    public AppException(String msg)
    {
        super(msg);
    }
    
    public AppException(String msg, Throwable e)
    {
        super(msg, e);
    }
    
    @Override
    public String getMessage()
    {
        return "";
    }
    
    public Throwable getRootCause()
    {
        Throwable rootCause = null;
        for (Throwable cause = this.getCause(); cause != null && cause != rootCause; cause = cause.getCause())
        {
            rootCause = cause;
        }
        return rootCause;
    }
}
