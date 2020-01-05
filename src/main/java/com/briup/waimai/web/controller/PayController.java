package com.briup.waimai.web.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.briup.waimai.config.AlipayConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class PayController {
    @GetMapping("/doget")
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            AlipayClient alipayClient =
                    AlipayConfig.getAlipayClient();
            //设置请求参数
            AlipayTradePagePayRequest alipayRequest =
                    new AlipayTradePagePayRequest();

            AlipayTradePayModel model =
                    new AlipayTradePayModel();

            // 设定订单号 必须要写,且订单号不能重复，目前已经只是做测试，已经写死
            model.setOutTradeNo("9990");

            // 设置订单金额
            model.setTotalAmount("100.00");
            // 订单名字
            model.setSubject("书籍订单");
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
