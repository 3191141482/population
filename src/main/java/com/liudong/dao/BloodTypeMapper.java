package com.liudong.dao;

import com.liudong.pojo.BloodType;

public interface BloodTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BloodType record);

    int insertSelective(BloodType record);

    BloodType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BloodType record);

    int updateByPrimaryKey(BloodType record);
}