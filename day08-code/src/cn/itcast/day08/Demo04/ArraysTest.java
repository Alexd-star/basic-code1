package cn.itcast.day08.Demo04;

import java.util.Arrays;

/*
使用Arrays相关的API
将一个随机字符串进行升序排序，并倒叙打印输出
 */
public class ArraysTest {
    public static void main(String[] args) {
        //定义随机的字符串
        String s = "jsd23jjivxcbrfdsue83";
        //将String 转为数组（toCharArray()方法）
        char[] a = s.toCharArray();

        //必须是一个数组，才能够用Array.sort方法
        Arrays.sort(a);

        //正序遍历
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+",");
        }
        System.out.println("]");

        //倒序遍历
        //快捷方式  (数组名称.forr)
        System.out.print("[");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]+",");
        }
        System.out.println("]");
    }
}
