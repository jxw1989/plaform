/*
 * 文 件 名:  OrderInfo.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 9, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.dto;

import java.util.List;

/**
 * <一句话功能简述> <功能详细描述>订单详情实体
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 9, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class OrderDetailInfo
{
    private String orderNo;// 订单号
    
    private String[] awbNo;// 运单号
    
    private String changeOrderNo;// 变更单号
    
    private String cargo;// 货物
    
    private List<FlightInfo> flightInfos;
    
    public String getOrderNo()
    {
        return orderNo;
    }
    
    public void setOrderNo(String orderNo)
    {
        this.orderNo = orderNo;
    }
    
    public String[] getAwbNo()
    {
        return awbNo;
    }
    
    public void setAwbNo(String[] awbNo)
    {
        this.awbNo = awbNo;
    }
    
    public String getChangeOrderNo()
    {
        return changeOrderNo;
    }
    
    public void setChangeOrderNo(String changeOrderNo)
    {
        this.changeOrderNo = changeOrderNo;
    }
    
    public String getCargo()
    {
        return cargo;
    }
    
    public void setCargo(String cargo)
    {
        this.cargo = cargo;
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
