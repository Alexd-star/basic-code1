package cn.itcast.day08.demo03;

public class MyClass {
    int num;
    static int numStatic;

    //成员方法
    public  void method(){
        //成员方法可以访问成员变量
        System.out.println(num);
        System.out.println(numStatic);
        System.out.println("这是一个成员方法！");
    }

    //静态方法
    public static void methodStatic(){
        //静态方法可以访问静态变量
        System.out.println(numStatic);
        //静态方法不可以直接访问成员变量
//        System.out.println(num);//错误！
        System.out.println("这是一个静态方法！");
        //静态方法中不能用this关键字
//        System.out.println(this);
    }
}
