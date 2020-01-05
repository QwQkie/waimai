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
    public static String appId = "2016080700191109";

    /**
     *  用户私钥   后期替换成自己的私钥
     */
    public static String privateKey = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCJX+FGCZpSS/eCp7Vy2yZENg5mpOSpWLIoWBXLK1aAZI4+dyMSVPV3a/w+cTXEpcqx+xYJkMIM2d6MdzCbdpRTXWZF9yrOH8E8mGCbpMAEo0m3KM35TERI3n627uzZFue71UyQjLOKEpkmp7wTZxWkWmdunyrTB1z1Ou5tHUlRBobyHxD33vNtYPnFCvvy60GJXDIAGi5DJITfARJd6SjlGRejy3Ki2X/NkTVpZPmjA1RGL4ib1jPhoC4Yk/NrAQ9xSNp1ZdaNHs6FErmxZzLqfICdc7jL3fCw/KHY3uRalw91q8TjSYHIenHk+oZRFeaoPgTLeyVf4LRsF/rVu1Q3AgMBAAECggEAOxtb7CyZj6tL9ZV/RsnwLw0rKRLtp8eX8C/mQKKG93tMkKfmGS8g5p85ywwe3FuRWP71vmvgcnMThFCMQ3fD3hKjvJraehHDrPTLLGy4icZQI1SVOxyLjObekos+sTFfx7vA07kWTuQtrSoijB6gezTCqCAn5uCWKJWQnLYrI4cN0jiVkWiYaeTj50PA561VnKaQblr68gd5CQy/COA0fiCxHdMGPCC9rOE97rUMvKelkBHIpgTbBRA7pNjvTYZg2dPk87FkgBKTwXSRe/SYR1TJqM7Y1TgB+6DmFi5luxrz/VPJTI4PxO/jeu0AOeA4iaBddiGY8OSfWw6HyKxI4QKBgQDdYxzUyxGk412JzKg2tXoiBZ7JDcd2hpF26p4etabKBW3A0euRe9AcLswfnw8IBUQckUYWGvkpU0i0dyN+TPaCtKPRR1onn7r7LzlqLEdqVxIICzTAoY3eFs5uLYKuLniUcXHK/p8RPKW+V4PwJMEkMBS64Kpa5GsmGwQWW6bPjwKBgQCe2jZwczJH/39hjUwN2zVo/1XLYx8oRDlUXSykegT8h9mJyGCBYV4FrXyz4vdeDetbJwAQlS+cfLMXK/4VTAlducmGZX61SYdOdbZG0WJYmbBLhtIHXMOrXPItJB6/+QSmoLn2HQgqLXPGGhr9m4EYl0ZUoCShtvJQBZlJYmJc2QKBgC44ykU3XKize80QeLJrc2N1DvDlOpbpg6dzVq4MuRUGyyJt8aP/WLT5pE6Z0/aVuuHIBv0Ihqr1I4HiOfvdr74cXvOL1SvesphNBMzBD+wI38/kHxB06nzLADCKufUJ6Mz9XofGX4mmwugZt4dE9TpL+5gE3ix58lETZOgSHKLLAoGAT+ojfQrW/tWQdbkpy8a95eaeeMWTBSTdWo3NSamBHLITRHej5TLgpCaVF8JVA+IoxyClrbH/09AAIOYm2vv3skknEw+4YOduxI//dT0dJsmaoURgIQgQAAOwaflD5vwV1OYC58fPNbjMB5tWfMNgfMiNv0EZbKmm2Y8XgI2YQnECgYEAsI3CPZO4GVZ21WYpTavxGydK9W6S5xrCCv3aiXFpTlNCWmxCP6jwokeBe3GImpB1tv48qyEDkc/R0KZFcuE8e8W5fisSSeiwK9pxE9tqrHROW6doRQdugM7NG7ItMmalghuhhUPcT0SUhR1zYKrCmuwAViO9ZSk1HVkiS6OaWco=";

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
    public static String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmB1EJz4RcK7ivh13AmltlsynU80xwn22PhPHwsdIlFszVWQKuWxCIf8mgk/krZJ78MnBxBdsSGgdSC7h7pwd2u0mabXnUPdenTgW+1QP1YkzW9mcqEvtzmJ+0u8lvr3GW9NXKTyLUlb1/Lt4BvJhVj0CnWtp5iDZdXx4iD+gP0b9hc/VK6Qh4TUKNEGtLkHpXhqWU61DpyIdsuTmNkI6PNwEkHmLRmK71GOCbXYIFqTL9ZzWuxuSdq6E8rgu8bnx2m5kAcV/ZLZaIqsh7adaJwLn8SwgEH+yNkVBrpYAkOuW75C36tXe3DisVEPuxA5mJ95yg/ktppukpiC/xwX3NQIDAQAB";

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
