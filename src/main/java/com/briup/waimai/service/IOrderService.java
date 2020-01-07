package com.briup.waimai.service;


import com.briup.waimai.bean.Oder;
import com.briup.waimai.bean.ex.OderEX;

import java.util.List;
public interface IOrderService {
    List<Oder> selectAll() throws RuntimeException;
    void insert(Oder oder) throws RuntimeException;
    void deleteById(int id);
    void updateById(Oder oder);
    List<OderEX> selectUser(int id);
    OderEX selectUser1(int id);
}
