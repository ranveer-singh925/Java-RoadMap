package java8_features.streamAPI.praticeQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamApiMethods
{
    public static void main(String[] args){

        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(10,23,43,1,3,55,74,32));


        // TODO: these are the intermediate operations ()

        // find the list of numbers which are greater than 20 and print it.
        list.stream().filter(e-> e>20).forEach(System.out::println);
        List<Integer> collect = list.stream().filter(e -> e > 20).collect(Collectors.toList());
        System.out.println(collect);

        //WAP to take out final list where we are adding 5 to each element.
        List<Integer> integerList = list.stream().map(e -> e + 5).collect(Collectors.toList());
        System.out.println(integerList);



        //TODO: These are the terminal operations ()

        Stream<Integer> stream = Stream.of(1,2,3,45,6,7,77,54);
        Object[] array = stream.toArray(); // this will return the object of array from list to perform operation on that object

        // how do we type case the above array object to specific dataType like interger or String ....
        // 1 way to do it
        ArrayList<Integer> integers= new ArrayList<>();
        for (Object o: array){
            integers.add((Integer) o);
        }
        System.out.println(integers);

        integers.toArray(new Integer[]{new Integer(array.length)});


        List<String> strings = List.of("one","two","three","four");
        System.out.println(strings.stream().collect(groupingBy(String::length, counting())));


    }
}


/**
 * Predicate -> are the boolean value functions
 *
 * map- > if we want to perform some operation on the element
 */