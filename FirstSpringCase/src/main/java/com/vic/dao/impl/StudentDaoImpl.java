package com.vic.dao.impl;

import com.vic.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {

    public void sleep() {
        System.out.println("学生正在睡觉！");
    }

    public String eat() {
        System.out.println("学生正在吃饭！");
        return "苹果";
    }
}
