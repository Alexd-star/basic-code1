package cn.itcast.day09.demo03;

public class NewPhone extends Phone{
    public void call(){
        System.out.println("打电话");
    }
    public void send(){
        System.out.println("发短息");
    }
    public void show(){
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
