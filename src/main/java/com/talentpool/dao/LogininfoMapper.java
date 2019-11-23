package com.talentpool.dao;

import com.talentpool.po.Logininfo;
import com.talentpool.po.LogininfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogininfoMapper {
    int countByExample(LogininfoExample example);

    int deleteByExample(LogininfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Logininfo record);

    int insertSelective(Logininfo record);

    List<Logininfo> selectByExample(LogininfoExample example);

    Logininfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Logininfo record, @Param("example") LogininfoExample example);

    int updateByExample(@Param("record") Logininfo record, @Param("example") LogininfoExample example);

    int updateByPrimaryKeySelective(Logininfo record);

    int updateByPrimaryKey(Logininfo record);
}