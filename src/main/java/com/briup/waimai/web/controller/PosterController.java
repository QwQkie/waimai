package com.briup.waimai.web.controller;

import com.briup.waimai.bean.Category;
import com.briup.waimai.bean.Oder;
import com.briup.waimai.bean.Poster;
import com.briup.waimai.bean.ex.CategoryEX;
import com.briup.waimai.bean.ex.PosterEX;
import com.briup.waimai.service.ICategoryService;
import com.briup.waimai.service.IPosterService;
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
@RequestMapping("/poster")
@Api(description = "骑手管理")

public class PosterController {
    @Autowired
    private IPosterService iPosterService;

    @GetMapping("/selectAll")
    @ApiOperation(value = "查询所有")
    public Message selectAll() {
        List<PosterEX> posters =iPosterService.findAll();
        return MessageUtil.success(posters);
    }

    @ApiOperation(value = "添加骑手")
    @PostMapping("/insert")
    public Message insert(Poster poster){
        iPosterService.insert(poster);
        return MessageUtil.success();
    }
//    @GetMapping("/delete")
//    @ApiOperation(value = "根据id删除")
//    @ApiImplicitParam(name = "id" ,value = "骑手id",paramType = "query",dataType = "int",required = true)
    public Message delete(int id){
        iPosterService.delete(id);
        return MessageUtil.success();
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改")
    public Message update(Poster poster){
        iPosterService.addOrUpdate(poster);
        return MessageUtil.success();
    }

    @GetMapping("/search")
    @ApiOperation(value ="搜索骑手" )
    public Message search(int id){
       Poster list=iPosterService.search(id);
        return MessageUtil.success(list);
    }

    @GetMapping("/searchposter")
    @ApiOperation(value = "根据订单id查询poster")
    public Message findpp(int id){
        List<Poster> list = iPosterService.findpp(id);
        return MessageUtil.success(list);
    }
}
