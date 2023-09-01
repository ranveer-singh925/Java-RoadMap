package serialization_deseriliazation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSeriliazedntro {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("sd.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student) ois.readObject();
            System.out.println("deserialization complete");
            System.out.println("Name of student - "+student.getName());
            System.out.println(student.getGender()); // it give null result because we use transient keyword at this property variable

            fis.close();
            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


