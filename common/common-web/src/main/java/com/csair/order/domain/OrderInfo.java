/*
 * 文 件 名:  OrderInfo.java
 * 版    权:  Copyright @ China Southern Airlines Information Center Ltd ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jul 3, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.domain;

import java.util.List;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jul 3, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class OrderInfo
{
    private String orderId;
    
    private String goosType;
    
    private String consignor;
    
    private String orderAmount;
    
    private AwbInfo awbInfo;
    
    private List<FlightInfo> flightInfos;
    
    public String getOrderId()
    {
        return orderId;
    }
    
    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }
    
    public String getGoosType()
    {
        return goosType;
    }
    
    public void setGoosType(String goosType)
    {
        this.goosType = goosType;
    }
    
    public String getConsignor()
    {
        return consignor;
    }
    
    public void setConsignor(String consignor)
    {
        this.consignor = consignor;
    }
    
    public String getOrderAmount()
    {
        return orderAmount;
    }
    
    public void setOrderAmount(String orderAmount)
    {
        this.orderAmount = orderAmount;
    }
    
    public AwbInfo getAwbInfo()
    {
        return awbInfo;
    }
    
    public void setAwbInfo(AwbInfo awbInfo)
    {
        this.awbInfo = awbInfo;
    }
    
    public List<FlightInfo> getFlightInfos()
    {
        return flightInfos;
    }
    
    public void setFlightInfos(List<FlightInfo> flightInfos)
    {
        this.flightInfos = flightInfos;
    }
    
}
