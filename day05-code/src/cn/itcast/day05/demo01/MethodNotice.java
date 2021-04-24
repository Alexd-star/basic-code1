package cn.itcast.day05.demo01;

/*
使用方法时，注意事项

1.方法应该定义在类当中，但是不能在方法中再定义方法。不能嵌套
2.方法定义的前后顺序无所谓
3.方法定义后不会执行，如果需要执行，一定要调用：单独调用、打印调用、复制调用
4.如果方法有返回值，那么必须写上“return 返回值”，不能没有
5.return后面的返回值数据，必须跟方法的返回值类型对应起来
6.一个方法中可以有两个return语句，但是必须要保证同时只有一个会被执行，两个return不能连写
 */
public class MethodNotice {
    public static int method(){
        return (int)10.1;
    }
    public static void method2(){
        return;//没有返回值，只是结束方法的执行而已
    }
    public static void method3(){
        System.out.println("aaa");
        // return; 可以没有return
    }
    public static int getMax(int a,int b){
        /*int max;
        if(a>b){
            max= a;
        }else {
            max=b;
        }
        return max;
        */
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
    public static void main(String[] args) {

    }

}
