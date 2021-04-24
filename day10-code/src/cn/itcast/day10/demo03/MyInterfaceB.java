package cn.itcast.day10.demo03;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void common();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
