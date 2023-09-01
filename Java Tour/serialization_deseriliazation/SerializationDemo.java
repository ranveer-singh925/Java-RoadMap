package serialization_deseriliazation;



/*
 * serialization is a mechanism of converting the state of object into the byte stream.
 * we can not directly save the object of above class to network, file or db
 * first we have to convert the object in the sequence of byte stream.
 * and then we transfer to the network or file or save into db.(after conversion*)
 *
 * real world example - while we are player the game (BGMI)-> when a player-A move there hand then the hand is property and the movement is behavior and the state is changed
 * it means the object is transfer thought the network and read the byte and show the changes to your display that the player-A movement.
 *
 */

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) throws IOException {
        Student student = new Student("Ranveer Singh","23","M");

        // in order to write the data to file
        FileOutputStream fos = new FileOutputStream("sd.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // how to perform serialization
        oos.writeObject(student);

        fos.close();
        oos.close();

        System.out.println("object state is transferred to sd.txt file");
    }


}


/* only those object is serializable whose implement Serializable interface (it only enable the serializibility of the class) */
