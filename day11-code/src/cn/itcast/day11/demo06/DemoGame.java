package cn.itcast.day11.demo06;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");
        hero.setSkill(new SkillImpl());//直接使用单独的定义类

        //还可以改成使用匿名内部类
        Skill skill =new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~pia~Pia~");
            }
        };
        hero.setSkill(skill);

        //进一步简化：同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~pia~Pia~");
            }
        });

        hero.attack();
    }
}
