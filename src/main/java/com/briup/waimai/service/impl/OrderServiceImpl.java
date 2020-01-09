package com.briup.waimai.service.impl;

import com.briup.waimai.bean.CommentExample;
import com.briup.waimai.bean.MoExample;
import com.briup.waimai.bean.Oder;
import com.briup.waimai.bean.OderExample;
import com.briup.waimai.bean.ex.OderEX;
import com.briup.waimai.mapper.CommentMapper;
import com.briup.waimai.mapper.MoMapper;
import com.briup.waimai.mapper.OderMapper;
import com.briup.waimai.mapper.ex.OderEXMapper;
import com.briup.waimai.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OderMapper oderMapper;
    @Autowired
    private OderEXMapper oderEXMapper;
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private MoMapper moMapper;
    @Override
    public List<Oder> selectAll() throws RuntimeException {
        OderExample example = new OderExample();
        List<Oder> list = oderMapper.selectByExample(example);
        return list;
    }

    @Override
    public void insert(Oder oder) {
        oderMapper.insert(oder);
    }

    @Override
    public void deleteById(int id) {
        CommentExample example=new CommentExample();
        MoExample example1 = new MoExample();
        example1.createCriteria().andOderIdEqualTo(id);
        example.createCriteria().andOderIdEqualTo(id);
        moMapper.deleteByExample(example1);
        commentMapper.deleteByExample(example);
        oderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateById(Oder oder) {
        oderMapper.updateByPrimaryKey(oder);
    }

    @Override
    public List<OderEX> selectUser(int id) {
        List<OderEX> list = oderEXMapper.selectById(id);
        return list;
    }

    @Override
    public OderEX selectUser1(int id) {
        OderEX oderEX = oderEXMapper.selectById1(id);
        return oderEX;
    }

    @Override
    public OderEX selectByCode(String code) throws RuntimeException {
        return oderEXMapper.selectByCode(code);
    }
}
