/*
 * 文 件 名:  Test.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 14, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  Administrator
 * @version  [版本号, Jun 14, 2017]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Test
{
    
    public static void main(String[] args)
    {
        String aa = null;
        try
        {
           File file = new File("ddd");
           FileInputStream fis = new FileInputStream(file);
           fis.read();
        }catch(FileNotFoundException e){
           System.out.println(">>>>>"+e.getMessage()); ;
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

  
    
    
}
