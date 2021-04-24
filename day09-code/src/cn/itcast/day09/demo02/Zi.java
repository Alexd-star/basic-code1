package cn.itcast.day09.demo02;
/*
区分子类方法中重名的三种变量

局部变量：   直接写成员变量名
本类的成员变量： this.成员变量名
父类的成员变量名： super.成员变量名


 */
public class Zi extends Fu{
    int numZi = 20;
    int num = 200;

    public void MethodZi(){
        int num = 30;
        System.out.println(num);//局部变量30
        System.out.println(this.num);//本类的成员变量20
        System.out.println(super.num);//父类的成员变量100
    }

    public void method(){
        System.out.println("子类重名方法执行！");
    }

}
