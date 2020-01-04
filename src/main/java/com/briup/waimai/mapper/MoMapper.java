package com.briup.waimai.mapper;

import com.briup.waimai.bean.Mo;
import com.briup.waimai.bean.MoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoMapper {
    long countByExample(MoExample example);

    int deleteByExample(MoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Mo record);

    int insertSelective(Mo record);

    List<Mo> selectByExample(MoExample example);

    Mo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Mo record, @Param("example") MoExample example);

    int updateByExample(@Param("record") Mo record, @Param("example") MoExample example);

    int updateByPrimaryKeySelective(Mo record);

    int updateByPrimaryKey(Mo record);
}