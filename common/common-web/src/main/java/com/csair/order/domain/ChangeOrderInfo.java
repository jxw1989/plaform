/*
 * 文 件 名:  ChangeOrderInfo.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 21, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.order.domain;

import java.util.List;

import com.csair.common.base.KeyPair;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 21, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ChangeOrderInfo
{
    
    private String changeOrderNo;// 变更单号
    
    private List<KeyPair> changeContent;// 变更内容
    
    private List<KeyPair> changeExpenses;// 变更费用
    

    public String getChangeOrderNo()
    {
        return changeOrderNo;
    }
    
    public void setChangeOrderNo(String changeOrderNo)
    {
        this.changeOrderNo = changeOrderNo;
    }
    
    public List<KeyPair> getChangeContent()
    {
        return changeContent;
    }
    
    public void setChangeContent(List<KeyPair> changeContent)
    {
        this.changeContent = changeContent;
    }
    
    public List<KeyPair> getChangeExpenses()
    {
        return changeExpenses;
    }
    
    public void setChangeExpenses(List<KeyPair> changeExpenses)
    {
        this.changeExpenses = changeExpenses;
    }
    
}
