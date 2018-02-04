package com.vic;

import com.vic.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试bean生命周期
 */
public class LifeCycle {

    @Test
    public  void test() {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Student student= context.getBean("student", Student.class);
        System.out.println(student);
        ((ClassPathXmlApplicationContext)context).close();  //关闭容器
    }
}

