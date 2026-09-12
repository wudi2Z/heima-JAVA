package com.heima2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//继承JFrame类，创建聊天室窗口
//在窗口中添加文本显示区域、文本输入框、发送按钮、清空聊天按钮

public class ChatFrame extends JFrame {
    public ChatFrame() {
        initFrame();
        paintFrame();

        this.setVisible(true);//设置窗口可见
    }
    public void initFrame(){
        this.setTitle("聊天室");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(3);//设置关闭操作
        this.setLocationRelativeTo(null);//设置窗口居中显示
        this.setLayout(null);//取消默认布局

    }
    public void paintFrame(){
        //创建文本显示区域
        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(10, 10, 360, 200);
        messageArea.setForeground(Color.BLACK); // 设置文本颜色为黑色
        messageArea.setFont(new Font("宋体", Font.BOLD, 14));
        messageArea.setBackground(Color.WHITE); // 设置背景颜色为白色
        this.add(messageArea);

        //创建文本输入框
        JTextField messageField = new JTextField();
        messageField.setBounds(10, 230, 180, 20);
        this.add(messageField);

        //创建发送按钮
        JButton sendButton = new JButton("发送");
        sendButton.setBounds(200, 230, 70, 20);
        this.add(sendButton);

        //
        JButton clearButton = new JButton("清空聊天");
        clearButton.setBounds(280, 230, 100, 20);
        this.add(clearButton);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = messageField.getText().trim();
                if (message.equals("")) {
                    JOptionPane.showMessageDialog(ChatFrame.this, "不能输入空消息");
                    return;
                }
                messageArea.append(message + "\n");
                messageField.setText("");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageArea.setText("");
            }
        });
    }
}
