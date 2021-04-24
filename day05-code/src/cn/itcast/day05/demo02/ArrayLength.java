package cn.itcast.day05.demo02;
/*
获取数组长度的格式：
数组名称.length

数组长度一旦创建，在运行中则不可改变
 */
public class ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];
        int[] arrayB = {10,2,2,1,14,12,21,54,1,5,1,3513,15,2,15};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是："+len);

        //数组遍历，快捷：数组名称.fori
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
    }
}
