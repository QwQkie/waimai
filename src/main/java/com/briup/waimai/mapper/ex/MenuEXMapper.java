package com.briup.waimai.mapper.ex;

import com.briup.waimai.bean.Menu;
import com.briup.waimai.bean.ex.MenuEX;

import java.util.List;

public interface MenuEXMapper {
    List<MenuEX> findAll1();
    void deleteById(int id);


    List<Menu> search(String key);
    Menu findById(int id);

    void deleteByPrimaryKey(int id);

    void updateByPrimaryKey(Menu menu);

    void insert(Menu menu);
    //List<MenuEX> search(String key);
}
