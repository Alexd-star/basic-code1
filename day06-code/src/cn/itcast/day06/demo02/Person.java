package cn.itcast.day06.demo02;
/*
定义Person的年龄时，无法阻止不合理的数值设置进来
用private关键字将需要保护的成员变量进行修饰

一旦使用了private进行修饰，那么在本类当中仍然可以任意访问
但是超过了本类的范围之外就不能再直接访问了

简介访问private成员变量，就是定义一对Getter/Setter方法

格式：必须叫setXxx或者是getXxx命名规则  （setName）
对于Getter来说，不能有参数，返回值类型和成员变量相对应
对于Setter来说，不能有返回值，参数类型和成员变量相对应
 */
public class Person {
    String name;
    //private好处，外边无法直接访问，只允许间接访问，阻止不合理数据设置进来，提高了代码的安全性
    private int age;

    public void show(){
        System.out.println("我叫："+name+",年龄"+age);
    }

    //这个成员方法，专门用来向age设置数据 (往里放)
    public void setAge(int num){//无返回值
        if (num<100 && num>=9) {
            age = num;
        }else{
            System.out.println("数据不合理！");
        }
    }

    //这个成员方法，专门用来获取age的数据 (往外拿)
    public int getAge(){//返回值的类型必须与原变量的类型相同
        return age;
    }
}
