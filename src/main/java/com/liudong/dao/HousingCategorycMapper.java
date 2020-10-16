package com.liudong.dao;

import com.liudong.pojo.HousingCategoryc;

public interface HousingCategorycMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HousingCategoryc record);

    int insertSelective(HousingCategoryc record);

    HousingCategoryc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HousingCategoryc record);

    int updateByPrimaryKey(HousingCategoryc record);
}