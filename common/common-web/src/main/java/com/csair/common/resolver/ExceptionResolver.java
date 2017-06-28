package com.csair.common.resolver;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import com.csair.common.base.JsonResult;
import com.csair.common.exception.AppException;

/**
 * Created by jinixuwei on 2017/6/14.
 */
public class ExceptionResolver implements HandlerExceptionResolver
{
    private Log logger;
    
    @SuppressWarnings("unchecked")
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
        Object o, Exception e)
    {
        
        // 判断是否ajax请求
        if (!(httpServletRequest.getHeader("accept").indexOf("application/json") > -1
            || (httpServletRequest.getHeader("X-Requested-With") != null
                && httpServletRequest.getHeader("X-Requested-With").indexOf("XMLHttpRequest") > -1)))
        {
            // 如果不是ajax，JSP格式返回
            // 为安全起见，只有业务异常我们对前端可见，否则否则统一归为系统异常
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("success", false);
            if (e instanceof AppException)
            {
                map.put("errorMsg", e.getMessage());
            }
            else
            {
                map.put("errorMsg", "系统异常！");
            }
            // 这里需要手动将异常打印出来，由于没有配置log，实际生产环境应该打印到log里面
            e.printStackTrace();
            // 对于非ajax请求，我们都统一跳转到error.jsp页面
            return new ModelAndView("/error", map);
        }
        else
        {
            // 如果是ajax请求，JSON格式返回
            httpServletResponse.setContentType("application/json;charset=UTF-8");
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("success", false);
            // 为安全起见，只有业务异常我们对前端可见，否则统一归为系统异常
            if (e instanceof AppException)
            {
                map.put("errorMsg", e.getMessage());
            }
            else
            {
                map.put("errorMsg", "系统异常！");
            }
            JsonResult jsonResult = new JsonResult(true, "", e.getMessage(), getExceptionMsg(e), null);
            return new ModelAndView(new FastJsonJsonView(), BeanMap.create(jsonResult));
        }
    }
    
    private String getExceptionMsg(Exception e)
    {
        if (e instanceof AppException)
        {
            return e.getMessage();
        }
        else if (e instanceof AppException)
        {
            return e.getMessage();
        }
        else
        {
            logger.error(e.getStackTrace());
            return "未知异常";
        }
    }
}
