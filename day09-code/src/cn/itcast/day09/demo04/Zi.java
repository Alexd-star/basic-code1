package cn.itcast.day09.demo04;

public class Zi extends Fu{
    public Zi(){
        //super(); 在调用父类的无参构造方法
        super(10);//调用父类重载的构造方法
        System.out.println("子类构造方法！");
    }
}
