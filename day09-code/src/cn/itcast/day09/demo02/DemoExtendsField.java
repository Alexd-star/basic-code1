package cn.itcast.day09.demo02;
/*
在父类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找
间接通过成员方法访问成员变量：
     该方法属于谁（定义在哪），就优先用谁，没有则向上找

在父子类的继承关系种，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找
注意事项：
    无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类

重写（Override）
概念：在继承关系当中，方法的名称一样，参数列表也一样

重写(Override):方法的名称一样，参数列表【也一样】。覆盖、覆写
重载(Overload):方法的名称一样，参数列表【不一样】。

方法的覆盖重写特点：创建的是子类对象，则优先使用子类方法
注意事项：
1.必须保证父子类之间的方法名相同，参数列表也相同
@Override:写在方法前面，用来检测是不是有效的正确覆盖重写
这个注解就算不写，只要满足要求,也是正确的方法覆盖重写
2.子类方法的返回值必须【小于等于】父类方法的返回值范围
Object类是所有类的公共最高父类（祖宗类），java.lang.String就是Object的子类
3.子类方法的权限必须【大于等于】父类方法的权限修饰符
 */
public class DemoExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();//创建父类对象
        System.out.println(fu.numFu);//只能用父类的东西

        Zi zi = new Zi();
        System.out.println(zi.numFu);//30
        System.out.println(zi.numZi);//20

        System.out.println(zi.num);//优先子类：200

        //方法是子类的优先用子类，没有则向上找
        zi.MethodZi();
        //方法在父类中定义
        zi.MethodFu();

        zi.method();
    }
}
