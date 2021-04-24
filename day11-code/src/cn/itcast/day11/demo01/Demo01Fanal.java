package cn.itcast.day11.demo01;
/*
final关键字代表最终、不可改变的

常见四种写法：
1.可以来修饰一个类
2.可以来修饰一个方法
3.还可以来修饰一个局部变量
4.还可以来修饰一个成员变量
 */
public class Demo01Fanal {
    public static void main(String[] args) {
        int num1 =20;
        System.out.println(num1);
        num1 = 10;
        System.out.println(num1);

        //一旦使用final用来修饰局部变量，那么这个变量就不能进行更改
        //一次赋值，终生不变
        final int num2 = 200;
        System.out.println(num2);//200

        final int num3;//正确写法，只要保证有唯一一次赋值即可
        num3 = 15;

        //对基本类型来说，不可变说的是变量当中的数据不可变
        //对引用数据来说，不可变说的是变量当中的地址值不可变


    }

}
