package com.qf.git.service.impl;

import com.qf.git.dao.IDaseDao;
import com.qf.git.entity.SClass;
import com.qf.git.mapper.SClassMapper;
import com.qf.git.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassServiceImpl extends DaseServiceImpl<SClass> implements IClassService {
    @Autowired
    private SClassMapper sClassMapper;

    @Override
    public IDaseDao<SClass> getDao() {

        return sClassMapper;
    }

    @Override
    public List<SClass> getlist() {
        List<SClass> getlist = sClassMapper.getlist();
        System.out.println("811="+getlist);
        return getlist;
    }
}
