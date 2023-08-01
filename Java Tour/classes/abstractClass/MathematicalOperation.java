package classes.abstractClass;
abstract class MathematicalOperation {
    public abstract void test();

    public String getMessage() {
        return "test";
    }
}

class MainClass extends MathematicalOperation {
    public static void main(String[] args) {
        MathematicalOperation obj = new MainClass();
        System.out.println(obj.getMessage());
        obj.test();
    }

    @Override
    public void test() {
        System.out.println("overridden method ");
    }
}