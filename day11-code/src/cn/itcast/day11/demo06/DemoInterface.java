package cn.itcast.day11.demo06;

import java.util.ArrayList;
import java.util.List;
/*
Java.util.List正是ArrayList所实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称（多态写法）
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));//使用get方法得到集合中的各元素
        }
    }

    //接口作为方法的参数和返回值
    public static List<String> addNames(List<String> list){

        list.add("132");
        list.add("262");
        list.add("sdw");
        list.add("dad");

        return list;
    }
}
