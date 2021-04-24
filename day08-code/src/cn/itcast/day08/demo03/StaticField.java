package cn.itcast.day08.demo03;
/*
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享数据
 */
public class StaticField {
    public static void main(String[] args) {
        Student stu1 = new Student("郭靖",19);
        stu1.room = "101室";
        System.out.println("姓名："+stu1.getName()+"，年龄："+stu1.getAge()+"，教室:"+stu1.room
                            +"，学号："+stu1.getId());

        Student stu2 = new Student("黄蓉",16);
        System.out.println("姓名："+stu2.getName()+"，年龄："+stu2.getAge()+"，教室"+stu2.room
                            +"，学号："+stu2.getId());


    }
}
