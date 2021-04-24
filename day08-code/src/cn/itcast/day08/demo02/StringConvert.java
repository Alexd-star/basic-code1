package cn.itcast.day08.demo02;
/*
String 当中与转换相关的方法有：

public char[] toCharArray(); 将当前字符串拆分成字符数组作为返回值
public byte[] getBytes(); 获得当前字符串底层的字节数组
public String replace (CharSequence oldString, CharSequence newString);
将所有出现的老字符串替成新的字符串   返回替换之后的结果新字符串
备注：CharSequence 意思就是说可以接受字符串类型
 */
public class StringConvert {
    public static void main(String[] args) {
        //将字符串转变为字符数组
        char[] chars = "Hello".toCharArray();
        int length = chars.length;
        System.out.println(length);
        System.out.println(chars[1]);

        //将字符串转变为字节数组
        byte[] bytes = "Hello".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //将所有出现的老字符串替成新的字符串
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str2);
    }
}
