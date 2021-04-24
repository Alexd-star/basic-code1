package cn.itcast.day08.demo03;

public class StaticCodeArea {
    static {
        System.out.println("静态代码块执行！");
    }
    public StaticCodeArea(){
        System.out.println("构造方法执行！");
    }
}
