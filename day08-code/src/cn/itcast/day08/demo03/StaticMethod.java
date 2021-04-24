package cn.itcast.day08.demo03;
/*
一旦使用static修饰成员方法，那么这就成了静态方法。静态方法不属于对象，而是属于类的

如果没有static关键字，那么必须首先创建对象，然后通过对象才能来调用该方法
如果有了static关键字，那么不需要创建对象，直接就能通过类名调用它

无论是成员变量还是成员方法，如果有了static，都推荐用类名称进行调用
静态变量：类名称.静态变量
静态方法：类名称.静态方法()

通过类名称访问静态成员变量的时候，全程和对象没关系，只和类有关系（直接去静态区寻找static变量）

注意事项：
1.静态不能直接访问非静态
原因：因为在内存当中是【先】有的静态内容，【后】有的非静态内容
“先人不知道后人，但是后人知道先人”
2.静态方法中不能使用this
原因：this代表当前对象。通过谁调用的方法，谁就是当前对象
 */
public class StaticMethod {
    public static void main(String[] args) {
        //创建对象使用没有static关键字的方法
        MyClass my1 = new MyClass();
        my1.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以通过类名来调用
        my1.methodStatic();//正确,不推荐（容易误以为这是一个普通的成员方法）
        MyClass.methodStatic();//正确，推荐

        //对于本类当中的静态方法，可以省略类名称
        myMethod();

    }
    public static void myMethod(){
        System.out.println("自己的方法！");
    }
}
