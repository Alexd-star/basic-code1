package cn.itcast.day08.demo02;
/*
==是进行对象的地址值比较，如果确实需要字符串比较的，可以用两个方法：

public boolean equals(Object obj):
参数可以是任何对象，只有参数是一个字符串并且内容相同才会给true，否则返回false

 注意事项：
1.任何对象都能用Object进行接收
2.equals方法具有对称性，也就是a.equals(b)和a.equals(a)效果一样
3.比较双方一个常量一个变量，推荐把常量字符串写在前面。
推荐：常量.equals(变量);  //如果变量在前的话，赋值为null，就会报错：空指针异常（点前面为null）

public boolean equalsIgnoreCase(String str) //忽略大小写，进行内容比较
 */
public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] arrays = {'H','e','l','l','o'};
        String str3 = new String(arrays);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

        String str5  = null;
        System.out.println("abc".equals(str5));
//        System.out.println(str5.equals("abc"));//赋值为null，就会报错：空指针异常（点前面为null）
        System.out.println("===============");


        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equalsIgnoreCase(strB));//忽略大小写
    }
}
