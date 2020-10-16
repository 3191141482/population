package com.liudong.dao;

import com.liudong.pojo.ReligiousBelief;

public interface ReligiousBeliefMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReligiousBelief record);

    int insertSelective(ReligiousBelief record);

    ReligiousBelief selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReligiousBelief record);

    int updateByPrimaryKey(ReligiousBelief record);
}