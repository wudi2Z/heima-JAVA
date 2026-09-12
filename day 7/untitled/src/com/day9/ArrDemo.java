package com.day9;

import java.util.Scanner;

public class ArrDemo {
     static void Menu(){
        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("******************************");
        System.out.println("******************************");
    }

    public static void main(String[] args){
        int input=0;
        do {
            Menu();
        }while (input!=0);

    }
    void Print(){
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a);
    }

}
