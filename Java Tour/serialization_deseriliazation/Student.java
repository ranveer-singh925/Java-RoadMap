package serialization_deseriliazation;

import java.io.Serializable;


/* only those object is serializable whose implement Serializable interface (it only enable the serializibility of the class) */
public class Student implements Serializable {
    private String name;
    private String age;

    // if we use a transient keyword then gender property will not be the part of Serialize
    transient private String gender;


    public Student(String name, String age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    String dummyMethod() {
        return "Working in the progress!!";
    }
}
