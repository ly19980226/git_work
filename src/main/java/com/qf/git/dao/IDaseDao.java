package com.qf.git.dao;

public interface IDaseDao<T> {
    int deleteByPrimaryKey(Long orgId);
    int insert(T t);
    int insertSelective(T t);
    T  selectByPrimaryKey(Long orgId);
    int updateByPrimaryKeySelective(T t);
    int updateByPrimaryKey(T t);
}
