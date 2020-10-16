package com.liudong.dao;

import com.liudong.pojo.VocationalSkillsBoarding;

public interface VocationalSkillsBoardingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VocationalSkillsBoarding record);

    int insertSelective(VocationalSkillsBoarding record);

    VocationalSkillsBoarding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VocationalSkillsBoarding record);

    int updateByPrimaryKey(VocationalSkillsBoarding record);
}