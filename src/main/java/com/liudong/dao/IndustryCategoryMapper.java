package com.liudong.dao;

import com.liudong.pojo.IndustryCategory;

public interface IndustryCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IndustryCategory record);

    int insertSelective(IndustryCategory record);

    IndustryCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IndustryCategory record);

    int updateByPrimaryKey(IndustryCategory record);
}