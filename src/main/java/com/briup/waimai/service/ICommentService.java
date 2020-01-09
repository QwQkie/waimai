package com.briup.waimai.service;

import com.briup.waimai.bean.Comment;
import com.briup.waimai.bean.Menu;
import com.briup.waimai.bean.ex.CommentEX;
import com.briup.waimai.bean.ex.MoEX;

import java.util.List;

public interface ICommentService {
    List<CommentEX> find(int id) throws RuntimeException;
    void add(Comment comment)throws RuntimeException;
    List<CommentEX> findAll()throws RuntimeException;

}
