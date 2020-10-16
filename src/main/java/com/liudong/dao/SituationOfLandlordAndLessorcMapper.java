package com.liudong.dao;

import com.liudong.pojo.SituationOfLandlordAndLessorc;

public interface SituationOfLandlordAndLessorcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SituationOfLandlordAndLessorc record);

    int insertSelective(SituationOfLandlordAndLessorc record);

    SituationOfLandlordAndLessorc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SituationOfLandlordAndLessorc record);

    int updateByPrimaryKey(SituationOfLandlordAndLessorc record);
}