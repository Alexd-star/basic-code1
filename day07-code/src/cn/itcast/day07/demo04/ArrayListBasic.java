package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
如果希望向ArrayList当中储存基本数据类型，必须使用包装类

基本类型    包装类
byte        Byte
short       Short
float       Float
int         Integer     【特殊】
long        Long
boolean     Boolean
char        Character   【特殊】
double      Double

从JDK1.5开始，支持自动装箱、自动拆箱
自动装箱：基本类型 ==> 包装类型
自动拆箱：包装类型 ==> 基本类型
 */
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> integers=new ArrayList<>();
        integers.add(100);
        integers.add(1200);

        System.out.println(integers);
    }
}
