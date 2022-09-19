package app13.CollectionExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_eg {

	public static void main(String[] args) 
	{
		Properties p=new Properties();
		//methods
		try {
			FileInputStream fs=new FileInputStream("ps.txt");
			p.load(fs);
			System.out.println(p);
			System.out.println(p.getProperty("umesh"));
			p.setProperty("raj", "20000" );
			FileOutputStream fos=new FileOutputStream("ps.txt");
			p.store(fos, "updated");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
