package com.csair.login.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csair.login.dto.Shop;


@Controller
@RequestMapping("/kfc/brands")
public class JSONController {

    @RequestMapping(value = "{name}",method = RequestMethod.GET)
    public @ResponseBody Shop getShopInJSON(@PathVariable String name)
    {
        Shop sp = new Shop();
        sp.setName(name);
        sp.setStaffName(new String[]{"Staffname1","Staffname2"});
        return sp;
    }
   
}