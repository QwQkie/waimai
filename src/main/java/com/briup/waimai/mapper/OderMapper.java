package com.briup.waimai.mapper;

import com.briup.waimai.bean.Oder;
import com.briup.waimai.bean.OderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OderMapper {
    long countByExample(OderExample example);

    int deleteByExample(OderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Oder record);

    int insertSelective(Oder record);

    List<Oder> selectByExample(OderExample example);

    Oder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Oder record, @Param("example") OderExample example);

    int updateByExample(@Param("record") Oder record, @Param("example") OderExample example);

    int updateByPrimaryKeySelective(Oder record);

    int updateByPrimaryKey(Oder record);
}