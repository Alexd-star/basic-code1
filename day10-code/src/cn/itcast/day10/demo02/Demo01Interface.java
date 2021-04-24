package cn.itcast.day10.demo02;
/*
使用接口时，需要注意：

1.接口是不能有静态代码块或者构造方法
2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
格式：
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{
    //覆盖重写所有的接口的所有抽象方法
}
3.如果实现类所实现的接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可
4.如果实现类没有覆盖重写所有的接口的所有抽象方法，那么实现类就必须是一个抽象类
5.一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先使用父类当中的方法
 */
public class Demo01Interface {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method11();
    }
}
