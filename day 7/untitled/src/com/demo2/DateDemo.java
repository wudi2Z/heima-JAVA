package com.demo2;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date);
        Date date2= new Date(1000L);
        System.out.println(date2);
        Date date3=new Date(1000L*60*60*24*2);
        System.out.println(date3);
    }
}
