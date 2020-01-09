package com.briup.waimai.service;

import com.briup.waimai.bean.Category;
import com.briup.waimai.bean.ex.CategoryEX;

import java.util.List;

public interface ICategoryService {
    List<CategoryEX> findAll() throws RuntimeException;
    void addOrUpdate(Category category) throws RuntimeException;
    void  delete(int id) throws RuntimeException;
    List<CategoryEX> search(String key) throws RuntimeException;

    void insert(Category category);
}
