package cn.itcast.day07.demo2;
/*
匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
new 类名称();

使用建议：如果确定只有一个对象只需要使用唯一的一次，就可以使用匿名对象
 */
public class Anonymous {
    public static void main(String[] args) {
        //正常创建对象
        Person one = new Person();
        one.name = "李";
        one.showName();

        //创建匿名对象
        new Person().name = "赵又廷";
        new Person().showName();
    }
}
