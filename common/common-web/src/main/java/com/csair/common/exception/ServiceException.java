/*
 * 文 件 名:  ServiceException.java
 * 版    权:  China Southern Technologies Co., Ltd. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  Administrator
 * 修改时间:  Jun 7, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 7, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ServiceException extends RuntimeException
{
    private Logger logger = LoggerFactory.getLogger("");
    /**
     * 注释内容
     */
    private static final long serialVersionUID = 1232477418148049735L;

    /**
     * <默认构造函数>
     */
    public ServiceException(String message,Throwable e)
    {
        super(message,e);
        logger.debug(e.getMessage());
    }
}
