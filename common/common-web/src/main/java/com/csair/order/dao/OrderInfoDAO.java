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
package com.csair.order.dao;

import java.util.List;

import com.csair.order.domain.OrderBasicInfo;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jul 3, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface OrderInfoDAO
{
   public List<OrderBasicInfo> getOrderBasicInfo();
}
