package java8_features.streamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class streamGroupingByIntro {
    public static void main(String[] args){
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Dipak", "Delhi", 21));
        emp.add(new Employee("Sumit", "Delhi", 21));
        emp.add(new Employee("Karan", "Delhi", 23));
        emp.add(new Employee("Mona", "Udaipur", 23));
        emp.add(new Employee("Rajesh", "Banglore", 23));
        emp.add(new Employee("Niraj", "Banglore", 31));

        Map<String, List<Employee>> collect = emp.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(collect);

//        Map<String,String> map= new HashMap<>();
//        map.put("ranveer","delhi");
//        map.put("v","delhi");
//        map.put("veer","pune");
//        map.put("d","delhi");
//        map.put("e","pune");
//
//        Map<Map.Entry<String, String>, Long> collect1 = map.entrySet().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect1);

        List<String> items =
                Arrays.asList("aa", "aa", "bb",
                        "bd", "cc", "d", "ee");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                                             )
                                      );

        System.out.println(result);
    }
}

class Employee
{
    private String name;
    private String city;
    private int age;
    public Employee(String name, String city, int age)
    {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return String.format("%s(%s,%d)", name, city, age);
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.city);
        hash = 79 * hash + this.age;
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        return true;
    }
}
