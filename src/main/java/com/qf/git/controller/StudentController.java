package com.qf.git.controller;

import com.qf.git.Common.SysResult;
import com.qf.git.entity.Student;
import com.qf.git.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @RequestMapping("/toadd")
    public String toadd(){
        return "student/toadd";
    }
    /*添加学生的方法*/
    @RequestMapping("/add")
    public String add(Student student,Integer className){
        SysResult sysResult = studentService.add(student,className);
        return "";
    }
    /*删除操作*/
    @RequestMapping("/del/{id}")
    public String del(@RequestParam Integer id){
        int result = studentService.del(id);
        return "";
    }
    /*根据id获取学生实例并发送到jsp页面*/
    @RequestMapping("/toUpdate/{id}")
    public String toUpdate(@RequestParam Integer id){
        Student student = studentService.toUpdate(id);
        return "";
    }
    /*进行修改学生数据*/
    @RequestMapping("/update")
    public String update(Student student){
        int result = studentService.update(student);
        return "";
    }
}
