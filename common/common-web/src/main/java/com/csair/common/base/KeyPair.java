/*
 * 文 件 名:  KeyPair.java
 * 版    权:  Copyright @ China Southern Airlines Information Center Ltd ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jul 3, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.common.base;

/**
 * <一句话功能简述> <功能详细描述>
 * 键值对
 * @author jinxiuwei
 * @version [版本号, Jul 3, 2017]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class KeyPair
{
    private Object keyName;
    
    private Object value;

    public Object getKeyName()
    {
        return keyName;
    }

    public void setKeyName(Object keyName)
    {
        this.keyName = keyName;
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }
    
   
    
}
