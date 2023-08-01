package classes.singletonClass;

public class SingletonClassExample { 
    private String objectState;
    private static SingletonClassExample instance;
    private SingletonClassExample(){
        this.objectState = "Javatpoint";
    }

    /* the main logic to get the SingletonClass instance */
    public static SingletonClassExample getInstance(){
        if(instance==null){
            instance= new SingletonClassExample();
        }
        return instance;
    }
    
    public String getObjectState() {
        return objectState;
    }
}

class MainClass{
    public static void main(String[] args) {
        SingletonClassExample a= SingletonClassExample.getInstance();
        System.out.println(a.hashCode());

        SingletonClassExample b = SingletonClassExample.getInstance();
        System.out.println(b.hashCode());

        SingletonClassExample c = SingletonClassExample.getInstance();
        System.out.println(c.hashCode());

        if(a==b && b==c){
            System.out.println("instance are same -> SingletonClassExample");
        }
       System.out.println(c.getObjectState());
    }
}
