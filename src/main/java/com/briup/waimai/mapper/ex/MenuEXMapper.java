package com.briup.waimai.mapper.ex;

import com.briup.waimai.bean.Menu;
import com.briup.waimai.bean.ex.MenuEX;

import java.util.List;

public interface MenuEXMapper {
    List<MenuEX> findAll1();
    List<Menu> search(String key);

}
