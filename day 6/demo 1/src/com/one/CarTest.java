package com.one;

public class CarTest {
    public static void main(String[] args) {
        //创建对象
        Car car = new Car();
        //调用成员方法
        System.out.println(car);//com.one.Car@15db9742
        System.out.println(car.color);//null
        System.out.println(car.price);//0.0
        System.out.println(car.brand);//null
        car.drive();
        /*
        com.one.Car@15db9742
        com.one.Car:全类名 =包名.类名
         @ ：分隔符
         15db9742:对象的地址
         */
    }
}
