package cn.itcast.day11.demo04;
/*
如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，
那么这种情况下就可以省略掉该类的定义，而改用为【匿名内部类】

匿名内部类的定义格式：
接口名称 对象名  = new 接口名称{
    //覆盖重写所有的抽象方法
}；

对格式“new 接口名称(){...}”进行解析：
1.new 代表创建对象的动作
2.接口名称就是匿名内部类需要实现哪个接口
3.{...}才是匿名内部类的内容

注意：
1.匿名内部类，在【创建对象】的时候，只能使用唯一一次
如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了
2.匿名对象，在【调用方法】的时候，如果希望调用多次方法，那么必须给对象取一个名字
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterface obj = new MyInterfaceImpl();
//        obj.method();

//        使用匿名内部类
        MyInterface some = new MyInterface(){
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222！");
            }
        };
        some.method1();
        some.method2();
        System.out.println();

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface(){

            @Override
            public void method1() {
                System.out.println("B匿名内部类实现了方法！");

            }

            @Override
            public void method2() {
                System.out.println("B匿名内部类实现了方法222！");
            }
        }.method1();
    }
}
