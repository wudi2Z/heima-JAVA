package com.one;

public class Car {
        String color;
        double price;
        String brand;
        public Car(){

        }
        //成员方法 get ：获取成员变量的值
        //成员方法 set ：设置成员变量的值
        public void drive(){
            System.out.println("车在行驶");
        }
        public void setColor(String color){
            this.color = color;
        }
        public void setPrice(double price){
            this.price = price;
        }
        public void setBrand(String brand){
            this.brand = brand;
        }
        //成员方法 get ：获取成员变量的值
        public String getColor(){
            return color;
        }
        public double getPrice(){
            return price;
        }
        public String getBrand(){
            return brand;
        }
}
