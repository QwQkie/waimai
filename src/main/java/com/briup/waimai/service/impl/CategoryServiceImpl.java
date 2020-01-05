package com.briup.waimai.service.impl;

import com.briup.waimai.bean.Category;
import com.briup.waimai.mapper.CategoryMapper;
import com.briup.waimai.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public List<Category> findAll() throws RuntimeException {
        return categoryMapper.findAll();
    }

    @Override
    public void addOrUpdate(Category category) throws RuntimeException {
        if(category==null){
            throw new RuntimeException("参数为空");
        }
        if(category.getId()==null){
            categoryMapper.insert(category);
        }else {
            categoryMapper.updateByPrimaryKey(category);
        }
    }


    @Override
    public void delete(int id) throws RuntimeException {
         categoryMapper.deleteByPrimaryKey(id);
}

    @Override
    public List<Category> search(String key) throws RuntimeException {
        key=key==null?"":key;
        if(key==null && "".equals(key)){
            return  findAll();
        }
        else {

            key="%"+key+"%";
            return categoryMapper.search(key);
        }
    }
}
