/*
 * 文 件 名:  BeanArgumentResolver.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 14, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.common.resolver;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

import com.csair.common.base.BaseObject;

/**
 * <一句话功能简述> <功能详细描述> 封装当前登录人信息至DTO对象中
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 14, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class BeanArgumentResolver implements WebArgumentResolver
{
    
    /** {@inheritDoc} */
    
    @Override
    public Object resolveArgument(MethodParameter methodParameter, NativeWebRequest webRequest)
        throws Exception
    {
        if (methodParameter.getParameterType() != null)
        {
            Object obj = methodParameter.getParameterType().newInstance();
            if (obj instanceof BaseObject)
            {
                HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
                String userId = (String)request.getSession().getAttribute("CURRENT_USER");
                ((BaseObject)obj).setCreateDate(new Date());
                ((BaseObject)obj).setUpdateDate(new Date());
                ((BaseObject)obj).setCreateId(userId);
                ((BaseObject)obj).setUpdateId(userId);
                return obj;
            }
        }
        return WebArgumentResolver.UNRESOLVED;
    }
    
}
