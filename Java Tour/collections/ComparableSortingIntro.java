package collections;

import java.util.*;
class Student implements Comparable<Details>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Details details) {
        if(age== details.age){
            return 0;
        }else if(age> details.age){
            return 1;
        }else
        {
            return -1;
        }
    }
}
//Creating a test class to sort the elements
public class ComparableSortingIntro {
    public static void main(String args[]){
        ArrayList<Details> al=new ArrayList<Details>();
        al.add(new Details(101,"Vijay",23));
        al.add(new Details(106,"Ajay",27));
        al.add(new Details(105,"Jai",21));

        Collections.sort(al, new AgeComparator());
        for(Details st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
