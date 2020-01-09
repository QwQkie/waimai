package com.briup.waimai.mapper.ex;

import com.briup.waimai.bean.ex.CommentEX;

import java.util.List;

public interface CommentEXMapper {
    List<CommentEX> find(int id);
    List<CommentEX> findAll();
}
