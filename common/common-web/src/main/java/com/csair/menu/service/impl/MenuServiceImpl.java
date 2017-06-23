package com.csair.menu.service.impl;

import com.csair.menu.domain.MenuItem;
import com.csair.menu.service.MenuService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinxiuwei on 2017/6/15.
 */
public class MenuServiceImpl implements MenuService {
    @Override
    public List<MenuItem> getMenusByStaffId(String staffId) {
        MenuItem menuItem = new MenuItem();
        menuItem.setMenuId("1");
        menuItem.setMenuName("用户管理");
        menuItem.setPid(null);
        MenuItem menuItem1 = new MenuItem();
        menuItem1.setMenuId("2");
        menuItem1.setMenuName("员工管理");
        menuItem1.setUrl("userManage");
        menuItem1.setPid("1");
        MenuItem menuItem2 = new MenuItem();
        menuItem2.setMenuId("3");
        menuItem2.setMenuName("部门管理");
        menuItem2.setUrl("userManage");
        menuItem2.setPid("1");
        MenuItem menuItem3 = new MenuItem();
        menuItem3.setMenuId("4");
        menuItem3.setMenuName("权限管理");
        menuItem3.setUrl("userManage");
        MenuItem menuItem4 = new MenuItem();
        menuItem4.setMenuId("5");
        menuItem4.setMenuName("权限树管理");
        menuItem4.setUrl("userManage");
        menuItem4.setPid("4");
        List<MenuItem> menuItems = new ArrayList<MenuItem>();
        menuItems.add(menuItem);
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        return menuItems;
    }

    @Override
    public boolean addMenuItem(MenuItem menuItem) {
        return false;
    }

    @Override
    public boolean updateMenuItem(MenuItem menuItem) {
        return false;
    }

    @Override
    public boolean deleteMenuItemByMenuId(String menuId) {
        return false;
    }
}
