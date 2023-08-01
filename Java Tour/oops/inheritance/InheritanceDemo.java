package oops.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Developer developer = new Developer("Ranveer",22);
        developer.getWalk();
    }
}

class Person {
    String name;
    Integer age;

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    void getWalk() {
        System.out.println(name + " is walkable");
    }

}

class Developer extends Person {

    Developer(String name, Integer age) {
        super(name, age);
    }

    void getWalk() {
        System.out.println(name + " is walkable in developer mode");
    }

}

class Manager extends Person {

    Manager(String name, Integer age) {
        super(name, age);
    }

}