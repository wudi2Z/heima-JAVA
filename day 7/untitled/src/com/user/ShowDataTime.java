package com.user;

import javax.swing.*;

public class ShowDataTime {
    public static void main(String [] args){
        JFrame jf=new JFrame("手机日期和时间显示");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);//设置关闭操作
        jf.setLocationRelativeTo(null);//设置窗口居中显示
        jf.setLayout(null);//取消默认布局

        JLabel dataLabel=new JLabel();
        dataLabel.setBounds(50,50,100,20);
        jf.add(dataLabel);

        JLabel data=new JLabel("****年**月**日");
        data.setBounds(50,80,200,20);
        jf.add(data);

        JLabel timeText=new JLabel("时间");
        timeText.setBounds(50,150,100,20);
        jf.add(timeText);

        JLabel time=new JLabel("**时**分**秒");
        time.setBounds(50,180,200,20);
        jf.add(time);

        jf.setVisible(true);//设置窗口可见
    }
}
