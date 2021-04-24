package cn.itcast.day10.demo02;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void method();

    public default void method1(){
        System.out.println("AAA");
    }

    public default void method11(){
        System.out.println("接口当中的方法");
    }
}
