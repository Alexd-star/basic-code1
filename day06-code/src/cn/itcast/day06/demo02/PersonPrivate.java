package cn.itcast.day06.demo02;

public class PersonPrivate {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "赵丽颖";
        person.setAge(-20);
        person.show();
    }
}
