package cn.itcast.day06.demo01;
/*
定义一个学生类

成员变量（属性）--定义直接在类当中的，在方法外边
    String name;
    int age ;
成员方法（行为）--不要写static
     public void eat(){}吃饭
     public void sleep(){}睡觉
     public void study(){}学习

     通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用
     1.导包
     import 包名称.类名称
     import cn.itcast.day06.demo01.Student
     对于和当前属于同一个包的情况，可以省略导包语句不写

     2.创建，格式：
     类名称 对象名 = new 类名称();
     Student stu = new Student();

     3.使用，分为两种情况：
     使用成员变量：对象名.成员变量名
     使用成员方法：对象名.成员方法名(参数)
     （想用谁，就用对象名点谁）
 */
public class Student {
    //直接写在类中的变量称为成员变量
    String name;//姓名
    int age ;//年龄

    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);//如果成员变量没有赋值，那么将会有一个默认值，规则和数组一样
        stu.age = 10;//将右边的int 赋值给对象的age变量
        System.out.println(stu.age);
    }
    //方法没有加static的称为成员方法
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
