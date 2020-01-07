package com.briup.waimai.service.impl;

import com.briup.waimai.bean.ex.MonitorEX;
import com.briup.waimai.bean.ex.OderEX;
import com.briup.waimai.mapper.ex.MonitorEXMapper;
import com.briup.waimai.service.IMonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MonitorServiceImpl implements IMonitorService {
    @Autowired
    private MonitorEXMapper monitorEXMapper;
    @Override
    public List<MonitorEX> selectOrder(int id) {
        List<MonitorEX> list =monitorEXMapper.selectById(id);
        return list;
    }
}
