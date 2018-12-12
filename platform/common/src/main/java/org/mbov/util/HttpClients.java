/*
 * 文 件 名:  HttpUtil.java
 * 版    权:  Copyright © 2017 mbov Orginization  Ltd.All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  2018年12月21日
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package org.mbov.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * <一句话功能简述> <功能详细描述>
 * HTTP,HTTPS客户端类
 * @author jinxiuwei
 * @version [版本号, 2018年12月21日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class HttpClients
{
    
    private HttpClients()
    {
    }
    
    /** <一句话功能简述>
     * <功能详细描述>
     * @param httpMethod http方法
     * @return HTTP（HTTPS）客户端类
     * @see [类、类#方法、类#成员]
     */
    public static CloseableHttpClient create(HttpUriRequest httpMethod)
    {
        if (null != httpMethod && StringUtils.equalsIgnoreCase("https", httpMethod.getURI().getScheme()))
        {
            return HttpClientBuilder.create().setSSLHostnameVerifier(new NoopHostnameVerifier()).build();
        }
        else
        {
            return org.apache.http.impl.client.HttpClients.createDefault();
        }
    }
    
}
