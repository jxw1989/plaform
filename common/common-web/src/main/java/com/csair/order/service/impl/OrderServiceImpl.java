/*
 * 文 件 名:  OrderServiceImpl.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 21, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.csair.order.dto.OrderBasicInfo;
import com.csair.order.dto.OrderDetailInfo;
import com.csair.order.service.OrderService;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 21, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService
{
    
    @Override
    public List<OrderBasicInfo> getOrderInfoList()
    {
        return null;
    }
    
    @Override
    public OrderDetailInfo getOrderDetailInfo(String orderNo, String changeOrderNo, String awbPrefix, String awbNo,
        String awbPostFix)
    {
        return null;
    }
    
}
