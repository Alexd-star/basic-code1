package cn.itcast.day07.demo1;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个值：");
        int a = sc.nextInt();
        System.out.println("输入第二个值：");
        int b = sc.nextInt();
        System.out.println("输入第三个值：");
        int c = sc.nextInt();

        //三目运算符
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值为：" + max);

    }
}

