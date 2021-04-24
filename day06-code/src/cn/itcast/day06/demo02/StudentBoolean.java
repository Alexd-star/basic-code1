package cn.itcast.day06.demo02;
/*
对于基本类型当中的boolean值，Getter方法一定要写成isXxx形式，而Setter规则不变
 */
public class StudentBoolean {
    private String name;
    private int age ;
    private boolean male;

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }

    public void setAge(int num) {
        age = num;
    }
    public int getAge() {
        return age;
    }

    public void setName(String str) {
       name = str;
    }

    public String getName() {
        return name;
    }
}
