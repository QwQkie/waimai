package com.briup.waimai.mapper.ex;

import com.briup.waimai.bean.ex.MonitorEX;

import java.util.List;

public interface MonitorEXMapper {
    List<MonitorEX> selectById(int id);
}
