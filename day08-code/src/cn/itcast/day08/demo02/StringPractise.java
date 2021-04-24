package cn.itcast.day08.demo02;
/*
题目：
定义一个方法，把数组{1，2，3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]
 */
public class StringPractise {
    public static void main(String[] args) {
        int[] array = {1,2,3,};

        System.out.println(ConcatString(array));
    }

    public static String ConcatString(int [] a){
        String string = "[";
        for (int i = 0; i < a.length; i++) {
            if (i == a.length-1) {
                string += "word" + a[i]+"]";
            }else {
                string += "word" + a[i] + "#";
            }
        }
        return string;
    }
}
