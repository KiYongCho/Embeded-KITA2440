package javabasic.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ISRExer {
	
	public static void main(String[] args) {
		
		Reader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(reader.read());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
