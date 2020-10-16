package com.liudong.dao;

import com.liudong.pojo.FamilyPlanningInformation;

public interface FamilyPlanningInformationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FamilyPlanningInformation record);

    int insertSelective(FamilyPlanningInformation record);

    FamilyPlanningInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FamilyPlanningInformation record);

    int updateByPrimaryKey(FamilyPlanningInformation record);
}