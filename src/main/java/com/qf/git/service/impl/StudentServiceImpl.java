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
    /*假删的方法*/
    @Override
    public int del(Integer id) {
        return studentMapper.delById(id);
    }
    /*根据id获取学生实例*/
    @Override
    public Student toUpdate(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
    /*修改学生实例*/
    @Override
    public int update(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }
}
