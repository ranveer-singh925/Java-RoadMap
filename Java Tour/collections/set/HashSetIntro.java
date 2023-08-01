package collections.set;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashSetIntro {
    public static void main(String[] args){
        Set<Integer> set= new HashSet<>();
        set.add(133);
        set.add(3);
        set.add(233);
        set.add(42);
        set.add(3);
        set.add(344);

        System.out.println(set);

        //fetch max and min
        System.out.println(set.stream().min(Integer::compare));
        System.out.println(set.stream().max(Integer::compare));


        // frequency of each elements
        for (Integer s: set){
            System.out.println(s+": "+Collections.frequency(set,s));
        }
        set.stream().distinct().forEach(System.out::println); // to fetch the distinct elements
        set.stream().sorted().forEach(System.out::println);  // to sort the stream



        List<String> names	=	List.of("John","George","Joe","Sue","James");
        names.stream().filter(e->e.startsWith("J")).map(e->e.toUpperCase(Locale.ROOT)).forEach(System.out::println);


    }
}
