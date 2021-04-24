package cn.itcast.day08.demo02;
/*
String当中与获取相关的常用方法有:

public int length();    获取字符串当中含有字符个数，拿到字符串的长度
public String concat(String str); 将当前字符串和参数字符串拼接成返回值成为一个新的字符串
public char chaAt(int index); 获取指定索引位置的单个字符。索引从0开始
public int indexOf(String str); 查找参数字符串在本字符串当中首次出现的索引位置，如果没有则返回-1
 */
public class StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "jdoaijsiohfoaifohs".length();
        System.out.println(length);

        //拼接字符串
        String a = "Hello";
        String b ="World";
        String c = a.concat(b);
        System.out.println(c);

        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println(ch);

        //查找小字符串在本字符串当中首次出现的索引位置
        String original = "HelloWorld";
        int index = original.indexOf("or");
        System.out.println(index);
    }
}
