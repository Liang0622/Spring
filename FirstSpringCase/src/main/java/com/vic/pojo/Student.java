package com.vic.pojo;

public class Student {
    private Integer id; //学生编号
    private String name; //学生姓名

    public Student() {
        System.out.println("Student类中午餐构造！");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
