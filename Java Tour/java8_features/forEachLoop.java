package java8_features;

import java.util.Arrays;
import java.util.List;

public class forEachLoop {
    public static void main(String[] args) {

        // simple for loop

        int arr[]= {1,2,3,4,5,6,7,8,9};
        // for(int j=0;j<arr.length;j++){
        //     System.out.println(arr[j]);
        // }
        
    // Inhence for loop

        // for(int i:arr) {
        //     System.out.println(i);
        // }


        //forEach loop
        Integer ar[]= {1,2,3,4,5,6,7};
        List<Integer> list= Arrays.asList(ar);
        list.forEach(i-> System.out.println(i));
        list.stream().filter(i->i<2).forEach(System.out::println);
    }
}
