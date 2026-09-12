package com.user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatRoom {
    public static void main(String[] args){
        JFrame jf=new JFrame("聊天室");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);//设置关闭操作
        jf.setLocationRelativeTo(null);//设置窗口居中显示
        jf.setLayout(null);//取消默认布局

        //创建文本显示区域
        JTextArea messageArea=new JTextArea();
        messageArea.setBounds(10,10,360,200);
        messageArea.setForeground(Color.BLACK); // 设置文本颜色为黑色
        messageArea.setFont(new Font("宋体", Font.BOLD, 14));
        messageArea.setBackground(Color.WHITE); // 设置背景颜色为白色
        jf.add(messageArea);

        //创建文本输入框
        JTextField messageField=new JTextField();
        messageField.setBounds(10,230,180,20);
        jf.add(messageField);

        //创建发送按钮
        JButton sendButton=new JButton("发送");
        sendButton.setBounds(200,230,70,20);
        jf.add(sendButton);

        //
        JButton clearButton=new JButton("清空聊天");
        clearButton.setBounds(280,230,100,20);
        jf.add(clearButton);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String message=messageField.getText().trim();
               if (message.equals("")){
                   JOptionPane.showMessageDialog(jf,"不能输入空消息");
                   return;
               }
               messageArea.append(message+"\n");
               messageField.setText("");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageArea.setText("");
            }
        });


        jf.setVisible(true);//设置窗口可见
    }
}
