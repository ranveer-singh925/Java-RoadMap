package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * If you want to store the element in the contiguous fashion mean in order
 */

public class ArrayListIntro {
    public static void main(String[] args){
        List<Integer> al= new ArrayList<>();

        // add elements in ArrayList
        al.add(1);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        al.add(179);
        al.add(198);
        al.add(165);

        // get elements from ArrayList

        System.out.println(al);
        System.out.println(al.get(1));

        System.out.println(al.set(0,119));
        System.out.println(al);

        al.remove(1);
        System.out.println(al);

        Iterator<Integer> it= al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (Integer i:al){
            System.out.println(i);
        }

        al.stream().forEach(i->System.out.println(i));
    }
}
