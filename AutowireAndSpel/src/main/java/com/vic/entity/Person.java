package com.vic.entity;

public class Person {
    private int age;
    private String name;
    private Dog dog1;

    public Person(int age, String name, Dog dog1) {
        this.age = age;
        this.name = name;
        this.dog1 = dog1;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dog=" + dog1 +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog1() {
        return dog1;
    }

    public void setDog1(Dog dog1) {
        this.dog1 = dog1;
    }
}
