package com.briup.waimai.web.controller;

import com.briup.waimai.bean.User;
import com.briup.waimai.service.IUserService;
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
@RequestMapping("/user")
@Api(description = "用户管理")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有用户")
    public Message findAll(){
        List<User> userList = iUserService.findAll();
        return MessageUtil.success(userList);
    }
    @PostMapping("/add")
    @ApiOperation(value = "添加用户")
    public Message add(User user){
        iUserService.saveOrUpdate(user);
        return MessageUtil.success();
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改用户")
    public Message update(User user){
        iUserService.saveOrUpdate(user);
        return MessageUtil.success();
    }
    @GetMapping("/deleteById")
    @ApiOperation(value = "删除用户")
    @ApiImplicitParam(name = "id" ,value = "用户id",paramType = "query",dataType = "int",required = true)
    public Message deleteById(int id){
        iUserService.deleteById(id);
        return MessageUtil.success();
    }
    @GetMapping("/deleteBush")
    @ApiOperation(value = "批量删除")
    public Message deleteBush(int[] ids){
        for (int id : ids) {
            iUserService.deleteById(id);
        }
        return MessageUtil.success();
    }
    @GetMapping("/search")
    @ApiOperation(value = "搜索")
    public Message search(String word){
        List<User> search = iUserService.search(word);
        return MessageUtil.success(search);
    }

}
