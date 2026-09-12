package com.demo1;

public class Student {
    private int id;
    private String name;
     private int age;

    public Student(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("姓名已修改为："+name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
