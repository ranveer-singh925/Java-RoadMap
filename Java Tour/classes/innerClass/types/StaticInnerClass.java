package classes.innerClass.types;

public class StaticInnerClass {
    private String name= "Ansh";
    static String staticVariable= "static variable";
    public static void main(String[] args){
        StaticInnerClass.InnerClass obj = new StaticInnerClass.InnerClass();
        obj.printMessage();
    }
    public static class InnerClass{
        public void printMessage(){
            System.out.println(" we can not access the non-static member as " +
                    "the inner class is static class");
            System.out.println(staticVariable+ " -> we can access the static members");
        }
    }
}
