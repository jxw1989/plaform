/*
 * 文 件 名:  BaseController.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 28, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.common.base;

import com.csair.common.CodeEnum;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, Jun 28, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public abstract class BaseController
{
    /**
     * ajax失败
     * 
     * @param msg 失败的消息
     * @return {Object}
     */
    public Object renderError(String msg, CodeEnum code)
    {
        JsonResult result = null;
        if (null == code)
        {
            result = new JsonResult(false, CodeEnum.ERROR.getCode(), msg, null, null);
        }
        else
        {
            result = new JsonResult(false, code.getCode(), msg, null, null);
        }
        return result;
    }
    
    /**
     * ajax失败
     * 
     * @param msg 失败的消息
     * @return {Object}
     */
    public Object renderError(String msg)
    {
        return renderError(msg, null);
    }
    
    /**
     * ajax失败
     * 
     * @param msg 失败的消息
     * @return {Object}
     */
    public Object renderError()
    {
        return new JsonResult(false, CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMsg(), null, null);
    }
    
    /**
     * ajax成功
     * 
     * @param msg 消息
     * @return {Object}
     */
    public Object renderSuccess(String msg)
    {
        JsonResult result = new JsonResult(true, CodeEnum.ERROR.getCode(), msg, null, null);
        return result;
    }
    
    /**
     * ajax成功
     * 
     * @param obj 成功时的对象
     * @return {Object}
     */
    public Object renderSuccess(Object obj)
    {
        JsonResult result = new JsonResult(true, CodeEnum.SUCCESS.getCode(), CodeEnum.SUCCESS.getMsg(), null, obj);
        return result;
    }
}
