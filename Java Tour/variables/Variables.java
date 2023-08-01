package variables;

public class Variables {
    static int staticVariable = 11;
    int instanceVariable = 10;

    public static void main(String[] args) {
        int localVariable = 10;
        System.out.println(localVariable);
        System.out.println(staticVariable + " staticVariable");

        Variables obj = new Variables(); // the obj is also known as instance variables not the object
        obj.foo();
    }

    public void foo() {
        System.out.println(instanceVariable + "   instanceVariable");
        System.out.println(staticVariable + " staticVariable in foo method");
    }
}