package com.qf.oa.mapper;

import com.qf.oa.entity.SClass;

public interface SClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SClass record);

    int insertSelective(SClass record);

    SClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SClass record);

    int updateByPrimaryKey(SClass record);
}