package com.liudong.dao;

import com.liudong.pojo.AgentRentalc;

public interface AgentRentalcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgentRentalc record);

    int insertSelective(AgentRentalc record);

    AgentRentalc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgentRentalc record);

    int updateByPrimaryKey(AgentRentalc record);
}