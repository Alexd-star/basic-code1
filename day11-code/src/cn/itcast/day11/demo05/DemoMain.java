package cn.itcast.day11.demo05;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);
        Weapon weapon = new Weapon("多兰剑");
        hero.setWeapon(weapon);
        hero.attack();

        hero.setName("剑圣");
        hero.setAge(34);
        weapon.setCode("大宝剑");
        hero.attack();
    }

}
