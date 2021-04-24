package cn.itcast.day07.damo03;
/*
Random用来生成一个随机数字
引用类都是三个步骤：
1.导包
import java.util.Random;
2.创建
Random ran =new Random();
3.使用
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = ran.nextInt();
获取一个随机的int数字(参数代表了范围，左闭右开区间): int num = ran.nextInt(3);
实际上代表的含义是：[0,3),也就是0~2

 */

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random ran = new Random();
        int num = ran.nextInt();
        System.out.println("生成的随机数字是："+num);
    }

}
