package com.qf.git.service;

import com.qf.git.entity.SClass;

import java.util.List;

public interface IClassService extends IDaseService<SClass> {
    List<SClass> getlist();
}
