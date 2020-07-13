/**
 * This case, assumes that already object is serialized 
 * using serialization process. Now, when reverse process happens 
 * i.e.; de-serializing binary file format from file storage into 
 * Java’s heap memory, then a new Object is created
 * */
package object.fourways.to.create.objects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UsingDeSerialization {
 
    public static void main(String[] args) {
 
        // creating input stream variables
        FileInputStream fis = null;
        ObjectInputStream ois = null;
 
        // to hold customer values after de-serialization 
        Customer customer = null;
        try {
            // reading binary data
            fis = new FileInputStream("Customer.ser");
 
            // converting binary-data to java-object
            ois = new ObjectInputStream(fis);
 
            // Way 3: creating Object after de-serialization
            customer = (Customer) ois.readObject();
        } 
        catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        }
        catch (IOException ioex) {
            ioex.printStackTrace();
        } 
        catch (ClassNotFoundException ccex) {
            ccex.printStackTrace();
        }
 
        System.out.println("Customer values : " + customer);
    }
}

/**
 * 
 * Explanation:
 * 
 * Assume that, already Customer object is serialized in the file named “Customer.ser”
 * Above program depicts the steps to de-serialize an Object (i.e.; de-serializing 
 * from file storage in binary format into Java’s heap memory)
 * Notice line no. 28, which read object’s state and re-creates a new object
 * In this way, a new Object can be created in Java using Object de-serialization process
*/
