package cn.itcast.day10.demo05;

public class Keyboard implements Usb{
    @Override
    public void open() {
        System.out.println("键盘打开");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    public void input(){
        System.out.println("键盘输入");
    }
}
