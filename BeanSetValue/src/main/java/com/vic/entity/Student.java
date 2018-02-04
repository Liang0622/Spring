package com.vic.entity;

import java.util.*;

public class Student {
    private String name;
    private Grade grade;
    private List<String> list=new ArrayList<String>();
    private Set<String> set=new HashSet<String>();
    private Map map=new HashMap();
    private String[] names=new String[2];
    private Properties properties=new Properties();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", names=" + Arrays.toString(names) +
                ", properties=" + properties +
                '}';
    }
}
