package javabasic.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataExer {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\data.dat");
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			dos.writeChar(65);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.flush();
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
						
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				dis.close();
				dos.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	} // main

} // class



















