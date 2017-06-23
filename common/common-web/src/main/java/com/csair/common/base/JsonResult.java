package com.csair.common.base;

/**
 * Created by jinxiuwei on 2017/6/14.
 */
public class JsonResult
{
    private boolean success = true;
    
    private String errorCode;
    
    private String exceptionMessage;
    
    private String exceptionStack;
    
    private Object returnObject = null;
    
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
