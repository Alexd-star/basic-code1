package cn.itcast.day06.demo01;

public class Phone {
    String name ;
    int price;
    String color;

    public static void main(String[] args) {
        Phone one = new Phone();
        one.name = "苹果";
        one.color = "银白色";
        one.price = 8848;

        method(one); //用对象类型作为方法的参数

        //用对象类型作为方法的返回值
        //当使用一个对象作为方法的返回值时，返回值其实就是方法的地址值
        Phone two = getPhone();//赋值调用，直接调取对象one的地址值
        System.out.println(two.color);
        System.out.println(two.name);
        System.out.println(two.price);
    }


    public void call(String who){
        System.out.println("给"+who+"发短信");
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }

    //带有static就是普通方法：不需要创建对象调用，可以直接用方法名调用
    public static void method(Phone param){
        System.out.println(param.color);
        System.out.println(param.name);
        System.out.println(param.price);
    }

    //
    public static Phone getPhone(){
        Phone one = new Phone();
        one.name = "苹果";
        one.color = "银白色";
        one.price = 8848;
        return one;

    }
}
