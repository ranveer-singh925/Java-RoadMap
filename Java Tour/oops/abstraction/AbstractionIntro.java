package oops.abstraction;

public class AbstractionIntro {

    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.start();
    }
}

class Audi extends Car implements carIdea{

    @Override
    void start() {
        System.out.println("Audi start");
    }

    @Override
    public void starting() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'starting'");
    }

}

// with the help of abstract class we can achive abstraction (not 100 % because we can give the method implementation also)

abstract class Car {
    int price;
    abstract void start();
}

//with the help of interfaces we can achieve 100% abstraction

interface carIdea{
    void starting();
    
}
