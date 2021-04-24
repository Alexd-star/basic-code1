package cn.itcast.day05.demo01;
/*
对于功能类似的方法来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦

方法的重载(overload):多个方法的名称一样，但是参数列表却不一样
方法重载使代码更加简便：只需要记住一个方法名称，就可以实现类似的多个功能

方法重载与以下几个因素相关：
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同

方法重载与下列因素无关：
1.与参数名称无关
2.与方法的返回值类型无关

 public  static int sum(int a ,int b){
        return a+b;
    }
  public  static int SUM(int a ,int b){//java中严格区分代码大小写，代码正确不会报错，但并不是有效重载
        return a+b;
    }
 */

public class MethodOverLoad {
    public static void main(String[] args) {
//        System.out.println(sumTow(10,20));
//        System.out.println(sumThree(10,20,30));
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
//        System.out.println(10,20,30,40);//找不到任何方法匹配
    }
    public  static int sum(int a ,int b){
        return a+b;
    }
    public  static int sum(double a ,double b,double c){
        return (int)(a+b+c);
    }
    public  static int sum(int a ,int b,int c){
        return a+b+c;
    }
}


