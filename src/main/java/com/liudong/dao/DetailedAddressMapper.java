package com.liudong.dao;

import com.liudong.pojo.DetailedAddress;

public interface DetailedAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DetailedAddress record);

    int insertSelective(DetailedAddress record);

    DetailedAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DetailedAddress record);

    int updateByPrimaryKey(DetailedAddress record);
}