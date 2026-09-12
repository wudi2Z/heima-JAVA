package com.user;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import com.user.DateChooser;

public class AttendanceQuery {
    public static void main(String [] args){
        JFrame jf=new JFrame("考勤查询");
        jf.setSize(400,300);
        jf.setDefaultCloseOperation(3);//设置关闭操作
        jf.setLocationRelativeTo(null);//设置窗口居中显示
        jf.setLayout(null);//取消默认布局

        //创建日期标签
        JLabel dateLabel=new JLabel("考勤日期");
        dateLabel.setBounds(50,20,100,20);
        jf.add(dateLabel);

        //显示开始时间文本
        JLabel startDateLabel=new JLabel("开始日期");
        startDateLabel.setBounds(50,70,100,20);
        jf.add(startDateLabel);

        //创建日历控件
        DateChooser dateChooser1=DateChooser.getInstance("yyyy/MM/dd");//类名.方法名()，调用静态方法
        DateChooser dateChooser2=DateChooser.getInstance("yyyy/MM/dd");

        //开始时间输入框
        JTextField startDateField=new JTextField();
        startDateField.setBounds(50,100,100,20);
        //将控件绑定输入框
        dateChooser1.register(startDateField);
        jf.add(startDateField);

        //显示结束时间文本
        JLabel endDateLabel=new JLabel("结束日期");
        endDateLabel.setBounds(250,70,100,20);
        jf.add(endDateLabel);

        //结束时间文本框
        JTextField endDateField=new JTextField();
        endDateField.setBounds(250,100,100,20);

        //将控件绑定输入框
        dateChooser2.register(endDateField);
        jf.add(endDateField);

        //确定按钮
        JButton confirmButton=new JButton("确定");
        confirmButton.setBounds(250,180,60,20);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String startStr=startDateField.getText();
                String endsStr=endDateField.getText();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
                try {
                    Date startdate=sdf.parse(startStr);
                    Date enddate=sdf.parse(endsStr);
                    JOptionPane.showMessageDialog(jf,startdate+"\n"+enddate);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        jf.add(confirmButton);



        jf.setVisible(true);//设置窗口可见
    }
}
