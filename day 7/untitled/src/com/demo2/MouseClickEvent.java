package com.demo2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MouseClickEvent {
    public static void main(String[] args){
        JFrame jf=new JFrame();
        jf.setTitle("鼠标点击事件");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);//设置窗口居中显示
        jf.setAlwaysOnTop(true);//设置窗口置顶
        jf.setLayout(null);//取消默认布局

        JButton btn=new JButton("点击我");
        btn.setBounds(100,100,100,20);
        jf.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override//覆盖
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被点击了");
            }
        });


        jf.setVisible(true);//设置窗口可见

    }
}
