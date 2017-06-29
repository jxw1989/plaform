/*
 * 文 件 名:  OrderService.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 21, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.service;

import java.util.List;

import com.csair.order.dto.OrderBasicInfo;
import com.csair.order.dto.OrderDetailInfo;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 21, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface OrderService
{
    /**
     * <一句话功能简述>获取待支付订单列表接口 <功能详细描述>
     * 
     * @return
     * @see [类、类#方法、类#成员]
     */
    List<OrderBasicInfo> getOrderInfoList();
    
    /**
     * <一句话功能简述>获取订单详细信息 <功能详细描述>
     * 
     * @param orderNo 订单号
     * @param awbPrefix 运单前缀
     * @param awbNo 运单号
     * @return
     * @see [类、类#方法、类#成员]
     */
    OrderDetailInfo getOrderDetailInfo(String orderNo, String changeOrderNo, String awbPrefix, String awbNo,
        String awbPostFix);
    
}
