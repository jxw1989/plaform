/*
 * 文 件 名:  QueryParam.java
 * 版    权:  Copyright @ China Southern Airlines Information Center Ltd ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 29, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.dto;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 29, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class QueryParam
{
    private String orderNo;
    
    private String changeOrderNo;
    
    private String awboPrefix;
    
    private String awbNo;
    
    private String awbPostfix;
    
    public String getOrderNo()
    {
        return orderNo;
    }
    
    public void setOrderNo(String orderNo)
    {
        this.orderNo = orderNo;
    }
    
    public String getChangeOrderNo()
    {
        return changeOrderNo;
    }
    
    public void setChangeOrderNo(String changeOrderNo)
    {
        this.changeOrderNo = changeOrderNo;
    }
    
    public String getAwbNo()
    {
        return awbNo;
    }
    
    public void setAwbNo(String awbNo)
    {
        this.awbNo = awbNo;
    }
    
    public String getAwboPrefix()
    {
        return awboPrefix;
    }
    
    public void setAwboPrefix(String awboPrefix)
    {
        this.awboPrefix = awboPrefix;
    }
    
    public String getAwbPostfix()
    {
        return awbPostfix;
    }
    
    public void setAwbPostfix(String awbPostfix)
    {
        this.awbPostfix = awbPostfix;
    }
    
}
