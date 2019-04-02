package com.qf.git.service.impl;

import com.qf.git.dao.IDaseDao;
import com.qf.git.service.IDaseService;
import com.qf.git.dao.IDaseDao;
import com.qf.git.service.IDaseService;

public abstract class DaseServiceImpl<T> implements IDaseService<T> {

    public abstract IDaseDao<T> getDao();

    @Override
    public int deleteByPrimaryKey(Long orgId) {


        return getDao().deleteByPrimaryKey(orgId);
    }

    @Override
    public int insert(T t) {

        return getDao().insert(t);
    }

    @Override
    public int insertSelective(T t) {
        return getDao().insertSelective(t);
    }

    @Override
    public T selectByPrimaryKey(Long orgId) {

       // System.out.println( getDao().selectByPrimaryKey(orgId));
        return  getDao().selectByPrimaryKey(orgId);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return getDao().updateByPrimaryKeySelective(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return getDao().updateByPrimaryKey(t);
    }
}
