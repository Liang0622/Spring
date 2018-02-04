package com.vic;

import com.vic.dao.impl.StudentDaoImpl;
import com.vic.pojo.Student;
import com.vic.service.StudentService;
import com.vic.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 入门案例
 */
public class StudentTest {

    /**
     * 之前的方式
     */
    @Test
    public  void  test01(){
        //实例化service层对象
        StudentServiceImpl service=new StudentServiceImpl();
        service.setDao(new StudentDaoImpl());
        service.sleep();
    }


    /**
     * Spring容器的工作：
     * 01.创建各种bean对象
     * 02.管理bean之间的关系
     *
     *ApplicationContext接口有个实现类
     * ClassPathXmlApplicationContext("spring.xml")
     *   特点：
     *   spring.xml文件中配置的所有bean都实例化了！
     */

    @Test
    public void test02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("========================");
//        通过Spring容器实例化service层对象
        StudentService service= (StudentService) context.getBean("studentService");
        service.sleep();
    }

    /**
     * 实现按需加载
     */
    @Test
    public void test03(){
        XmlBeanFactory context=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
        System.out.println("========================");
        StudentService service= (StudentService) context.getBean("studentService");
        service.sleep();
    }
    /**
     * 从绝对路径上加载核心配置文件
     */
    @Test
    public void test04(){
        ApplicationContext context=new FileSystemXmlApplicationContext("F:/FrameWorkspaces/IDEA/ApplicationContext.xml");
        System.out.println("========================");
        StudentService service= (StudentService) context.getBean("studentService");
        service.sleep();
    }

    /**
     * 验证单例模式
     */
    @Test
    public void test05(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("========================");
        Student stu1= (Student) context.getBean("student");
        Student stu2= (Student) context.getBean("student");
        System.out.println("stu1==stu2吗?:"+(stu1==stu2));

    }
}
