package com.briup.waimai.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.briup.waimai.bean.ex.OderEX;
import com.briup.waimai.service.IOrderService;
import com.briup.waimai.util.Message;
import com.briup.waimai.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

@Controller
//@RestController
@RequestMapping("/GetTest")
public class MapController {
    @Autowired
    private IOrderService iOrderService;
    public Map<String, BigDecimal> getLatAndLngByAddress(String addr) {
        String address = "北京市天安门";
        try {
            address = java.net.URLEncoder.encode(addr,"UTF-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        String url = String.format("http://api.map.baidu.com/place/v2/search?"
                +"ak=S8ebG9IGOxiZvyujaWYUIqYV8Tpx5yA9&output=json&query=%s&region=全国",address);
        URL myURL = null;
        URLConnection httpsConn = null;
        //进行转码
        try {
            myURL = new URL(url);
        } catch (MalformedURLException e) {

        }
        StringBuffer sb = new StringBuffer();
        try {
            httpsConn = (URLConnection) myURL.openConnection();
            if (httpsConn != null) {
                InputStreamReader insr = new InputStreamReader(
                        httpsConn.getInputStream(), "UTF-8");
                BufferedReader br = new BufferedReader(insr);
                String data = null;
                ByteArrayOutputStream outStream = new ByteArrayOutputStream();;
                while ((data = br.readLine()) != null) {
                    sb.append(data);
                }
                insr.close();
            }
        } catch (IOException e) {

        }
        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
        JSONObject resultJson = JSON.parseObject(sb.toString());
        //resultJson  {"message":"ok","results":[{"uid":"30e1d0bb0c0014f8b6147fe6","name":"攀枝花市","location":{"lng":101.725544,"lat":26.588034}}],"status":0}
        JSONArray jsonArray = (JSONArray)resultJson.get("results");
        JSONObject results0Obj = (JSONObject)jsonArray.get(0);
        JSONObject locationObj = (JSONObject)results0Obj.get("location");
        //纬度
        BigDecimal lat = (BigDecimal)locationObj.get("lat");
        //经度
        BigDecimal lng = (BigDecimal)locationObj.get("lng");
        map.put("lat", lat);
        map.put("lng", lng);
        return map;
    }
    //@ResponseBody
   @RequestMapping(value="/getTest",method= RequestMethod.GET)
    public String method(Model m,int id) {
        OderEX oderEX = iOrderService.selectUser1(id);
        String ads = oderEX.getAddress();
       Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
       map = getLatAndLngByAddress(ads);
       String a = map.get("lng").toString();
       String b = map.get("lat").toString();
       m.addAttribute("a", a);
       m.addAttribute("b", b);
        return "test";
    }
}
