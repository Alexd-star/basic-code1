package cn.itcast.day09.demo03;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone p  = new Phone();
        p.call();
        p.send();
        p.show();
        System.out.println("===============");

        NewPhone n = new NewPhone();
        n.call();
        n.send();
        n.show();
    }
}
