package com.qf.git.dao;

public interface IDaseDao<T> {
    int deleteByPrimaryKey(Integer orgId);
    int insert(T t);
    int insertSelective(T t);
    T  selectByPrimaryKey(Integer orgId);
    int updateByPrimaryKeySelective(T t);
    int updateByPrimaryKey(T t);
}
