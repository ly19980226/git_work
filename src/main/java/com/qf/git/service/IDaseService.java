package com.qf.git.service;

public interface IDaseService<T> {

    int deleteByPrimaryKey(Long orgId);

    int insert(T t);

    int insertSelective(T t);

    T  selectByPrimaryKey(Long orgId);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);

}
