package com.day5;

public class StudentTest {
    public static void main(String[] args){
        Student s=new Student();
        s.setName("张三");
        s.setAge(18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.eat();
        //创建学生对象
        Student stu=new Student("李四",20);
        System.out.println(stu.getName()+" "+stu.getAge());
        stu.eat();
    }
}
