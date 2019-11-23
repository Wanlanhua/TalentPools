package com.talentpool.dao;

import com.talentpool.po.Workex;
import com.talentpool.po.WorkexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkexMapper {
    int countByExample(WorkexExample example);

    int deleteByExample(WorkexExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Workex record);

    int insertSelective(Workex record);

    List<Workex> selectByExample(WorkexExample example);

    Workex selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Workex record, @Param("example") WorkexExample example);

    int updateByExample(@Param("record") Workex record, @Param("example") WorkexExample example);

    int updateByPrimaryKeySelective(Workex record);

    int updateByPrimaryKey(Workex record);
}