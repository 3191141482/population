package com.liudong.dao;

import com.liudong.pojo.PoliticalOutlook;

public interface PoliticalOutlookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticalOutlook record);

    int insertSelective(PoliticalOutlook record);

    PoliticalOutlook selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticalOutlook record);

    int updateByPrimaryKey(PoliticalOutlook record);
}