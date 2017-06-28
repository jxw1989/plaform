/*
 * 文 件 名:  CodeEnum.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 28, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.common;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author jinxiuwei
 * @version [版本号, Jun 28, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public enum CodeEnum
{
    SUCCESS("10000", "成功"), ERROR("99999", "失败");
    private String code;
    
    private String msg;
    
    private CodeEnum(String code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public String getMsg()
    {
        return msg;
    }
    
}
