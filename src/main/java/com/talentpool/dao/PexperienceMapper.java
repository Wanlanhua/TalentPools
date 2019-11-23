package com.talentpool.dao;

import com.talentpool.po.Pexperience;
import com.talentpool.po.PexperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PexperienceMapper {
    int countByExample(PexperienceExample example);

    int deleteByExample(PexperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pexperience record);

    int insertSelective(Pexperience record);

    List<Pexperience> selectByExample(PexperienceExample example);

    Pexperience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pexperience record, @Param("example") PexperienceExample example);

    int updateByExample(@Param("record") Pexperience record, @Param("example") PexperienceExample example);

    int updateByPrimaryKeySelective(Pexperience record);

    int updateByPrimaryKey(Pexperience record);
}