package com.briup.waimai.service.impl;

import com.briup.waimai.bean.Poster;
import com.briup.waimai.bean.ex.PosterEX;
import com.briup.waimai.mapper.PosterMapper;
import com.briup.waimai.mapper.ex.PosterEXMapper;
import com.briup.waimai.service.IPosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PosterServiceImpl implements IPosterService {
    @Autowired
private PosterMapper posterMapper;
    @Autowired
private PosterEXMapper posterEXMapper;

    @Override
    public List<PosterEX> findAll() throws RuntimeException {
        return posterEXMapper.findAll();
    }

    @Override
    public void addOrUpdate(Poster poster) throws RuntimeException {
        if(poster==null){
            throw new RuntimeException("参数为空");
        }
        if(poster.getId()==null){
            posterMapper.insert(poster);
        }else {
            posterMapper.updateByPrimaryKey(poster);
        }
    }

    @Override
    public void delete(int id) throws RuntimeException {
        posterMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Poster search(int id) throws RuntimeException {
        return posterEXMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insert(Poster poster) {
        posterMapper.insert(poster);
    }
}
