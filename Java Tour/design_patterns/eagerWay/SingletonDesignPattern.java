package design_patterns.eagerWay;


// both the way eager and lazy are not thread safe it means multiple thread create multiple object is possible to resolve it we have to make the getInstance() synch
public class SingletonDesignPattern {
    public static void main(String[] args) {
        Demo demo= Demo.getInstance();
        Demo demo1= Demo.getInstance();

        System.out.println(demo.equals(demo1));
    }
}

class Demo {
    private static Demo demo = new Demo(); // the object is created at the time of class loading

    private void demo() {
    }
    public static Demo getInstance(){
        return demo;
    }
}

// disadvantage is - may be the object is not required to create it.