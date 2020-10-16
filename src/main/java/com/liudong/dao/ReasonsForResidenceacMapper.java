package com.liudong.dao;

import com.liudong.pojo.ReasonsForResidenceac;

public interface ReasonsForResidenceacMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReasonsForResidenceac record);

    int insertSelective(ReasonsForResidenceac record);

    ReasonsForResidenceac selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReasonsForResidenceac record);

    int updateByPrimaryKey(ReasonsForResidenceac record);
}