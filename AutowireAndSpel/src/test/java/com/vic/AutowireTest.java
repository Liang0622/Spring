package com.vic;

import com.vic.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Date;

public class AutowireTest {
    @Test
    public  void  test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person=context.getBean("person",Person.class);
        System.out.println(person);
    }

    @Test
    public  void  test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person=context.getBean("person1",Person.class);
        System.out.println(person);
    }
    @Test
    public  void  test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person=context.getBean("person2",Person.class);
        System.out.println(person);
    }

    /**
     * 测试spel
     */
    @Test
    public  void  test3(){
        //创建el表达式对象
        ExpressionParser parser=new SpelExpressionParser();
        Date date=new Date();  //获取当前日期的年份
        int year=  parser.parseExpression("year").getValue(date,int.class);
        System.out.println(year+1900);
        //获取int类型最大值
        System.out.println(Integer.MAX_VALUE);
        int max=parser.parseExpression("T(java.lang.Integer).MAX_VALUE").getValue(int.class);
        System.out.println(max);
        //求数字之和
        int sum=parser.parseExpression("1+2+3*5").getValue(int.class);
        System.out.println(sum);
        //逻辑运算符 和 boolean值
        boolean  value  =parser.parseExpression("1>2 or 2<3").getValue(Boolean.class);
        System.out.println(value);
    }





}
