package cn.itcast.day11.demo05;

public class Hero {
    private String name;
    private int age;
    private Weapon weapon;//类作为成员变量类型（同String用法，其实String也是一个类）

    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }
    public void attack(){
        System.out.println(age+"岁的英雄"+name+"使用"+weapon.getCode()+"攻击敌人");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
