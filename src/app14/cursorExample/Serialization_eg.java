package app14.cursorExample;

import java.io.*;

class student implements Serializable{
	int id =101;
	String name="Kavya";
}
public class Serialization_eg {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		student s=new student();
		// serialization process
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("stu.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		// De-serialization process
		FileInputStream fis=new FileInputStream("stu.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ois.readObject();
	}

}
