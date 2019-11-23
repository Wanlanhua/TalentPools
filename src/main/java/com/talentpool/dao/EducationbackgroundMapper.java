package com.talentpool.dao;

import com.talentpool.po.Educationbackground;
import com.talentpool.po.EducationbackgroundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationbackgroundMapper {
    int countByExample(EducationbackgroundExample example);

    int deleteByExample(EducationbackgroundExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Educationbackground record);

    int insertSelective(Educationbackground record);

    List<Educationbackground> selectByExample(EducationbackgroundExample example);

    Educationbackground selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Educationbackground record, @Param("example") EducationbackgroundExample example);

    int updateByExample(@Param("record") Educationbackground record, @Param("example") EducationbackgroundExample example);

    int updateByPrimaryKeySelective(Educationbackground record);

    int updateByPrimaryKey(Educationbackground record);
}