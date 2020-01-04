package com.briup.waimai.mapper.ex;


import com.briup.waimai.bean.ex.MoEX;

import java.util.List;

public interface MoEXMapper {
    List<MoEX> find(int orderId);
}
