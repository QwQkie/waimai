package com.briup.waimai.service;

import com.briup.waimai.bean.Comment;
import com.briup.waimai.bean.Menu;
import com.briup.waimai.bean.ex.MenuEX;

import java.util.List;

public interface IMenuService {

  List<Menu> findAll() throws RuntimeException;
    void deleteBatch(int id);
    void saveOrUpdate(Menu menu);
    void deleteById(int id);
//  void add(Menu menu);

    List<Menu> search(String key);
    List<MenuEX> findAllEX();

}
