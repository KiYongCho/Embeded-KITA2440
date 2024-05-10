package javabasic.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileExer {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\flower.jpg");
			fos = new FileOutputStream("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\flower_copy.jpg");
			
			byte[] readBytes = new byte[1024];
			while (true) {
				int readCount = fis.read(readBytes);
				fos.write(readBytes);
				int readBytesLeng = readBytes.length;
				if (readCount<readBytesLeng) {
					break;
				}
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
			
	} // main

} // class











