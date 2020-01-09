package com.briup.waimai.web.controller;

import com.briup.waimai.bean.Menu;
import com.briup.waimai.bean.ex.MenuEX;
import com.briup.waimai.mapper.MenuMapper;
import com.briup.waimai.service.IMenuService;
import com.briup.waimai.util.Message;
import com.briup.waimai.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
@Api(description = "菜单管理")
public class MenuController {

    @Autowired
    private IMenuService menuService;


//@GetMapping("/select")
//@ApiOperation(value = "查询所有")
//    public Message selectAll(){
//    List<Menu> menus = menuService.findAll();
//        return MessageUtil.success(menus);
//    }


    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")

    public Message<Object> deleteBatch(int[] ids) {

        for (int id : ids) {
            menuService.deleteById(id);
            System.out.println(id);
        }

        return MessageUtil.success();
    }
    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "更新")
    public Message addCourse(Menu menu) {

        menuService.saveOrUpdate(menu);

        return MessageUtil.success();
    }
    @GetMapping("select")
    @ApiOperation(value = "查询")
    public  Message selectAll1(){
        List<MenuEX> list = menuService.findAllEX();
        return MessageUtil.success(list);
    }
    @GetMapping("search")
    @ApiOperation(value ="关键字查询" )
    public Message search(String key){
        MenuMapper menuEXService;
        List<Menu> list=menuService.search(key);
        return MessageUtil.success(list);
    }
//    @PostMapping("/add")
//    @ApiOperation(value = "添加")
//    public Message add(Menu menu){
//        menuService.add(menu);
//        return MessageUtil.success();
//
//    }

}