package cn.itcast.day10.demo01;
/*
接口就是多个类的公共规范。
接口是一种引用数据类型，最重要的内容就是其中的；抽象方法

接口可以看成是一种特殊的类，只能用interface关键字修饰。接口是提供给别人调用的。Java中的接口具有以下几个特点：
1、接口中可以包含变量和方法，变量被隐式指定为public static final，方法被隐式指定为public abstract（JDK 1.8之前）；
2、接口支持多继承，即一个接口可以继承（extends）多个接口，间接解决了Java中类不能多继承的问题；
3、一个类可以同时实现多个接口，一个类实现某个接口则必须实现该接口中的抽象方法，否则该类必须被定义为抽象类；
4、JDK 1.8中对接口新增了两个特性：

（1）默认方法（default method）：JDK 1.8允许给接口添加非抽象的方法实现，但必须使用default关键字修饰；
定义了default的方法可以不被实现子类所实现，但只能被实现子类的对象调用；
如果子类实现了多个接口，并且这些接口包含一样的默认方法，则子类必须重写默认方法。
（2）静态方法（static method）：JDK 1.8中允许使用static关键字修饰一个方法，并提供实现，
称为接口静态方法。接口静态方法只能通过接口调用（接口名.静态方法名）。
5、在JDK 1.9中，再次对接口进行了增强，可以实现private method和private static method。
因为JDK 1.8中可以对接口中的方法进行实现，那么当我们不希望实现的方法暴露给外部时，则可以将方法定义为private。

如何定义一个接口：
public interface 接口名称{
    //接口内容
}

备注：关键字换成了interface后，编译生成的字节码文件依然是：.java--.class

（一）Java7,接口可以包含的内容有：
1.常量
2.抽象方法
（二）Java8，额外包含：
3.默认方法
4.静态方法
（三）Java9，额外包含：
5.私有方法

接口使用步骤：
1.接口不能够直接使用，必须有一个实现类来实现该接口
格式：
public class 实现类名称 implements 接口名称{
    //...
}
2.接口的实现类必须覆盖重写（实现）接口中的所有抽象方法
实现：去掉abstract关键字加上方法体大括号
3.创建实现类的对象，进行使用
 */
public class Demo01Interface {

    public static void main(String[] args) {
        //错误写法！不能直接new接口对象使用
//        MyInterfaceAbstract myInterfaceAbstract =new MyInterfaceAbstract();
        //创建实现类的对象使用
        MyInterfaceAbstractImpl myInterfaceAbstract = new MyInterfaceAbstractImpl();

        myInterfaceAbstract.MethodAbs1();
        myInterfaceAbstract.MethodAbs2();
    }

}
