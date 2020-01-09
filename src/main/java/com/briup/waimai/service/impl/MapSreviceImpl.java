package com.briup.waimai.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.briup.waimai.service.IMapService;
import org.springframework.stereotype.Service;

import java.io.*;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MapSreviceImpl implements IMapService {
    @Override
    public Map<String, BigDecimal> getLatAndLngByAddress(String addr) {
        String address = "";
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
}
