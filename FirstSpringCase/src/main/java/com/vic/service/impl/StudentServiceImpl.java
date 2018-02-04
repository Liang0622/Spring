package com.vic.service.impl;

import com.vic.dao.StudentDao;
import com.vic.dao.impl.StudentDaoImpl;
import com.vic.service.StudentService;

public class StudentServiceImpl implements StudentService {

    public StudentServiceImpl() {
        System.out.println("StudentServiceImpl的无参构造");
    }
//创建DAO层的实例 StudentDao dao=new StudentDaoImpl();存在耦合
    StudentDao dao;

    public StudentDao getDao() {
        return dao;
    }
    //DI依赖注入    设值注入
    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    public void sleep() {
        System.out.println("开始记录日志");
        dao.sleep();
        System.out.println("结束记录日志");
    }

    public String eat() {
        System.out.println("开始记录日志");
        String result=dao.eat();
        System.out.println("结束记录日志");
        return result;
    }

}
