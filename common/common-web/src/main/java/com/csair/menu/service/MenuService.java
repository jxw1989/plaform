package com.csair.menu.service;

import com.csair.menu.domain.MenuItem;

import java.util.List;

/**
 * Created by jinxiuwei on 2017/6/15.
 */
public interface MenuService {
    public List<MenuItem> getMenusByStaffId(String staffId);
    public boolean addMenuItem(MenuItem menuItem);
    public boolean updateMenuItem(MenuItem menuItem);
    public boolean deleteMenuItemByMenuId(String menuId);
}
