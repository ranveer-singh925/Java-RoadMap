package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Details{
    int rollno;
    String name;
    int age;
    Details(int rollno, String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

//    @Override
//    public int compare(Details details, Details t1) {
//        if (details.age==t1.age){
//            return 0;
//        }else if(details.age>t1.age){
//            return 1;
//        }else {
//            return -1;
//        }
//    }
}

class AgeComparator implements Comparator<Details>{
    public int compare(Details s1,Details s2){
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
public class ComparatorSortingIntro {
    public static void main(String[] args){
        ArrayList<Details> al= new ArrayList<>();
        al.add(new Details(101,"Ranveer",23));
        al.add(new Details(101,"Ranveer",21));
        al.add(new Details(101,"Ranveer",22));

        Collections.sort(al,new AgeComparator());

    }

}
