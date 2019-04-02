package com.qf.git.service.impl;

import com.qf.git.Common.SysResult;
import com.qf.git.dao.IDaseDao;
import com.qf.git.entity.Student;
import com.qf.git.mapper.StudentMapper;
import com.qf.git.service.IDaseService;
import com.qf.git.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl extends DaseServiceImpl<Student> implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public IDaseDao<Student> getDao() {
        return studentMapper;
    }
    /*添加学生的方法*/
    @Override
    public SysResult add(Student student, Integer className) {
        return null;
    }
}
