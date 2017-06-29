/*
 * 文 件 名:  WebException.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 27, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.common.exception;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 27, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class CommonException extends AppException
{
    /**
     * 注释内容
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * <默认构造函数>
     * 
     * @param msg
     */
    public CommonException(String msg)
    {
        super(msg);
    }
    
    
}
