package com.briup.waimai.web.controller;

import com.briup.waimai.bean.ex.MonitorEX;

import com.briup.waimai.service.IMonitorService;
import com.briup.waimai.util.Message;
import com.briup.waimai.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Monitor")
@Api(description = "订单监控")

public class MonitorController {
    @Autowired
    private IMonitorService iMonitorService;

    @ApiOperation(value = "根据Id监控订单")
    @PostMapping("/selectOrder")
    public Message selectUser(int id){
        List<MonitorEX> list = iMonitorService.selectOrder(id);
        return MessageUtil.success(list);
    }


}
