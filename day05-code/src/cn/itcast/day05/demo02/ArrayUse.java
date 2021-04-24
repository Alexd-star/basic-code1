package cn.itcast.day05.demo02;
/*
直接打印数组名称，得到的是数组对应的：内存地址哈希值
二进制：01
十进制：0123456789
十六进制：0123456789abcdef

访问数值元素的格式：数组名称[索引值]
索引值：就是一个int 数字，代表数组当中的元素编号
【注意】：索引值从0开始；一直到‘数组的长度-1’为止
 */
public class ArrayUse {
    public static void main(String[] args) {
        //静态初始化数组的省略格式
        int[]array= {10,20,30};
        //直接打印数组的元素
        System.out.println(array);//[I@5fd0d5ae
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //也可以将数组当中某一个单个元素赋值给变量
        int num = array[1];
        System.out.println(num);

        /*
        使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下
        如果是整数类型，那么默认为0；
        如果是浮点类型，那么默认为0.0；
        如果是字符类型，那么默认为'\u0000';
        如果是布尔类型，那么默认为false;
        如果是引用类型，那么默认为null；

        ！静态初始化其实也有默认值的过程，只不过系统自动马上将默认值替换成了大括号中的具体数值。
         */
        int[] array22 =new int[3];
        System.out.println(array);//内存地址值
        System.out.println(array22[0]);
        System.out.println(array22[1]);//0
        System.out.println(array22[2]);
        //将123赋值给数组中的1号元素
        array22[1] = 123;
        System.out.println(array22[1]);//123

        //将array22的地址值赋值给arrayB
        int[] arrayB = array22;
        System.out.println(arrayB);

        /*如果访问数组元素的时候，索引编号不存在，那么将会发生数组索引越界异常
        ArrayIndexOutOfBoundsException

        原因：索引编号写错了
        解决：修改成为正确的索引编号
        */
        //System.out.println(array[3]);

    }
}
