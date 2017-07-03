/*
 * 文 件 名:  AwbInfo.java
 * 版    权:  Copyright @ China Southern Airlines Information Center Ltd ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jul 3, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.domain;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jul 3, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class AwbInfo
{
    private String orderId;
    
    private String awboPrefix;
    
    private String awbNo;
    
    private String awbPostfix;
    
    public String getOrderId()
    {
        return orderId;
    }
    
    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }
    
    public String getAwboPrefix()
    {
        return awboPrefix;
    }
    
    public void setAwboPrefix(String awboPrefix)
    {
        this.awboPrefix = awboPrefix;
    }
    
    public String getAwbNo()
    {
        return awbNo;
    }
    
    public void setAwbNo(String awbNo)
    {
        this.awbNo = awbNo;
    }
    
    public String getAwbPostfix()
    {
        return awbPostfix;
    }
    
    public void setAwbPostfix(String awbPostfix)
    {
        this.awbPostfix = awbPostfix;
    }
    
}
