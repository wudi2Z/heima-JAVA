package com.demo2;

public class IntegerDemo {
    public static void main(String[] args) {
        String s1 = "100";
        Integer i1 = Integer.valueOf(s1);
        int x=i1.intValue();
        System.out.println(x);
        int y=Integer.parseInt(s1);
        System.out.println(y);
    }
}
