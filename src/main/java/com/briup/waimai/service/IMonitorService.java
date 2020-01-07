package com.briup.waimai.service;

import com.briup.waimai.bean.ex.MonitorEX;
import com.briup.waimai.bean.ex.OderEX;

import java.util.List;

public interface IMonitorService {
    List<MonitorEX> selectOrder(int id);
}
