package com.briup.waimai.web.controller;

import com.briup.waimai.bean.ex.OderEX;
import com.briup.waimai.service.IMapService;
import com.briup.waimai.service.IOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Controller
//@RestController
@RequestMapping("/GetTest")
@Api(description = "定位管理")
public class MapController {
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private IMapService mapService;

    //@ResponseBody
    @ApiOperation(value = "根据订单ID去确定用户地址的所在位置")
   @RequestMapping(value="/getTest",method= RequestMethod.GET)
    public String method(Model m,int id) {
        OderEX oderEX = iOrderService.selectUser1(id);
        String ads = oderEX.getAddress();
       Map<String, BigDecimal> map = mapService.getLatAndLngByAddress(ads);
       String a = map.get("lng").toString();
       String b = map.get("lat").toString();
       m.addAttribute("a", a);
       m.addAttribute("b", b);
        return "test";
    }
}
