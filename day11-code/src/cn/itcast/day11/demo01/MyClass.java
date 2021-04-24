package cn.itcast.day11.demo01;
/*
1、当final关键字用来修饰一个类的时候，格式：
public final class名称{
    //...
}

含义：当前这个类不能有任何的子类（太监类）
注意：一个类如果是final的，那么其中所有的成员方法都无法进行覆盖重写（因为没有子类）

不能将一个final类当作父类

2、当以一个方法以final关键字修饰时，这个方法就是最终方法，不能够覆盖重写
格式：
public final 返回值类型 方法名称(参数列表){
    //...
}

注意事项：
对于类、方法来说，abstract和final关键字不能同时使用，因为矛盾
 */
public final class MyClass {
    public final void method(){
        System.out.println("方法执行");
    }
}
