package com.briup.waimai.service.impl;


import com.briup.waimai.bean.OderExample;
import com.briup.waimai.bean.User;
import com.briup.waimai.bean.UserExample;
import com.briup.waimai.mapper.OderMapper;
import com.briup.waimai.mapper.UserMapper;
import com.briup.waimai.mapper.ex.UserEXMapper;
import com.briup.waimai.service.IUserService;
import com.briup.waimai.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OderMapper oderMapper;
    @Autowired
    private UserEXMapper userEXMapper;
    @Override
    public List<User> findAll() throws RuntimeException {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public void saveOrUpdate(User user) throws RuntimeException {
        if(user==null){
            throw new RuntimeException("参数为空");
        }
        if(user.getId()==null){
            user.setPassword(MD5Utils.md5(user.getPassword()));
            userMapper.insert(user);
        }else {
            user.setPassword(MD5Utils.md5(user.getPassword()));
            userMapper.updateByPrimaryKey(user);
        }
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        OderExample example=new OderExample();
        example.createCriteria().andUserIdEqualTo(id);
        oderMapper.deleteByExample(example);
        userMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<User> search(String word) throws RuntimeException {
        word = word == null ? "" : word;
        if (word == null || "".equals(word)) {
            return findAll();
        } else {
            word = "%" + word + "%";
            return userEXMapper.search(word);

        }
    }
}
