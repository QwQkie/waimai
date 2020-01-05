package com.briup.waimai.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;

public class AlipayConfig {
    /**
     * 服务网关   沙箱环境都是这个
     */
    public static String serverUrl = "https://openapi.alipaydev.com/gateway.do";

    /**
     * 应用id  后期可以替换成自己的id
     */
    public static String appId = "2016102100731643";

    /**
     *  用户私钥   后期替换成自己的私钥
     */
    public static String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCPHtybvQClKJA2V0i/Bd5GhN3kxuDd5EfcUj2dDIS5ZCCIogeZAKTGewzmo1uhXV28An13cBU1EOllqk/bvZvkrO4WL8LmNAOU4VXrSCs2iTV1r717DXliRlmTfSGEoVI6b3m5dhVSRaXHP6h91bqabBG1Zn4dowFNhq6EgcE1kjsyowYezW+OvUHM3KUgg18OYVaNDBjCtadYk0USl6tJ62gooHPeBIxymsrw6B167WDJrW6lX4SX7Rjkn4jT/YPQS7CajHHaH5ma2NmeJeQIXcbUv0hVFQJexJwYOn6i8mhkCaOfaWj3lNbzeNBEYYZCIjaGH/H8/RDCfp0RdWkDAgMBAAECggEAG7Xc/uZkRpYI/gx+UEYBmGPHVrFO/odhhn4B4fN3izGgvvOoRu6B+NAAWnOMnTynlmxhAIwZ/xFML1v/ZEtc8LSu0Grk8I9nlh7e9NQfUcrVJ/kj1bxxIR7/3veeUsCtXBUTW15KmIhVpbNkmyCTpayA7T9v8asK6IjIJ228C/P+54mX6R3ul88n6IDUCoD1lYp+xEz8brsjAu3Hq4+3UNpLvocKEMNxhXBaGhcp3GfbLn9x7Gw7RBIqt6TaBgcCF5jUN99+/7729Ub5M2Vc4Esivr1/dHY5TKyBchp6suDsbSj4GbKWo8vjuaOWlDVG1iJ4XveHtfIAH4up7rFBOQKBgQDNHptlhUPM5NIHsZ4KRQl9jwsREMw9e2G/rl8hk26NsK9CSyspAa2IJ3KGgz8LEqIXJ6ppL57cCT9/RMxCmkfNQCzKf3eT0gsdEhqPWMdqEDIi+0GLDz7zBLcGbMSZtYCKkxH/W4dbDoSH/d7GWbx/qWEkgLnn257Kkn8Kgr3adwKBgQCynzoYlgfGa0Kw7HGoIDEl+zWpmPvKqQDeud0XgYNmqSkr4Xo0Aac/L8hN5tNrjI3fkOQLVWOJgIGu+SYEvW5z6bL3cSx+qOAJnNvwCocK9B10zdhm0u0Vm6p7nJKq7/6Uo9khwpaIXVdqJQGsTxQWhs/9WmXN0Vw3BmwLJ/t81QKBgHHYKPuBqY3Q+llW1ZZxlsDfYY8JObJuBmSyzQ3/m/58L+mlesD5s2y8KC5MLfNhViFv3H8g9RS+9UUX1B6rLmrW0YVale2vSIfMAn3JEnTlpE4SEeCyh4et+D9SoxOEz2EaG4UVMdzyA9DOsJR6PcrFIat23re3Bzz7bhNRWTolAoGAXM50Pf/9zC9AuHIxX3xSbPyH1jWhZZvH0vFZGXR2VGnB9YWym8DcJ+1osmkjIjcmI6nBgs376J53QvU6tq3B7MHY9c28o5aUyQnSEHc30Q4jG+Qz8sDW5Co8OvuQDPajHJHBKFRVKEbvOzw9EU0JD+c9u9IzIOwNcJ2Kl4VPmn0CgYEAu/ZVUV/vQft8o7vCCLCPX2cyiv04jRp6a5In5/05iegVP6j3a3Uq+EV/0OoWps4B9bsrJg3xQTwoooti60v5mgoNfvNbNnrXqbSBZ7Z1ghs48h47V4uPmNr00o+iMq5Zc6ZNWqgYQIc9kmJsJaOqVj6q3NK+SVyN+kFwyVxVVPg=";
    /**
     *  发送数据的格式 目前只能为json
     */
    public static String format = "json";

    /**
     *  设置字符集编码 目前只能为utf-8
     */
    public static String charset = "utf-8";

    /**
     *  支付宝公钥 后期替换成自己的支付宝公钥
     */
    public static String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjx7cm70ApSiQNldIvwXeRoTd5Mbg3eRH3FI9nQyEuWQgiKIHmQCkxnsM5qNboV1dvAJ9d3AVNRDpZapP272b5KzuFi/C5jQDlOFV60grNok1da+9ew15YkZZk30hhKFSOm95uXYVUkWlxz+ofdW6mmwRtWZ+HaMBTYauhIHBNZI7MqMGHs1vjr1BzNylIINfDmFWjQwYwrWnWJNFEperSetoKKBz3gSMcprK8Ogdeu1gya1upV+El+0Y5J+I0/2D0Euwmoxx2h+ZmtjZniXkCF3G1L9IVRUCXsScGDp+ovJoZAmjn2lo95TW83jQRGGGQiI2hh/x/P0Qwn6dEXVpAwIDAQAB";

    /**
     *  支付宝签名 目前是 RSA2
     */
    public static String signType = "RSA2";

    /**
     *  页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
     */
    public static String return_url = "http://localhost:8081/estore/index.jsp";

    public static AlipayClient getAlipayClient() {
        // 获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.serverUrl, AlipayConfig.appId, AlipayConfig.privateKey, AlipayConfig.format, AlipayConfig.charset, AlipayConfig.publicKey, AlipayConfig.signType);
        return alipayClient;
    }

}
