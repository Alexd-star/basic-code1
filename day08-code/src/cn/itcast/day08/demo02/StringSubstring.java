package cn.itcast.day08.demo02;
/*
字符串的截取方法：

public String substring(int index);截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin,int end); 截取从begin开始，一直到end结束，中间的字符串
[备注] [begin,end) 包含左边,不包含右边
 */
public class StringSubstring {
    public static void main(String[] args) {
        String a = "HelloWorld";
        System.out.println(a);
        String b = a.substring(5);
        System.out.println(b);

        String c = a.substring(5,7);
        System.out.println(c);
        System.out.println("================");

        /*
        下面这种写法，字符串仍然是没有改变的
        下面有两个字符串："Hello","Java"
        strA保存的是地址值，本来地址是Hello的0x666
        后来地址值变成了Java的0x999
         */
        String strA = "Hello";
        strA = "JAVA";
        System.out.println(strA);

    }
}
