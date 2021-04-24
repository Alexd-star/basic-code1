package cn.itcast.day06.demo02;
/*
当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量
如果需要访问本类当中的成员变量，需要使用格式
this.成员变量名
【重点】通过谁调用方法，谁就是this

在重名的情况下起到区分的效果
 */
public class DemoStudent {
    String name ;///我自己的名字

    //参数name是对方的名字
    //成员变量name是自己的名字
    public void sayHello(String name){
        System.out.println(name +",你好."+"我是"+this.name);//this在方法内，方法被对象调用
    }
    public static void main(String[] args) {

        DemoStudent people = new DemoStudent();
        people.name = "王健林";
        people.sayHello("王思聪");


        StudentBoolean stu = new StudentBoolean();
        stu.setName("蔡徐坤");
        stu.setAge(22);
        stu.setMale(false);

        System.out.println("名字:"+stu.getName());
        System.out.println("年龄:"+stu.getAge());
        System.out.println("是不是男人:"+stu.isMale());
    }

}
