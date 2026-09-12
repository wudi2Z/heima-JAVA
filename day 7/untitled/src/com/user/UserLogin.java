package com.user;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
    public static void main(String[] args) {
        JFrame jf=new JFrame("用户登录");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);//设置关闭操作
        jf.setLocationRelativeTo(null);//设置窗口居中显示
        jf.setAlwaysOnTop(true);//设置窗口置顶
        jf.setLayout(null);//取消默认布局

        //用户名标签
        JLabel username=new JLabel("用户名");
        username.setBounds(50,50,50,20);
        jf.add(username);

        //用户名输入框
        JTextField usernameField=new JTextField();
        usernameField.setForeground(Color.BLACK);
        usernameField.setFont(new Font("宋体", Font.BOLD, 14));
        usernameField.setBackground(Color.WHITE); // 设置背景颜色为白色
        usernameField.setBounds(150,50,180,20);
        jf.add(usernameField);

        //密码标签
        JLabel password=new JLabel();
       password.setText("密码");
        password.setBounds(50,100,50,20);
        password.setForeground(Color.BLACK); // 设置文本颜色为黑色
        password.setFont(new Font("宋体", Font.BOLD, 14));
        password.setBackground(Color.WHITE); // 设置背景颜色为白色

        jf.add(password);

        //密码输入框
        JPasswordField passwordField= new JPasswordField();
        passwordField.setBounds(150,100,180,20);
        jf.add(passwordField);

        //登录按钮
        JButton loginButton=new JButton("登录");
        loginButton.setBounds(50,200,280,20);
        jf.add(loginButton);

        //已知用户名和密码
        String name="itheima";
        String pwd="123456";


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取用户名和密码
                String username=usernameField.getText();
                String password=passwordField.getText();

                //判断用户名和密码是否正确
               if(username.length()<6||username.length()>12){
                    JOptionPane.showMessageDialog(jf,"用户名长度必须在6-12位之间");
//                    System.out.println("用户名长度必须在6-12位之间");
                   usernameField.setText("");
                   return;
               }
               if (password.length()<6||password.length()>12){
                    JOptionPane.showMessageDialog(jf,"密码长度必须在6-12位之间");
//                    System.out.println("密码长度必须在6-12位之间");
                   passwordField.setText("");
                   return;
               }



               //用户登录是否正确
                if (username.equals(name)&&password.equals(pwd)){
                    JOptionPane.showMessageDialog(jf,"登录成功");
                    usernameField.setText("");
                    passwordField.setText("");
                }else{
                    JOptionPane.showMessageDialog(jf,"用户名或密码错误,登录失败");
                }
            }
        });

        jf.setVisible(true);//设置窗口可见
    }
}
