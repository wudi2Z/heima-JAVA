package com.user;

import java.util.Random;
import java.util.Scanner;
public class Guess {
    public static void main(String[] args){
        int input=0;
        do {
            menu();

            input=new Scanner(System.in).nextInt();
            switch (input){
                case 1:
                   game();
                    break;
                case 0:
                    System.out.println("谢谢使用");
                    break;
                default:
                    System.out.println("您的输入有误");
            }
        }while (input!=0);


    }
    static void menu(){
        System.out.println("1.开始游戏");
        System.out.println("0.退出游戏");
        System.out.println("请输入您的选择：");
    }
     static void game(){
        int number= new Random().nextInt(100)+1;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您猜的数字（1-100）：");
        while (true){
            int guess = sc.nextInt();
            if (guess == number){
                System.out.println("恭喜您猜对了");
                break;
            }else if (guess < number){
                System.out.println("您猜的数字小了");
            }else {
                System.out.println("您猜的数字大了");
            }
        }
    }
}
