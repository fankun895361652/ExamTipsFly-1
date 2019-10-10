package com.fly.fankun.mapper;



public interface PersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PersonMapper record);

    int insertSelective(PersonMapper record);

    PersonMapper selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PersonMapper record);

    int updateByPrimaryKey(PersonMapper record);
}