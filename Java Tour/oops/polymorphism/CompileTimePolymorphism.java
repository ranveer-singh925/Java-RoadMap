package oops.polymorphism;

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Temp tempObj = new Temp();
        tempObj.name = "Ranveer";

        // example for compile-time polymorphism
        tempObj.walk();
        tempObj.walk(2);
    }
}

class Temp {
    String name;

    void walk() {
        System.out.println(name + " walking");
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
    }
}
