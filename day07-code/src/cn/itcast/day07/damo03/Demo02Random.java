package cn.itcast.day07.damo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random ran = new Random();

        for (int i = 0; i < 100; i++) {
            int num = ran.nextInt(10);//范围实际上是0~9（左闭右开）
            System.out.println(num);
        }
    }


}
