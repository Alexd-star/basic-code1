package cn.itcast.day05.demo02;
/*
1.动态初始化（指定长度）
2.静态初始化（指定内容）

静态初始化数组的标准格式
数据类型 [] 数组名称 = new 数据类型[]{元素1,元素2,...}

?1.静态初始化没有直接告诉长度，但根据大括号里的元素内容可以自动推算出长度
2.静态初始化标准格式和动态初始化可以拆分成两个步骤
3.静态初始化一旦使用了省略格式，就不能拆分成两个步骤了

如果不确定数组当中的具体内容，使用动态初始化；否则，已经确定了具体内容，用静态初始化

静态初始化数组的省略格式
数据类型 [] 数组名称 ={元素1,元素2,...}
 */
public class Array02 {
    public static void main(String[] args) {
        //创建一个数组：里面直接是int数字，具体为：5，15，25
        int[] arrayA = new int[]{5,15,25};

        int[] arrayB ;
        arrayB = new int[]{5,15,25};

        int[] arrayD ;
        arrayD = new int[5];


        //创建一个数组：里面直接是string数字，具体为：5，15，25
        String[] arrayC = new String[]{"Hello","World","Java"};
    }

}
