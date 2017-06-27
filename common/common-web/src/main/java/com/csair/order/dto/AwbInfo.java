/*
 * 文 件 名:  AwbInfo.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 27, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.dto;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 27, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class AwbInfo
{
    private String awbPrefix;// 运单前缀
    
    private String awbNo;// 运单号
    
    private String awbPostfix;// 运单后缀
    
    public AwbInfo(String awbPrefix, String awbNo, String awbPostfix)
    {
        this.awbPrefix = awbPrefix;
        this.awbNo = awbNo;
        this.awbPostfix = awbPostfix;
    }
    
    public String getAwbPrefix()
    {
        return awbPrefix;
    }
    
    public String getAwbNo()
    {
        return awbNo;
    }
    
    public String getAwbPostfix()
    {
        return awbPostfix;
    }
    
}
