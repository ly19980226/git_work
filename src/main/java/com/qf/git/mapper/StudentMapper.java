package com.qf.git.mapper;

import com.qf.git.dao.IDaseDao;
import com.qf.git.entity.Student;

import java.util.List;

public interface StudentMapper extends IDaseDao<Student> {

    int delById(Integer id);

    List<Student> getList();
}