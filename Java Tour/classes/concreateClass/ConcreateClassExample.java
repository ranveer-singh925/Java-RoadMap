package classes.concreateClass;

class ConcreateClassExample{
    // method of the concreted class
    static int product(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        // method calling
        int p = product(6, 8);
        System.out.println("Product of a and b is: " + p);
    }
}

/*
 * it is regular Java classes in which all the methods of an abstract class are
 * implemented
 * or in general- we can create a object of that class using new keywords
 */