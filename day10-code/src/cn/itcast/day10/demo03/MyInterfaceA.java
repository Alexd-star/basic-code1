package cn.itcast.day10.demo03;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void common();

    public default void methodDefault(){
        System.out.println("AAA");
    }
}
