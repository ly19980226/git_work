package com.qf.git.service;

import com.qf.git.Common.SysResult;
import com.qf.git.entity.Student;

public interface IStudentService {
    SysResult add(Student student, Integer className);
}
