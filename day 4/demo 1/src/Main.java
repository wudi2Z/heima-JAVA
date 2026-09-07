import java.util.Random;
import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。

public class Main {
    public static void main(String[] args) {
       int input=0;
        do {
            menu();
             Scanner sc=new Scanner(System.in);
             input=sc.nextInt();

            switch (input) {
                case 1:
                   game();
                    break;
                case 0:
                    System.out.println("退出");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }

        }while (input!=0);


    }
    public static void  menu(){
        int min=5;
        System.out.println("1.开始游戏");
        System.out.println("0.退出");
    }
    public static void game(){

        int num = new Random().nextInt(100);
        int count=0;
        System.out.println("请输入你猜的数字");
        int g=new Scanner(System.in).nextInt();
        while (g!=num){
            count++;
            if (g>num){
                System.out.println("你猜的数字大了");
            }else {
                System.out.println("你猜的数字小了");
            }
            g=new Scanner(System.in).nextInt();
        }
        System.out.println("恭喜你猜对了");
        System.out.println("你猜了"+count+"次");

    }
}