package com.liudong.dao;

import com.liudong.pojo.AddressDetailed;

public interface AddressDetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AddressDetailed record);

    int insertSelective(AddressDetailed record);

    AddressDetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AddressDetailed record);

    int updateByPrimaryKey(AddressDetailed record);
}