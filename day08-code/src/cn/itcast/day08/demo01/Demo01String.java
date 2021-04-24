package cn.itcast.day08.demo01;
/*
java.lang.String类代表字符串
API当中说：Java 程序中的所有字符串字面值（如："abc"）都作为此类的实例实现
其实就是说：程序当中所有的双引号字符串，都是String类的对象。（就算没有new,也照样是）

字符串的特点：
1.字符串的内容永不可改变。【重点】
2.正是因为字符串不可改变，所以字符串是可以共享使用的。（节省内存）
3.字符串效果上相当是char[]字符数组，但是底层是byte[]字节数组

创建字符串的3+1种形式：
1.public String(); 创建一个空白字符串，不含有任何内容
2.public String(char[] array); 根据字符数组内容，来创建对应字符串
3.public String(byte[] array); 根据字节数组内容，来创建对应字符串

直接创建字符串：
String str4 = "Hello"; //右边直接加上双引号

注意：直接加上双引号，其实就是对象
 */
public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();

        char[] array = {'A','B','C'};
        String str2 = new String(array);
        System.out.println(str2);

        byte[] array2 = {97,98,99};
        String str3  = new String(array2);
        System.out.println(str3);

        String str4 = "Hello";
        System.out.println(str4);
    }
}
