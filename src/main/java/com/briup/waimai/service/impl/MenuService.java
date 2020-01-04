package com.briup.waimai.service.impl;

import com.briup.waimai.bean.Menu;
import com.briup.waimai.bean.MenuExample;
import com.briup.waimai.bean.ex.MenuEX;
import com.briup.waimai.mapper.MenuMapper;
import com.briup.waimai.mapper.ex.MenuEXMapper;
import com.briup.waimai.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuService implements IMenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private MenuEXMapper menuEXMapper;

    @Override
    public List<Menu> findAll() throws RuntimeException {

        MenuExample example = new MenuExample();
        List<Menu> menus = menuMapper.selectByExample(example);
        return menus;


    }

    @Override
    public void deleteBatch(int id) {
        menuMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Menu menu) {
        if (menu == null) {
            throw new RuntimeException("参数为空");
        }
        if (menu.getId() == null) {
            menuMapper.insert(menu);

        } else {
            menuMapper.updateByPrimaryKey(menu);

        }


    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        menuMapper.deleteByPrimaryKey(id);
    }



    @Override
    public List<Menu> search(String key) throws  RuntimeException {

        key = key == null ? "" : key;
        if (key == null && "".equals(key)) {
            return findAll();
        } else {
            key = "%" + key + "%";
            return menuMapper.search(key);

        }


    }

    @Override
    public List<MenuEX> findAllEX() throws  RuntimeException {
        List<MenuEX> list = menuEXMapper.findAll1();
        return list;
    }
}


