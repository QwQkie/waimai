package com.briup.waimai.mapper.ex;

import com.briup.waimai.bean.Poster;
import com.briup.waimai.bean.PosterExample;
import com.briup.waimai.bean.ex.PosterEX;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PosterEXMapper {

     List<PosterEX> findAll();

    long countByExample(PosterExample example);

    int deleteByExample(PosterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Poster record);

    int insertSelective(Poster record);

    List<Poster> selectByExample(PosterExample example);

    Poster selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Poster record, @Param("example") PosterExample example);

    int updateByExample(@Param("record") Poster record, @Param("example") PosterExample example);

    int updateByPrimaryKeySelective(Poster record);

    int updateByPrimaryKey(Poster record);

    Poster search(int id);


    List<Poster> findpp(int id);
}
