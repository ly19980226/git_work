package com.qf.oa.entity;

public class Teacher {
    private Integer tId;

    private String tName;

    private Integer tAge;

    private String tSex;

    private String tSort;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex == null ? null : tSex.trim();
    }

    public String gettSort() {
        return tSort;
    }

    public void settSort(String tSort) {
        this.tSort = tSort == null ? null : tSort.trim();
    }
}