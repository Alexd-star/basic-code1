package cn.itcast.day10.demo01;
/*
1.接口的默认方法，可以通过接口实现类对象，直接调用
2.接口的默认方法，也可以被接口实现类覆盖重写
 */
public class Demo02Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefaultA myInterfaceDefaultA = new MyInterfaceDefaultA();
        myInterfaceDefaultA.methodAbs();//调用抽象方法，实际运行的是右侧的实现类

        //调用默认方法，如果实现类当中没有会向上寻找接口
        myInterfaceDefaultA.methodDefault();

        MyInterfaceDefaultB myInterfaceDefaultB = new MyInterfaceDefaultB();
        myInterfaceDefaultB.methodAbs();
        myInterfaceDefaultB.methodDefault();//实现类B重写了接口的默认方法
    }
}
