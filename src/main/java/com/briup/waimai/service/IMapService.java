package com.briup.waimai.service;

import java.math.BigDecimal;
import java.util.Map;

public interface IMapService {
    Map<String, BigDecimal> getLatAndLngByAddress(String addr);
}
