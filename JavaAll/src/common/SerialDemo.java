package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Save implements Serializable {
	int value;
}

public class SerialDemo {

	public static void main(String[] args) throws Exception {
		Save obj = new Save();
		obj.value = 4;
		System.out.println(obj.value);
		
		File f = new File("Obj.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj2 = (Save) ois.readObject();
		System.out.println("Value of obj2 "+obj2.value);
	}

}
