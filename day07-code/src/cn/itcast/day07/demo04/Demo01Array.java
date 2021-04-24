package cn.itcast.day07.demo04;
/*
定义一个数组，用来储存3个array对象

但数组有一个缺点：一旦创建数组，在运行过程中的数组长度就不可改变
解决：
ArrayList集合
 */
public class Demo01Array {
    public static void main(String[] args) {
        //创建数组产长度为3，用来储存Person类型对象
        Person[] array = new Person[3];

        //创建对象赋值
        Person one  = new Person(18,"迪丽热巴");
        Person two = new Person(27,"古力娜扎");
        Person three = new Person(38,"马尔扎哈");

        //将one中的地址值赋值到数组的0号元素当中
        array[0] = one;
        array[1] = two;
        array[2] = three;

        //输出地址值
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[1].getName());//古力娜扎
    }
}
