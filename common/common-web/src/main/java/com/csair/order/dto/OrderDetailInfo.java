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

import com.csair.order.domain.AwbInfo;
import com.csair.order.domain.CargoInfo;
import com.csair.order.domain.ChangeOrderInfo;
import com.csair.order.domain.FlightInfo;

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
    private String billNo;// 支付流水号
    
    private String orderNo;// 订单号
    
    private List<AwbInfo> awbInfos;
    
    private ChangeOrderInfo changeOrderInfo;// 变更信息
    
    private CargoInfo cargoInfo;// 货物
    
    private List<FlightInfo> flightInfos;
    
    public String getBillNo()
    {
        return billNo;
    }
    
    public void setBillNo(String billNo)
    {
        this.billNo = billNo;
    }
    
    public String getOrderNo()
    {
        return orderNo;
    }
    
    public void setOrderNo(String orderNo)
    {
        this.orderNo = orderNo;
    }
    
    public List<AwbInfo> getAwbInfos()
    {
        return awbInfos;
    }
    
    public void setAwbInfos(List<AwbInfo> awbInfos)
    {
        this.awbInfos = awbInfos;
    }
    
    public ChangeOrderInfo getChangeOrderInfo()
    {
        return changeOrderInfo;
    }
    
    public void setChangeOrderInfo(ChangeOrderInfo changeOrderInfo)
    {
        this.changeOrderInfo = changeOrderInfo;
    }
    
    public CargoInfo getCargoInfo()
    {
        return cargoInfo;
    }
    
    public void setCargoInfo(CargoInfo cargoInfo)
    {
        this.cargoInfo = cargoInfo;
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
