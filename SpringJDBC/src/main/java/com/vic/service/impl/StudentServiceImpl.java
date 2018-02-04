package com.vic.service.impl;

import com.vic.dao.StudentDao;
import com.vic.entity.Student;
import com.vic.service.StudentService;

import java.io.Serializable;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    //交给spring容器实例化dao层对象
    private StudentDao dao;

    public StudentDao getDao() {
        return dao;
    }

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    public int add(Student student) {
        return dao.add(student);
    }

    public int del(Serializable id) {
        return dao.del(id);
    }

    public int update(Student student) {
        return dao.update(student);
    }

    public List<Student> getAll() {
        return dao.getAll();
    }
}

