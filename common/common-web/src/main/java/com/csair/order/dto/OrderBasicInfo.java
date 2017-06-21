/*
 * 文 件 名:  OrderBasicInfo.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 21, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.dto;

import java.util.List;

/**
 * <一句话功能简述>订单基本信息实体
 * <功能详细描述>
 * 
 * @author  jinxiuwei
 * @version  [版本号, Jun 21, 2017]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class OrderBasicInfo
{
    private String orderNo;//订单号
    private String awbNo;//运单号
    private List<FlightInfo> flightInfos; 
    private String goodsType;//货物类型
    private String consignor;//交货人
    private String payAmount;//待支付金额
    public String getOrderNo()
    {
        return orderNo;
    }
    public void setOrderNo(String orderNo)
    {
        this.orderNo = orderNo;
    }
    public String getAwbNo()
    {
        return awbNo;
    }
    public void setAwbNo(String awbNo)
    {
        this.awbNo = awbNo;
    }
    public List<FlightInfo> getFlightInfos()
    {
        return flightInfos;
    }
    public void setFlightInfos(List<FlightInfo> flightInfos)
    {
        this.flightInfos = flightInfos;
    }
    public String getGoodsType()
    {
        return goodsType;
    }
    public void setGoodsType(String goodsType)
    {
        this.goodsType = goodsType;
    }
    public String getConsignor()
    {
        return consignor;
    }
    public void setConsignor(String consignor)
    {
        this.consignor = consignor;
    }
    public String getPayAmount()
    {
        return payAmount;
    }
    public void setPayAmount(String payAmount)
    {
        this.payAmount = payAmount;
    }
    
    
    
}
