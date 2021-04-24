package cn.itcast.day10.demo01;
/*
从Java9开始，接口内允许包含私有方法

1.普通私有方法,解决多个默认方法之间重复代码问题
格式：
private返回值类型 方法名称（参数列表）{
    方法体
}

2.静态私有方法,解决多个静态方法之间重复代码问题
格式：
private static 返回值类型 方法名称（参数列表）{
    方法体
}
 */
public interface MyInterfacePrivateA {
    public default void methodPrivateA(){
        System.out.println("默认方法1");
        methodCommon();
    }
    public default void methodPrivateB(){
        System.out.println("默认方法2");
        methodCommon();
    }

    private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }


    public static void methodPrivate1(){
        System.out.println("默认方法1");
        methodCommon2();
    }
    public static void methodPrivate2(){
        System.out.println("默认方法2");
        methodCommon2();
    }

    private static void methodCommon2(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
