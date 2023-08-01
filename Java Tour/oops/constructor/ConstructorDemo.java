package oops.constructor;

public class ConstructorDemo {
    public static void main(String[] args) {
        Temp temp = new Temp();
        Temp temp2 = new Temp("Ranveer");

        System.out.println(temp.name + " - get name using default constructor object");
        System.out.println(temp2.name + " - get name using parametrized constructor object "+ temp2.age);
    }
}

class Temp {
    public Temp() {
        System.out.println(" default constructor");
    }

    public Temp(String name) {
        this();
        this.name = name;
        this.age = 23;
    }

    String name;
    int age;
}
