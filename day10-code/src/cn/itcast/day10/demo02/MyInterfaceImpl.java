package cn.itcast.day10.demo02;

public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("覆盖重写了A接口的抽象方法！");
    }

    @Override
    public void method() {
        System.out.println("覆盖重写了AB接口之间重复的抽象方法！");
    }

    @Override
    public void method1() {
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B接口的抽象方法！");
    }
}
