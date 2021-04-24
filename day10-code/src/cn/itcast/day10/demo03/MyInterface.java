package cn.itcast.day10.demo03;
/*
4个方法
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public abstract void method();

    @Override
    public default void methodDefault() {

    }
}
