package design_patterns.lazyWay;


// both the way eager and lazy are not thread safe it means multiple thread create multiple object is possible to resolve it we have to make the getInstance() synch
public class SngletonDesignPattern {
    public static void main(String[] args) {
        A a = A.getInstance(); // create new instance
        A a1 = A.getInstance(); // try to create another new instance
        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
    }
}


class A {
    private static A checkOldInstance = null;

    private A() {
    }

    // lazy way to creating a singleton object (when reqired then the object is created means for the first time client need to call this method)
    public static A getInstance() {
        if (checkOldInstance == null) {
            checkOldInstance = new A();
        }
        return checkOldInstance;
    }
}

// constructor must be private so no one call it to make a new object
// object create with the help of method like we use getInstance.
//create field to store object is private
