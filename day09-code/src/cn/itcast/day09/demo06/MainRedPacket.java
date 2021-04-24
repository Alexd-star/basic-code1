package cn.itcast.day09.demo06;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        //创建一个群主对象，设置群主的名字和拥有的钱数
        Manage manage = new Manage("群主",100);

        //创建三个成员对象，设置其名字和拥有的钱数
        Members one = new Members("成员1",0);
        Members two = new Members("成员2",10);
        Members three = new Members("成员3",20);

        //展示群主和各成员目前的信息
        manage.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=================");

        //调用send方法，设置群主发的红包金额和红包个数，并把红包放到ArrayList集合中
        ArrayList<Integer> redList = manage.send(26,3);

        //成员接受红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        //展示群主和各成员目前的信息
        manage.show();
        one.show();
        two.show();
        three.show();
    }
}
