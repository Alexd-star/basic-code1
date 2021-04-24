package cn.itcast.day08.Demo04;

import java.util.Arrays;

/*
 java.util.Arrays 是一个数组有关的工具类，里面提供了大量的静态方法，用来实现数组的常见操作

 public static String toString(数组);将参数数组变成字符串（按照默认格式：[元素1，元素2，元素3..]
 public static void sort(数组)； 按照默认升序（从小到大）对数组的元素进行排序

 1.如果是数值，sort默认按照升序从小到大
 2.如果是字符，sort按照字母升序
 3.如果是自定义类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持（今后学习）
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] array = {10,20,30};
        String a = Arrays.toString(array);
        System.out.println(a);

        int[] array1 = {2,1,6,54,4,8};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String []array2 = {"aaa","ccc","bbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
