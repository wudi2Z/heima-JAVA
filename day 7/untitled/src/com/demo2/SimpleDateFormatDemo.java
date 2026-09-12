package com.demo2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo   {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat();
        Date date=new Date();
        String s = sdf.format(date);
        System.out.println(s);
    }
}
