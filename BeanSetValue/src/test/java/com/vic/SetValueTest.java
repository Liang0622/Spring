package com.vic;

import com.vic.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetValueTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        /*Grade grade=  context.getBean("grade", Grade.class);
        System.out.println(grade);*/
        Student student= (Student) context.getBean("student");
        System.out.println(student);
    }

}
