package com.briup.waimai.service.impl;


import com.briup.waimai.bean.Comment;
import com.briup.waimai.bean.ex.MoEX;
import com.briup.waimai.mapper.CommentMapper;
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
    private CommentMapper commentMapper;
    @Override
    public List<MoEX> find(int oderId) throws RuntimeException {
        return moEXMapper.find(oderId);
    }

    @Override
    public void add(Comment comment) throws RuntimeException {
        commentMapper.insert(comment);
    }
}
