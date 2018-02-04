package com.vic;

import com.vic.entity.Student;
import com.vic.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentTest {
    ApplicationContext context=null;
    StudentService service=null;

    @Before
    public void before(){
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        service=context.getBean("studentService",StudentService.class);
    }

    @Test
    public void add(){
        //service.add(new Student(22,"豆子"));
        service.add(new Student(2,"南希"));

    }
    @Test
    public void update(){
        service.update(new Student(22,"阿曼"));
    }
    @Test
    public  void query(){
        List<Student> students=service.getAll();
        for (Student s:students) {
            System.out.println(s);
        }
    }
    @Test
    public void del(){
        if(service.del(2)>0)
            System.out.println("删除成功！");
        else
            System.out.println("删除失败！");

    }
}
