package com.briup.waimai.service;

import com.briup.waimai.bean.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll() throws RuntimeException;
    void addOrUpdate(Category category) throws RuntimeException;
    void  delete(int id) throws RuntimeException;
    List<Category> search(String key) throws RuntimeException;

}
