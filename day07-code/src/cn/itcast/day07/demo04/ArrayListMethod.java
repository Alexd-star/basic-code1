package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
ArrayList常用的方法有：

public boolean add(E e):向集合中添加元素，参数的类型与泛型一致，返回值代表是否添加成功
备注：对于ArrayList来说，add添加动作一定是成功的，所以返回值可用可不用
但是对于其他集合（今后学习）来说，add添加的动作不一定成功

public E get(int index):从集合中获取元素，参数是索引编号，返回值就是对应位置的元素

public E remove(int index):从集合当中删除元素，参数是索引编号，返回值就是被删掉的元素

public int size():获取集合的尺寸长度，返回值是集合中包含的元素个数
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合中添加元素:add
        list.add("留言");
        System.out.println(list);
        boolean success = list.add("打打怪");
        System.out.println("添加的动作是否成功"+success);

        list.add("打打");
        list.add("a答");
        list.add("富瓦夫");
        System.out.println(list);

        //从集合获取元素，索引从0开始
        String name = list.get(2);
        System.out.println("第二号索引位置："+name);

        //从集合中删除元素:remove,索引从0开始
        String whoRemoved = list.remove(3);
        System.out.println(whoRemoved);//被删除的字符串
        System.out.println(list);

        //获取集合的长度
        int size = list.size();
        System.out.println("集合的长度是："+size);

        //一般循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("=================");
        //for:each语句循环遍历
        for (String a : list) {
            System.out.println(a);
        }
    }
}
