package classes.innerClass.types;

class product{
    public void display(){
        System.out.println("we are called from product class");
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args){

        product product = new product(){
            // here we override the method written in product class
            public void display(){
                System.out.println("we are called from Anonymous class");
            }
        };
        product.display();
    }
}
