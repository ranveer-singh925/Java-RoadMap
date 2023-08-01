package java8_features.streamAPI;

import java.util.List;

public class streamMethods {
public static void main(String[] args){
    List<String> cities= List.of("gkp","delhi","pune");
    cities.stream().filter(e->e.startsWith("p")).forEach(System.out::println);


    List<String> ls= List.of("gkp","delhi","pune");

    ls.stream().map(e->{
        return e.equalsIgnoreCase("PUNE");
    }).forEach(System.out::println);
}

}
