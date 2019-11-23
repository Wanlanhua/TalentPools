package com.talentpool.dao;

import com.talentpool.po.Operatorinfo;
import com.talentpool.po.OperatorinfoExample;
import com.talentpool.po.Userinfo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface OperatorinfoMapper {
    int countByExample(OperatorinfoExample example);

    int deleteByExample(OperatorinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Operatorinfo record);

    int insertSelective(Operatorinfo record);

    List<Operatorinfo> selectByExample(OperatorinfoExample example);

    Operatorinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Operatorinfo record, @Param("example") OperatorinfoExample example);

    int updateByExample(@Param("record") Operatorinfo record, @Param("example") OperatorinfoExample example);

    int updateByPrimaryKeySelective(Operatorinfo record);

    int updateByPrimaryKey(Operatorinfo record);
    //分页
    public List<Operatorinfo> fenye(Integer firstIndex);
    //导出
    List<Map<String,Object>> QueryByDaochu();
}