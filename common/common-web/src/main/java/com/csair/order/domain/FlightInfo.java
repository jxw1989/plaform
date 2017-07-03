/*
 * 文 件 名:  FlightInfo.java
 * 版    权:  Copyright @ China Southern Airlines Information Center Ltd ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jul 3, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jul 3, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class FlightInfo
{
    private String orderId;
    
    private String flightNo;
    
    @JSONField(format = "yyyyMMdd")
    private Date flightDate;
    
    private String dep;
    
    private String des;
    
    @JSONField(format = "HH:mm")
    private Date depTime;
    
    @JSONField(format = "HH:mm")
    private Date desTime;
    
    public String getOrderId()
    {
        return orderId;
    }
    
    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }
    
    public String getFlightNo()
    {
        return flightNo;
    }
    
    public void setFlightNo(String flightNo)
    {
        this.flightNo = flightNo;
    }
    
    public Date getFlightDate()
    {
        return flightDate;
    }
    
    public void setFlightDate(Date flightDate)
    {
        this.flightDate = flightDate;
    }
    
    public String getDep()
    {
        return dep;
    }
    
    public void setDep(String dep)
    {
        this.dep = dep;
    }
    
    public String getDes()
    {
        return des;
    }
    
    public void setDes(String des)
    {
        this.des = des;
    }
    
    public Date getDepTime()
    {
        return depTime;
    }
    
    public void setDepTime(Date depTime)
    {
        this.depTime = depTime;
    }
    
    public Date getDesTime()
    {
        return desTime;
    }
    
    public void setDesTime(Date desTime)
    {
        this.desTime = desTime;
    }
    
}
