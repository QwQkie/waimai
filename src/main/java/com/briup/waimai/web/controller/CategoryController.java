package com.briup.waimai.web.controller;


import com.briup.waimai.bean.Category;
import com.briup.waimai.bean.Poster;
import com.briup.waimai.bean.ex.CategoryEX;
import com.briup.waimai.service.ICategoryService;
import com.briup.waimai.util.Message;
import com.briup.waimai.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@Api(description = "菜系管理")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("/selectAll")
    @ApiOperation(value = "查询所有菜系")
    public Message selectAll() {
        List<CategoryEX> categories = iCategoryService.findAll();
        return MessageUtil.success(categories);
    }

    @ApiOperation(value = "添加菜系")
    @PostMapping("/insert")
    public Message insert(Category category){
        iCategoryService.insert(category);
        return MessageUtil.success();
    }
    @GetMapping("/delete")
    @ApiOperation(value = "根据id删除菜系")
    @ApiImplicitParam(name = "id" ,value = "菜系id",paramType = "query",dataType = "int",required = true)
    public Message delete(int id){
      iCategoryService.delete(id);
        return MessageUtil.success();
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改菜系")
    public Message update(Category category){
        iCategoryService.addOrUpdate(category);
        return MessageUtil.success();
    }

    @GetMapping("/search")
    @ApiOperation(value ="根据关键字搜索菜系" )
    public Message search(String key){
        List<CategoryEX> list=iCategoryService.search(key);
        return MessageUtil.success(list);
    }
    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")
    public Message deleteBatch(int[] ids ){
        for (int id : ids){
           iCategoryService.delete(id);
        }
        return MessageUtil.success();
    }

}
