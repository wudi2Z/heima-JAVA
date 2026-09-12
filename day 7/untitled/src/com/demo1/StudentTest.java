package com.demo1;
import javax.swing.*;
public class StudentTest {
    public static void main(String[] args){
       JFrame jf=new JFrame("学生信息管理系统");
       jf.setSize(3000,2000);
       jf.setDefaultCloseOperation(3);//设置关闭操作
       jf.setLocationRelativeTo(null);//设置窗口居中显示
       jf.setAlwaysOnTop(true);
       jf.setLayout(null);//取消默认布局

//       JButton jb=new JButton();
//       jb.setText("添加");
//       jb.setBounds(100,100,80,30);
//       jf.add(jb);
//       Student s=new Student();
//       s.setName("张三");
//       s.setAge(18);
//       s.setId(1001);

       ImageIcon ii=new ImageIcon("E:\\black\\day 7\\untitled\\imgs\\xl.png");
       JLabel im=new JLabel(ii);
       im.setBounds(0,0,1920,1080);
       jf.add(im);

       jf.setVisible(true);
    }
}