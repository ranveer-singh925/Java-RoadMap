package oops.encapsulation;

public class EncapsulationDemo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        // perfoem some validation or security varification then apply to changes the values.
        this.name = name;
    }
}

class Test {
    public static void main(String[] args) {
        EncapsulationDemo s = new EncapsulationDemo();
        s.setName("Harry Potter");
        System.out.println(s.getName());
    }
}