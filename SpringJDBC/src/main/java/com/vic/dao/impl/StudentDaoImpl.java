package com.vic.dao.impl;

import com.vic.dao.StudentDao;
import com.vic.entity.Student;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {

    public int add(Student student) {
        String sql="insert into student values(?,?)";
        Object[] params={student.getsId(),student.getsName()};
        return getJdbcTemplate().update(sql,params);
    }

    public int del(Serializable id) {
        String sql="DELETE FROM student WHERE sid=?";
        return getJdbcTemplate().update(sql,id);
    }

    public int update(Student student) {
        String sql="update student set sname=?  where sid=?";
        return getJdbcTemplate().update(sql,student.getsName(),student.getsId());
    }

    public List<Student> getAll() {
        String sql="select * from student";
        //使用匿名内部类
        return getJdbcTemplate().query(sql, new RowMapper<Student>() {
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student=new Student();
                student.setsId(resultSet.getInt("sid"));
                student.setsName(resultSet.getString("sname"));
                return student;
            }
        });
    }
}
