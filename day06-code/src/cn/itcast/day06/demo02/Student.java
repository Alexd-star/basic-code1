package cn.itcast.day06.demo02;
/*
构造方法是专门来创建对象的方法，当我们创建对象的时候，实际上就是在调用构造方法
格式：
public 类名称(参数类型 参数名称）{
    方法体
}

注意事项：
1.构造方法的名称必须和所在类名称完全一样，连大小写也要一样
2.构造方法不要写返回值，连void都不写
3.构造方法不能return一个具体的返回值
4.如果没有编写任何构造方法，那么编译器将会默认赠送一个构造方法，没有参数、方法体什么事情都不做
public Student();{}
5.一旦编写了至少一个构造方法，那么编译器将不再赠送
6.构造方法也可以重载的
重载：方法名称相同，参数列表不同

一个标准的类通常要有下面四个组成部分
1.所有的成员变量都要用private修饰
2.为每个成员变量写一个Getter/Setter方法
3.编写一个无参构造方法
4.编写一个全参构造方法

快捷键：Alt + Insert Generate自动生成

这样的标准类也叫做Java Bean
 */
public class Student {
    //成员变量
    private String name;
    private int age;

    //无参构造
    public Student(){
        System.out.println("无参构造执行了！");
    }

    //全参构造
    public Student(String name ,int age){
        System.out.println("全参构造执行了");
        this.name = name;
        this.age = age;
    }

    //Getter/Setter
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
