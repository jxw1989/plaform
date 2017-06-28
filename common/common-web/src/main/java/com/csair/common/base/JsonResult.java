package com.csair.common.base;

/**
 * Created by jinxiuwei on 2017/6/14.
 */
public class JsonResult
{
    /**
     * 请求结果状态
     */
    private boolean success = true;
    
    /**
     * 状态码
     */
    private String errorCode;
    
    /**
     * 异常信息
     */
    private String exceptionMessage;
    
    /**
     * 异常堆栈信息
     */
    private String exceptionStack;
    
    /**
     * 正常结果返回对象
     */
    private Object returnObject = null;
    
    /**
     * <默认构造函数>
     * 
     * @param success 返回是否成功
     * @param errorCode 错误码
     * @param exceptionMessage 异常信息
     * @param exceptionStack 异常堆栈信息
     * @param returnObject 正常返回结果
     */
    public JsonResult(boolean success, String errorCode, String exceptionMessage, String exceptionStack,
        Object returnObject)
    {
        this.success = success;
        this.errorCode = errorCode;
        this.exceptionMessage = exceptionMessage;
        this.exceptionStack = exceptionStack;
        this.returnObject = returnObject;
    }
    
    public JsonResult(Object returnObject)
    {
        super();
        this.returnObject = returnObject;
    }
    
    public boolean isSuccess()
    {
        return success;
    }
    
    public void setSuccess(boolean success)
    {
        this.success = success;
    }
    
    public String getErrorCode()
    {
        return errorCode;
    }
    
    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }
    
    public String getExceptionMessage()
    {
        return exceptionMessage;
    }
    
    public void setExceptionMessage(String exceptionMessage)
    {
        this.exceptionMessage = exceptionMessage;
    }
    
    public String getExceptionStack()
    {
        return exceptionStack;
    }
    
    public void setExceptionStack(String exceptionStack)
    {
        this.exceptionStack = exceptionStack;
    }
    
    public Object getReturnObject()
    {
        return returnObject;
    }
    
    public void setReturnObject(Object returnObject)
    {
        this.returnObject = returnObject;
    }
}
