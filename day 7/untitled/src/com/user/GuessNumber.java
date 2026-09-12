package com.user;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class GuessNumber {
    public static void main(String[] args){
        JFrame jf=new JFrame();
        jf.setTitle("猜数字游戏");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);//设置关闭操作
        jf.setLocationRelativeTo(null);//设置窗口居中显示
        jf.setLayout(null);//取消默认布局
        jf.setAlwaysOnTop(true);//设置窗口置顶

        JLabel text=new JLabel();
        text.setText("系统产生了一个1~100之间的整数，请猜数字：");
        text.setBounds(70,50,350,20);
        jf.add(text);

        //创建文本输入框
        JTextField textField=new JTextField();
        textField.setBounds(120,100,150,20);
        textField.setForeground(Color.BLACK); // 设置文本颜色为黑色
        textField.setFont(new Font("宋体", Font.BOLD, 14));
        textField.setBackground(Color.WHITE); // 设置背景颜色为白色
        jf.add(textField);

        JButton btn=new JButton("猜数字");
        btn.setBounds(145,150,100,20);
        jf.add(btn);

        int number= new Random().nextInt(100)+1;
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strNumber=textField.getText().trim();
                if (strNumber.equals("")){
                    JOptionPane.showMessageDialog(jf,"你猜的数字不能为空");
                    textField.setText("");
                    return;
                }
                int guessNumber=Integer.parseInt(strNumber);
                if(guessNumber<0||guessNumber>100){
                    JOptionPane.showMessageDialog(jf,"你猜的数字必须在1~100之间");
                }else if(guessNumber<number){
                    JOptionPane.showMessageDialog(jf,"你猜的数字小了");
                }else if(guessNumber>number){
                    JOptionPane.showMessageDialog(jf,"你猜的数字大了");
                }else{
                    JOptionPane.showMessageDialog(jf,"恭喜你猜对了");
                }
            }
        });
        jf.setVisible(true);//设置窗口可见
    }
}
