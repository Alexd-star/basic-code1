package cn.itcast.day11.demo03;

public class Demo02InnerClass {
    public static void main(String[] args) {
        //【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
        Outer.Inner inner = new Outer().new Inner();
        inner.methodInner();

        //使用方法局部内部类，直接实例化外部类对象
        OuterInner outerInner = new OuterInner();
        outerInner.methodOuter();
    }
}
