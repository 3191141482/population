package com.liudong.dao;

import com.liudong.pojo.ResidenceInformation;

public interface ResidenceInformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResidenceInformation record);

    int insertSelective(ResidenceInformation record);

    ResidenceInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResidenceInformation record);

    int updateByPrimaryKey(ResidenceInformation record);
}