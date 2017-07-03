/*
 * 文 件 名:  OrderQueryInterface.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 28, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csair.order.dto.QueryParam;
import com.csair.order.service.OrderService;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 28, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Controller
@RequestMapping("orderInterface")
public class OrderQueryInterface
{
    @Autowired
    private OrderService orderService;
    
    @RequestMapping("/list")
    @ResponseBody
    public Object orderList()
    {
        return orderService.getOrderInfoList();
    }
    
    public Object orderDetail(QueryParam queryParam)
    {
        return orderService.getOrderDetailInfo(queryParam.getOrderNo(),
            queryParam.getChangeOrderNo(),
            queryParam.getAwbPrefix(),
            queryParam.getAwbNo(),
            queryParam.getAwbPostFix());
    }
}
