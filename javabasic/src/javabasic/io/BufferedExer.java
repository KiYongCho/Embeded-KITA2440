package javabasic.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedExer {
	
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\note.txt");
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			String lineStr = null;
			while ((lineStr = br.readLine()) != null) {
				System.out.println(lineStr);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main

} // class










