package com.vic.dao;

import com.vic.entity.Student;

import java.io.Serializable;
import java.util.List;

public interface StudentDao {
    int add(Student student);
    int del(Serializable id);
    int update(Student student);
    List<Student> getAll();
}
