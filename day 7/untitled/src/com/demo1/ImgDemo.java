package com.demo1;
import javax.swing.*;
import java.awt.*;

public class ImgDemo extends JFrame {
    public ImgDemo() {
        ImgInit();
        img();
        this.setVisible(true);
    }
    public void ImgInit() {
        this.setTitle("图片");
        this.setSize(1980,1080);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时，程序退出

        this.setLayout(null);

        this.setAlwaysOnTop(true);
           }
    public void img(){
        ImageIcon ii= new ImageIcon("E:\\black\\day 7\\untitled\\imgs\\xl.jpg");
        JLabel label = new JLabel(ii);
        label.setBounds(100,100,300,300);
        this.add(label);
    }
}
