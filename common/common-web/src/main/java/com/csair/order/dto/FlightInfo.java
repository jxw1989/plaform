/*
 * 文 件 名:  FlightInfo.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 9, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.dto;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 9, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class FlightInfo
{
    private String flightNo;//航班号
    
    private String dep;// 起点
    
    private String des;// 终点
    
    @JSONField(format = "yyyyMMdd")
    private Date flightDate;// 航班日期
    
    public String getFlightNo()
    {
        return flightNo;
    }
    
    public void setFlightNo(String flightNo)
    {
        this.flightNo = flightNo;
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
    
    public Date getFlightDate()
    {
        return flightDate;
    }
    
    public void setFlightDate(Date flightDate)
    {
        this.flightDate = flightDate;
    }
    
}
