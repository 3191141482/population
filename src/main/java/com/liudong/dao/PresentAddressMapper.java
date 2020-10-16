package com.liudong.dao;

import com.liudong.pojo.PresentAddress;

public interface PresentAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PresentAddress record);

    int insertSelective(PresentAddress record);

    PresentAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PresentAddress record);

    int updateByPrimaryKey(PresentAddress record);
}