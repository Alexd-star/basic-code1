package cn.itcast.day07.damo03;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎来到猜数字小游戏"+"\n请输入一个0~100的数字：");
        Random r = new Random();
        int num = r.nextInt(101);

        while (true) {//不确定循环次数，用死循环配合break语句
            int input = sc.nextInt();
            if (input < num) {
                System.out.println("你输入的数字小了！请重新输入：");
            } else if (input > num) {
                System.out.println("你输入的数字大了！请重新输入：");
            } else {
                System.out.println("恭喜你猜中了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
