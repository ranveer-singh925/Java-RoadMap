package classes.staticClass;

public class NormalClass {

    public static class StaticClass {
        public String getName() {
            return "return from staticClass";
        }
    }

    public static void main(String[] args) {
        NormalClass.StaticClass obj = new NormalClass.StaticClass();
        System.out.println(obj.getName());
    }
}
