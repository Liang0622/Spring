package com.vic;


import com.vic.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Student student= (Student) context.getBean("student");
        System.out.println(student);
    }
}
