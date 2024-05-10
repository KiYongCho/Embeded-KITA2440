package javabasic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectExer {
	
	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 20, "123456-7890123");
		Person kang = new Person("강감찬", 30, "987654-1234567");
		
		File file = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			file = new File("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\object.dat");
	
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(hong);
			oos.writeObject(kang);
			
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			Object hongObj = ois.readObject();
			Object kangObj = ois.readObject();
			
			Person readHong = (Person)hongObj;
			Person readKang = (Person)kangObj;
			System.out.println(readHong);
			System.out.println(readKang);
			
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main

} // class











