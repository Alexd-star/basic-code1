package cn.itcast.day10.demo05;

public class MouseMove implements Usb{
    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

    public void click(){
        System.out.println("鼠标敲击");
    }
}
