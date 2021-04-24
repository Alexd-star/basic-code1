package cn.itcast.day05.demo02;
/*
总结：任何数据都能作为方法的参数类型，或者返回值类型

数组作为方法的参数，传递进去的其实是数组的地址值。
数组作为方法的返回值，返回的其实也是数组的地址值。

（1）.获取数组元素最大值或最小值

（2）.数组的元素反转
要求不能使用新的数组

1.数组元素反转，其实就是对称位置的元素交换
2.通常遍历数组用的是一个索引：
int i =0;
现在表示对称位置需要两个索引：
int min = 0;int max = array.length-1
3.交换两个变量的值
如果两个水杯都是满的，交换时需要用到第三个水杯倒手
int temp = a ;
a = b;
b = temp;
4.当min < max时应该交换
 */
public class ArrayMax {
    public static void main(String[] args) {
        int [] array = {0,5,12,6,32,55,1};
        int max1 = array[0];


        //打印数组原来的模样
        for (int i = 1; i < array.length; i++) {
            if (array[i]>max1){
                max1 = array[i];
            }
        }
        System.out.println("最大值："+max1);

        /*
        分析：
        初始化语句：int min = 0,max = array.length-1
        条件判断：min < max
        步进表达式：min++,max--
        循环体：用第三个变量倒手
         */

        for (int min = 0,max = array.length-1;min < max;min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }


        //数组可以作为方法的参数
        //调用打印数组方法,向方法的小括号进行传参，传递进去的其实是数组的地址值
        System.out.println("===========A=============");
        printArray(array);


        /*
        一个方法中可以有多个参数，但是只能有0或1个返回值，不能有多个返回值
        解决方法：使用一个数组作为返回值即可
         */
        int [] result = calculate(12,3,6);
        System.out.println("\n总和："+result[0]);
        System.out.println("平均数："+result[1]);
    }

    //创建一个printArray方法打印数组
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"、");
        }
    }

    public static int[] calculate(int a,int b,int c){
        int sum = a+b+c;
        int avg = sum/3;
        //两个结果都希望返回

        int [] array1 = {sum,avg};
        return array1;
    }
}
