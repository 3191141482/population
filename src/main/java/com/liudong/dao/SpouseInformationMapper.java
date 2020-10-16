package com.liudong.dao;

import com.liudong.pojo.SpouseInformation;

public interface SpouseInformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SpouseInformation record);

    int insertSelective(SpouseInformation record);

    SpouseInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SpouseInformation record);

    int updateByPrimaryKey(SpouseInformation record);
}