package cn.itcast.day07.demo1;

import java.util.Scanner;//导包

/*
Scanner类：能够实现键盘输入数据到程序中

 引用类型的一般使用步骤：

 1.导包
 import 包路径.类名称
 如果需要使用的目标类和当前类位于同一个包下，则可以省略导包语句不写
 只有Java.lang 包下的内容不需要导包，其他的包都需要import语句（例如String）

 2.创建
 类名称 对象名 = new 类名称();

 3.使用
 对象名.成员方法名

 获取键盘输入的一个int数字：int num = sc.nextInt();
 获取键盘输入的一个String字符串：String str = sc.next(); //直接留空
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //2.创建
        //备注：System.in代表从键盘输入
        Scanner sc = new Scanner(System.in);

        //3.获取键盘输入的int数字
        //nextInt()将输入的内容转换成int类型
        int a = sc.nextInt();
        System.out.println("输入的Int数字是："+a);

        //4.获取键盘输入的String字符串
        //next()是直接转出所输入的内容
        String str = sc.next();
        System.out.println("输入的字符串是："+str);
    }
}
