package classes.innerClass.types;

public class LocalClassDemo {
    String name="Ansh";
    private Long number= 9169511070L;
    public static void main(String[] args){
    LocalClassDemo localClassDemo= new LocalClassDemo();
    localClassDemo.display();
    }

    public void display(){
        System.out.println("I'm from display method--");
        class LocalClass{
            public void printMessage(){
                System.out.println("I'm from Local class");
                System.out.println(number+"-> access the members of outer class->"+ name);

            }
        }
        LocalClass obj= new LocalClass();
        obj.printMessage();
    }
}
