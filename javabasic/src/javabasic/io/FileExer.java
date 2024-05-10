package javabasic.io;

import java.io.File;

public class FileExer {
	
	public static void main(String[] args) {
		
		File root = new File("D:\\");
		
		File[] subArr = root.listFiles();
		printList(subArr);
		
	} // main
	
	static void printList(File[] subArr) {
		for (File subFile : subArr) {
			if (subFile.isDirectory()) {
				System.out.print("[D]"+subFile.getName());
				printList(subFile.listFiles());
			}
			System.out.println(subFile.getName());
		}
	}

} // class
















