package classes.other_classes;
public class wrapperClassDemo {
    public static void main(String[] args){
        int rollNumber=19;
        Integer integer= Integer.valueOf(rollNumber);
        System.out.println(integer+"-> this process is called boxing (convert " +
                "primitive data to object)");
        int temp= integer.intValue();
        System.out.println(temp+"-> this process is called unboxing (convert object to " +
                "primitive data)");
    }
}
