package com.briup.waimai.web.controller;


import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.briup.waimai.bean.ex.OderEX;
import com.briup.waimai.config.AlipayConfig;
import com.briup.waimai.service.IOrderService;
import com.briup.waimai.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@Api(description = "支付管理")
public class PayController {
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private IUserService iUserService;
    @GetMapping("/pay")
    @ApiOperation(value = "支付")
    @ApiImplicitParam(name = "code",value = "订单编号" ,required = true,paramType = "query",dataType ="string" )
    public void pay( HttpServletResponse response,String code) throws ServletException, IOException {

        try {
            AlipayClient alipayClient =
                    AlipayConfig.getAlipayClient();
            //设置请求参数
            AlipayTradePagePayRequest alipayRequest =
                    new AlipayTradePagePayRequest();

            AlipayTradePayModel model =
                    new AlipayTradePayModel();
            OderEX oderEX = iOrderService.selectByCode(code);

                model.setOutTradeNo(oderEX.getCode());
                model.setTotalAmount(oderEX.getPrice().toString());
                model.setSubject(oderEX.getUsername());


            // 订单描述
            model.setBody(System.currentTimeMillis()+"");

            // 产品码
            model.setProductCode("FAST_INSTANT_TRADE_PAY");

            // 设置参数
            alipayRequest.setBizModel(model);

            // 设置回调地址
            alipayRequest.setReturnUrl(AlipayConfig.return_url);

            String result = alipayClient.pageExecute(alipayRequest).getBody();

            response.setContentType("text/html;charset=utf-8");
            response.getWriter().println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
