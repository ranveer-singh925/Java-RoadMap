package generics;

import java.util.ArrayList;
import java.util.List;

/*
 * The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. It makes the code stable by detecting the bugs at compile time.
 * Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the java programmer to store a specific type of objects.
 *
 * Advantages---
 *
 * We can hold only a single type of objects in generics. It doesn't allow to store other objects, Without Generics, we can store any type of objects.
 * Type casting is not required: There is no need to typecast the object. Before Generics, we need to type cast. like (String) map.get(0)
 * Compile time checking is far better to handle the problem at compile time than runtime.
 */
public class GenericIntro {
    public static void main(String[] args) {
        List<String> genericList = new ArrayList<>();
        genericList.add("ss");

        List nonGenericList = new ArrayList();
        nonGenericList.add(22);
        nonGenericList.add("Ranveer");
        nonGenericList.add(22.33);
        nonGenericList.add(true);


        System.out.println(genericList);
        String name = (String) nonGenericList.get(1);
        System.out.println(name);

    }
}
