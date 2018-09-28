package org.mbov.framework.resolver;

import org.springframework.core.MethodParameter;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.method.support.ModelAndViewContainer;

public class ResponseArgumentResolver implements HandlerMethodReturnValueHandler
{

    @Override
    public boolean supportsReturnType(MethodParameter returnType)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void handleReturnValue(Object returnValue, MethodParameter returnType, ModelAndViewContainer mavContainer,
        NativeWebRequest webRequest)
        throws Exception
    {
        // TODO Auto-generated method stub
        
    }
    
}
