package com.briup.waimai.web.controller;

import com.briup.waimai.bean.Comment;
import com.briup.waimai.bean.ex.CommentEX;
import com.briup.waimai.bean.ex.MoEX;
import com.briup.waimai.service.ICommentService;
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
@Api(description = "订单评价")
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private ICommentService iCommentService;
    @GetMapping("/find")
    @ApiOperation(value = "查询该用户已完成未评价的订单")
    public Message find(int id){
        List<CommentEX> list = iCommentService.find(id);
        return MessageUtil.success(list);
    }
    @PostMapping("/add")
    @ApiOperation(value = "添加评论")
    public Message add(Comment comment){
        iCommentService.add(comment);
        return MessageUtil.success();
    }
    @GetMapping("/findAll")
    @ApiOperation(value = "查看所有评价")
    public Message findAll(){
        List<CommentEX> all = iCommentService.findAll();
        return MessageUtil.success(all);
    }
}
