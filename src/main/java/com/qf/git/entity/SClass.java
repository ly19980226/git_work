package com.qf.git.entity;

public class SClass {
    private Integer id;

    private String className;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "SClass{" +
                "id=" + id +
                ", className='" + className + '\'' +
                '}';
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}