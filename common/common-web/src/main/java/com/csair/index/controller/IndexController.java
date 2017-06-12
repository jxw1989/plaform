/*
 * 文 件 名:  IndexController.java
 * 版    权:  China Southern Airlines Information Center. Copyright ,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  jinxiuwei
 * 修改时间:  Jun 12, 2017
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.csair.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author  jinxiuwei
 * @version  [版本号, Jun 12, 2017]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Controller
@RequestMapping("/")
public class IndexController
{
    @RequestMapping("index")
    public String index()
    {
        return "index";
    }
}
