package cn.itcast.day08.Demo04;
/*
java.util.Math 类是数学相关的工具类，里面提供了大量的静态方法，完成于数学运算相关的操作

 public static double abs (double num): 获取绝对值
 public static double ceil(double num): 向上取整
 public static double floor(double num): 向下取整
 public static long round (double num): 四舍五入

 Math.PI（double）代表近似圆周率常量
 */
public class Demo01Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));//3.14
        System.out.println(Math.abs(-20.1));//20.1

        //向上取整
        System.out.println(Math.ceil(3.19));//4
        System.out.println(Math.ceil(3.1));//4

        //向下取整,抹零
        System.out.println(Math.floor(3.19));//3
        System.out.println(Math.floor(3.9));//3

        //四舍五入
        System.out.println(Math.round(3.4));//3
        System.out.println(Math.round(3.5));//4
    }
}
