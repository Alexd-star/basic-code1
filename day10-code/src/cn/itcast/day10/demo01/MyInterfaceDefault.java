package cn.itcast.day10.demo01;
/*
从Java8开始，接口内允许包含默认方法
格式：
public default 返回值类型 方法名称（参数列表）{
    方法体
}

备注：接口中的默认方法，可以解决接口升级的问题
 */
public interface  MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    //默认方法
    public default void methodDefault(){
        System.out.println("这是新添加的接口默认方法");
    }
}
