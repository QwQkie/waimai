package com.briup.waimai.web.controller;

import com.briup.waimai.bean.Oder;
import com.briup.waimai.bean.ex.OderEX;
import com.briup.waimai.service.IOrderService;
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
@RequestMapping("/Order")
@Api(description = "订单管理")
public class OrderController {
    @Autowired
    private IOrderService orderService;
    @ApiOperation(value = "查询所有订单")
    @GetMapping("/All")
    public Message findAll(){
        List<Oder> list = orderService.selectAll();
        return MessageUtil.success(list);
    }
    @ApiOperation(value = "添加订单")
    @PostMapping("/insert")
    public Message insert(Oder oder){
        orderService.insert(oder);
        return MessageUtil.success();
    }

    @ApiOperation(value = "批量删除订单")
    @GetMapping("/deleteBush")
    public Message deleteBush(int[] ids){
        for (int id : ids){
            orderService.deleteById(id);
        }
        return MessageUtil.success();
    }
    @ApiOperation(value = "修改订单")
    @PostMapping("/update")
    public Message updateById(Oder oder){
        orderService.updateById(oder);
        return MessageUtil.success();
    }
    @ApiOperation(value = "根据用户ID查询订单")
    @PostMapping("/selectUser")
    public Message selectUser(int id){
       List<OderEX> list = orderService.selectUser(id);
       return MessageUtil.success(list);
    }

}
