package com.liudong.dao;

import com.liudong.pojo.Jobs;

public interface JobsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jobs record);

    int insertSelective(Jobs record);

    Jobs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jobs record);

    int updateByPrimaryKey(Jobs record);
}