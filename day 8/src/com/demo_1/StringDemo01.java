package com.demo_1;

public class StringDemo01 {
    public static void main(String[] args) {
        String s1=new String();
        System.out.println(s1);
        System.out.println(s1.length());

        String s2=new String("hello");
        System.out.println(s2);
        System.out.println(s2.length());

        String s3="hello";
        System.out.println(s3);
        System.out.println(s3.length());

        String s4="abc";
        String s5="abc";
        String s6="ABC";
        System.out.println(s4==s5);
        System.out.println(s1.equals(s5));
        System.out.println(s4.equals(s6));
        System.out.println((s4.equalsIgnoreCase(s6)));
        String s7=" hello  ";
        System.out.println(s7);
        System.out.println(s7);
        System.out.println(s7.length());
        System.out.println(s7.trim());
        System.out.println(s7.trim().length());



    }
}
