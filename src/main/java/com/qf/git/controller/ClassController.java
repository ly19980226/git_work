package com.qf.git.controller;

import com.qf.git.entity.SClass;
import com.qf.git.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private IClassService classService;

    @RequestMapping("/getlist")
    public String getlist(ModelMap map){
        System.out.println("555");
      List<SClass> list= classService.getlist();
        System.out.println(list+"888");
      map.put("classlist", list);
      return "class/show_class";
    }


}
