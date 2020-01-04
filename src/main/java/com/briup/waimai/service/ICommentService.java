package com.briup.waimai.service;

import com.briup.waimai.bean.Comment;
import com.briup.waimai.bean.Menu;
import com.briup.waimai.bean.ex.MoEX;

import java.util.List;

public interface ICommentService {
    List<MoEX> find(int oderId)throws RuntimeException;
    void add(Comment comment)throws RuntimeException;

}
