package classes.finalClass;

public final class FinalClass { /* we can not extends this class because it prevent it self from modification */
    public void getMessage() {
        System.out.println("inside the final class");
    }
}

class temp {
    public static void main(String[] args) {
        FinalClass objClass = new FinalClass();
        objClass.getMessage();
    }
}