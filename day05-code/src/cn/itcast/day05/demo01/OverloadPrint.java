package cn.itcast.day05.demo01;
/*
println的重载
 */
public class OverloadPrint {
    public static void main(String[] args) {
        myprint((byte)100);
    }
    public static void myprint(byte num){
        System.out.println(num+"byte");
    }
    public static void myprint(long lon){
        System.out.println(lon);
    }
    public static void myprint(double zifu){
        System.out.println(zifu);
    }
    public static void myprint(boolean is){  //shift + F6(统一修改该变量名所有使用的地方)
        System.out.println(is);
    }
}
