package com.briup.waimai.service.impl;


import com.briup.waimai.bean.Comment;
import com.briup.waimai.bean.ex.CommentEX;
import com.briup.waimai.bean.ex.MoEX;
import com.briup.waimai.mapper.CommentMapper;
import com.briup.waimai.mapper.ex.CommentEXMapper;
import com.briup.waimai.mapper.ex.MoEXMapper;
import com.briup.waimai.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements ICommentService {
    @Autowired
    private MoEXMapper moEXMapper;
    @Autowired
    private CommentEXMapper commentEXMapper;
    @Autowired
    private CommentMapper commentMapper;


    @Override
    public List<CommentEX> find(int id) throws RuntimeException {
      return   commentEXMapper.find(id);

    }

    @Override
    public void add(Comment comment) throws RuntimeException {

        commentMapper.insert(comment);
    }

    @Override
    public List<CommentEX> findAll() throws RuntimeException {
        return commentEXMapper.findAll();
    }
}
