package javabasic;

public class ThreadExer1 {
	
	public static void main(String[] args) {
		
		Thread npt = new Thread(new NumberPrintThread());
		Thread cpt = new Thread(new CharPrintThread());
		
		npt.start();
		cpt.start();
		
	} // main

} // class
