package cn.itcast.day08.Demo04;
/*
计算在-10.8到5.9之间，有多少绝对值大于6或者小于2.1的整数？
 */
public class MathPractise {
    public static void main(String[] args) {
        int count = 0;
        double max = 5.9;
        double min = -10.8;
        for (int i = (int) min;i<max;i++){
            int abs = Math.abs(i);
            if (abs<2.1||abs>6){
                count++;
            }
            System.out.print(abs+",");
        }
        System.out.println("\n"+count);
    }
}
