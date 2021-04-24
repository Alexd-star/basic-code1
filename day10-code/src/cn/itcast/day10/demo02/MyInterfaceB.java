package cn.itcast.day10.demo02;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void method();

    public default void method1(){
        System.out.println("BBB");
    }
}
