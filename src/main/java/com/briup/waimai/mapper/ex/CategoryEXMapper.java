package com.briup.waimai.mapper.ex;

import com.briup.waimai.bean.ex.CategoryEX;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CategoryEXMapper {
    List<CategoryEX> findAll();
    List<CategoryEX> search(String key);
}
