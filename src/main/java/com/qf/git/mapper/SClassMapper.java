package com.qf.git.mapper;

import com.qf.git.dao.IDaseDao;
import com.qf.git.entity.SClass;

import java.util.List;

public interface SClassMapper extends IDaseDao<SClass> {

    List<SClass> getlist();
}