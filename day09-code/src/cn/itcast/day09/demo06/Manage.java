package cn.itcast.day09.demo06;

import java.util.ArrayList;
//  “群主”--发红包者
public class Manage extends User{
    public Manage() {
    }

    public Manage(String name, int money) {
        super(name, money);
    }

    //发红包方法
    public ArrayList<Integer> send(int totalMoney,int count){
        //定义一个ArrayList集合类，用来装若干红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //获取当前用户剩余的余额
        int leftMoney = super.getMoney();
        //如果发红包金额totalMoney超过剩余金额
        if (leftMoney<totalMoney){
            System.out.println("余额不足！");
            return redList;
        }

        //发出去红包后，重新设置用户的金额
        super.setMoney(leftMoney -totalMoney);
        int avg = totalMoney / 3;
        int mod = totalMoney % 3;

        //将生成的整除红包金额一个一个放到集合中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        //红包未整除的剩下的金额放到最后一个红包中
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}
