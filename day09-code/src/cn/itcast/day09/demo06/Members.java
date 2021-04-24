package cn.itcast.day09.demo06;

import java.util.ArrayList;
import java.util.Random;
//成员
public class Members extends User{
    public Members() {
    }

    public Members(String name, int money) {
        super(name, money);
    }

    //接受红包方法
    public void receive(ArrayList<Integer> list){
        //随机获取一个红包索引
        int index = new Random().nextInt(list.size());
        //将获取的索引红包删除，并将其返回给delta
        int delta = list.remove(index);

        //索取成员当前的剩余金额
        int money = super.getMoney();
        //将返回到的红包金额加到当前剩余金额中，并重新设置成员的剩余金额
        super.setMoney(money+delta);

    }
}
