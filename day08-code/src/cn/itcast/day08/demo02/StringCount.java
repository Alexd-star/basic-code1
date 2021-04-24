package cn.itcast.day08.demo02;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计  其中各种字符出现的次数
种类为：大写字母、小写字母、数字、其他
 */
public class StringCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = scanner.next();
        char[] chars = string.toCharArray();
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i] ;
            if ('A'<=ch && ch<='Z'){
                countUpper++;
            }else if ('a'<=ch && ch<='z'){
                countLower++;
            }else if ('0'<=ch && ch<='9'){
                countNumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母有："+countUpper+"个\n小写字母有："+countLower+"个\n数字有:"+countNumber+"个\n其他有"+countOther+"个");
    }
}
