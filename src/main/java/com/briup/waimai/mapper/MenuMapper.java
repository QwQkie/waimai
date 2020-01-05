package com.briup.waimai.mapper;

import com.briup.waimai.bean.Menu;
import com.briup.waimai.bean.MenuExample;
import java.util.List;

import com.briup.waimai.bean.ex.MenuEX;
import org.apache.ibatis.annotations.Param;

public interface MenuMapper {
    long countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    void deleteById(int id);


    List<Menu> search(String key);
    Menu findById(int id);

    List<MenuEX> findAll2();
}