package cn.itcast.day07.work01;

import java.util.ArrayList;
/*
创建一个集合
遍历集合，输出结果：将[]换成{}，将,换成@

{大苏打@发噶发@小嘎是}
 */
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("大苏打");
        arrayList.add("发噶发");
        arrayList.add("小嘎是");
        System.out.println(arrayList);

        System.out.print("{");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == arrayList.size()-1){
                System.out.println(arrayList.get(i)+"}");
            }else {
                System.out.print(arrayList.get(i)+"@");
            }
        }

    }
}
