/*
 * 文 件 名:  StaffInfo.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 15, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.user.domain;

import java.util.Date;

import com.csair.common.base.BaseObject;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 15, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class StaffInfo extends BaseObject
{
    /**
     * 注释内容
     */
    private static final long serialVersionUID = 7813845247687683052L;
    
    private String staffNo;
    
    private String staffName;
    
    private String sex;
    
    private Date birthday;
    
    private String dept;
    
    private String position;
    
    private String positionDesc;
    
    private String officePhone;
    
    private String officeAddr;
    
    private String mobile;
    
    private String homePhone;
    
    private String homeAddr;
    
    private String email;
    
    public String getStaffNo()
    {
        return staffNo;
    }
    
    public void setStaffNo(String staffNo)
    {
        this.staffNo = staffNo;
    }
    
    public String getStaffName()
    {
        return staffName;
    }
    
    public void setStaffName(String staffName)
    {
        this.staffName = staffName;
    }
    
    public String getSex()
    {
        return sex;
    }
    
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    
    public Date getBirthday()
    {
        return birthday;
    }
    
    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }
    
    public String getDept()
    {
        return dept;
    }
    
    public void setDept(String dept)
    {
        this.dept = dept;
    }
    
    public String getPosition()
    {
        return position;
    }
    
    public void setPosition(String position)
    {
        this.position = position;
    }
    
    public String getPositionDesc()
    {
        return positionDesc;
    }
    
    public void setPositionDesc(String positionDesc)
    {
        this.positionDesc = positionDesc;
    }
    
    public String getOfficePhone()
    {
        return officePhone;
    }
    
    public void setOfficePhone(String officePhone)
    {
        this.officePhone = officePhone;
    }
    
    public String getOfficeAddr()
    {
        return officeAddr;
    }
    
    public void setOfficeAddr(String officeAddr)
    {
        this.officeAddr = officeAddr;
    }
    
    public String getMobile()
    {
        return mobile;
    }
    
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }
    
    public String getHomePhone()
    {
        return homePhone;
    }
    
    public void setHomePhone(String homePhone)
    {
        this.homePhone = homePhone;
    }
    
    public String getHomeAddr()
    {
        return homeAddr;
    }
    
    public void setHomeAddr(String homeAddr)
    {
        this.homeAddr = homeAddr;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
}
