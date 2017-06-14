/*
 * 文 件 名:  BaseObject.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 14, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.common.base;

import java.io.Serializable;
import java.util.Date;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 14, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class BaseObject implements Serializable
{
    /**
     * 注释内容
     */
    private static final long serialVersionUID = -3741111536293914233L;

    private String createId;
    
    private Date createDate;
    
    private String updateId;
    
    private Date updateDate;
    
    public String getCreateId()
    {
        return createId;
    }
    
    public void setCreateId(String createId)
    {
        this.createId = createId;
    }
    
    public Date getCreateDate()
    {
        return createDate;
    }
    
    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }
    
    public String getUpdateId()
    {
        return updateId;
    }
    
    public void setUpdateId(String updateId)
    {
        this.updateId = updateId;
    }
    
    public Date getUpdateDate()
    {
        return updateDate;
    }
    
    public void setUpdateDate(Date updateDate)
    {
        this.updateDate = updateDate;
    }
    
}
