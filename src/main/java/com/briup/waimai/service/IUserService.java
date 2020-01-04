package com.briup.waimai.service;

import com.briup.waimai.bean.User;

import java.util.List;

public interface IUserService {
    List<User> findAll()throws RuntimeException;
    void saveOrUpdate(User user) throws RuntimeException;
    void deleteById(int id)throws RuntimeException;
    List<User> search(String word)throws RuntimeException;
}
