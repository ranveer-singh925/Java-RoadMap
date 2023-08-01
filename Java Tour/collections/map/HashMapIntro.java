package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

public static void main(String[] args){
    Map<String,String> obj= new HashMap<>();
    obj.put("India","India");
    obj.put("china","India");
    obj.put("france","India");

    for (Map.Entry<String,String> e:obj.entrySet()){
        System.out.println(e.getKey()+" -"+e.getValue());
    }

}
}
