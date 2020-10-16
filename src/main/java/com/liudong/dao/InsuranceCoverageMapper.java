package com.liudong.dao;

import com.liudong.pojo.InsuranceCoverage;

public interface InsuranceCoverageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InsuranceCoverage record);

    int insertSelective(InsuranceCoverage record);

    InsuranceCoverage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InsuranceCoverage record);

    int updateByPrimaryKey(InsuranceCoverage record);
}