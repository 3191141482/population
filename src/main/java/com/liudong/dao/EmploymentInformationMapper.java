package com.liudong.dao;

import com.liudong.pojo.EmploymentInformation;

public interface EmploymentInformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmploymentInformation record);

    int insertSelective(EmploymentInformation record);

    EmploymentInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmploymentInformation record);

    int updateByPrimaryKey(EmploymentInformation record);
}