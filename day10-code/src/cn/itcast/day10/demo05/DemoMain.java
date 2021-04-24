package cn.itcast.day10.demo05;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer =new Computer();
        computer.powerOn();

        Usb usb = new MouseMove();//多态写法
        //方法参数是Usb，传进去的类型也是Usb
        computer.useDevice(usb);

        System.out.println("===================");
        Keyboard k = new Keyboard();//没有使用多态写法
        //方法参数是Usb，传进去的类型是实现类对象
        computer.useDevice(k);//正确写法！也发生了向上转型

        System.out.println("===================");
        //使用子类对象，匿名对象，都是可以的
        computer.useDevice(new Keyboard());//也是正确写法！

        computer.powerOff();
    }
}
