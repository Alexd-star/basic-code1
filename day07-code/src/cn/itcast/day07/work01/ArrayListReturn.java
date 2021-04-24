package cn.itcast.day07.work01;

import java.util.ArrayList;
import java.util.Random;
/*
用一个大集合存入20个数字，然后筛选其中的偶数元素，放到小集合中
要求使用自定义方法来实现筛选
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Random random =new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(99);
            arrayList.add(num);
        }
        System.out.println(arrayList);
        ArrayList<Integer> arrayListSmall = dou(arrayList);//接收返回值
        System.out.println(arrayListSmall);
        System.out.println("偶数总共有:"+arrayListSmall.size()+"个");
    }

    public static ArrayList<Integer> dou(ArrayList<Integer> arrayList){
        ArrayList<Integer> arrayListSmall = new ArrayList<>();
        for (int i = 0;i<arrayList.size();i++){
            int num = arrayList.get(i);
            if (num %2 ==0){
                arrayListSmall.add(num);
            }
        }
        return arrayListSmall;
    }
}
