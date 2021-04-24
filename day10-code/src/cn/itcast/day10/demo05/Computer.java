package cn.itcast.day10.demo05;

public class Computer {

    //使用Usb设备的方法，使用接口作为方法的参数
    public void useDevice(Usb usb){
        usb.open();
        if(usb instanceof MouseMove){
            MouseMove mouseMove = (MouseMove)usb;
            mouseMove.click();
        }

        if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.input();
        }
        usb.close();
    }
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }
}
