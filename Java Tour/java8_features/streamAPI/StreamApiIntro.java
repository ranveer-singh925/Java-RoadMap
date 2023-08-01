package java8_features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiIntro {
public static void main(String[] args){
    List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9);
    List<Integer> collect = ls.stream()
            .filter(i -> i % 2 == 0)
            .filter(i->i<5)
            .collect(Collectors.toList());
    System.out.println(collect);


}

}
