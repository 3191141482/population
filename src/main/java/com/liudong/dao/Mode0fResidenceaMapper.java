package com.liudong.dao;

import com.liudong.pojo.Mode0fResidencea;

public interface Mode0fResidenceaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Mode0fResidencea record);

    int insertSelective(Mode0fResidencea record);

    Mode0fResidencea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Mode0fResidencea record);

    int updateByPrimaryKey(Mode0fResidencea record);
}