package oops.classes;

public class BasicClassDemo {
    public static void main(String[] args){
        person obj= new person();
        obj.age=12;
        obj.name="Ranveer";
        obj.eat();

        System.out.println(obj.age+" --- "+obj.name);
    }
}

class person{
    int age;
    String name;

    //let define some behavior for the person class
    void walk(){
        System.out.println(name+" walking ");
    }
    void eat(){
        System.out.println(name+" eating ");
    }

}
