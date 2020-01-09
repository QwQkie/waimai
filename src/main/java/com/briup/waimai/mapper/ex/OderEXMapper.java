package com.briup.waimai.mapper.ex;

import com.briup.waimai.bean.ex.OderEX;

import java.util.List;

public interface OderEXMapper {
    List<OderEX> selectById(int id);
    OderEX selectById1(int id);
    OderEX selectByCode(String code);
}
