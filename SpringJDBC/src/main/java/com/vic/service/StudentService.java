package com.vic.service;

import com.vic.entity.Student;

import java.io.Serializable;
import java.util.List;

public interface StudentService {
    int add(Student student);
    int del(Serializable id);
    int update(Student student);
    List<Student> getAll();
}
