package com.liudong.dao;

import com.liudong.pojo.Personal;

public interface PersonalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Personal record);

    int insertSelective(Personal record);

    Personal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Personal record);

    int updateByPrimaryKey(Personal record);
}