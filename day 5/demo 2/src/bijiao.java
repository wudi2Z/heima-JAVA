import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class bijiao {
    public static void main(String[] args) {
        int input=0;
        do {
            menu();

            input=new Scanner(System.in).nextInt();
            switch (input){
                case 1:
                    System.out.println("请输入三个整数");
                    System.out.print("a=");
                    int a= new Scanner(System.in).nextInt();

                    System.out.print("b=");
                    int b= new Scanner(System.in).nextInt();

                    System.out.print("c=");
                    int c= new Scanner(System.in).nextInt();

                    int mid=getMid(a,b,c);
                    System.out.println("中间值为"+mid);
                    break;
                case 0:
                    System.out.println("退出程序");
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }while (input !=0);
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。

    }
    public static int getMid(int a,int b,int c){
        int max =(a > b ? a : b)>c ? (a > b ? a : b) : c;
        int min =(a < b ? a : b)<c ? (a < b ? a : b) : c;
        return (a+b+c)-max-min;
    }
    public static void menu(){
        System.out.println("1.输入三个整数");
        System.out.println("o.退出");
    }
}