package CodeSources;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");

//        检查输入是否是一个整数
//        if (sc.hasNextInt()) {
//            // 读取下一个整数
//            int number = sc.nextInt();
//            //System.out.println("你输入的整数是：" + number);
//        } else {
//            System.out.println("输入的不是一个有效的整数。");
//        }


        int data = sc.nextInt();


        switch (data) {
            case 1:
                System.out.println("data = " + data);
            case 2:
                System.out.println("data = " + data);

            default:
                System.out.println("default的数值");
                break;


        }
    }
}
