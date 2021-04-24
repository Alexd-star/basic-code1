package cn.itcast.day07.demo2;

import java.util.Scanner;

public class Demo01Anonymous {
    public static void main(String[] args) {
        //普通创建对象
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //匿名对象的方式
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的数字为：" + num);

        //一般传入参数
        Scanner sc1 = new Scanner(System.in);
        methodParam(sc1);

        //使用匿名对象来传参
        methodParam(new Scanner(System.in));

        Scanner sc2 = methodReturn();
        int aa = sc2.nextInt();
        System.out.println("输出的数字是："+ aa);
    }

    public static void methodParam(Scanner sc) {//静态内部类
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);
    }

    //用匿名对象作为方法的返回值
    public  static Scanner methodReturn(){
//        Scanner sc = new Scanner();
//        return sc;
        return new Scanner(System.in);
    }
}
