package com.liudong.dao;

import com.liudong.pojo.FamilyMembersLivingTogether;

public interface FamilyMembersLivingTogetherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FamilyMembersLivingTogether record);

    int insertSelective(FamilyMembersLivingTogether record);

    FamilyMembersLivingTogether selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FamilyMembersLivingTogether record);

    int updateByPrimaryKey(FamilyMembersLivingTogether record);
}