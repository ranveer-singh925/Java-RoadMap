package classes.innerClass.types;

public class NonStaticInnerClass {
    private String name= "Ranveer Singh";
    public static void main(String[] args){
        System.out.println(" in main method-->");
        NonStaticInnerClass outerClassObj = new NonStaticInnerClass();
        NonStaticInnerClass.innerClass innerClassObj= outerClassObj.new innerClass();
        innerClassObj.printMessage();
    }

    class innerClass{
        public void printMessage(){
            System.out.println(name+"-> we access the name from outerClass to " +
                    "InnerClass");
        }
    }
}
