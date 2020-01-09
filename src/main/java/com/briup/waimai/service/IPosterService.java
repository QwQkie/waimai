package com.briup.waimai.service;

import com.briup.waimai.bean.Category;
import com.briup.waimai.bean.Poster;
import com.briup.waimai.bean.ex.CategoryEX;
import com.briup.waimai.bean.ex.PosterEX;

import java.util.List;

public interface IPosterService {

    List<PosterEX> findAll() throws RuntimeException;
    void addOrUpdate(Poster poster) throws RuntimeException;
    void  delete(int id) throws RuntimeException;
    Poster search(int id) throws RuntimeException;

    void insert(Poster poster);
}
