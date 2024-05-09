package javabasic;

public class HelloThread extends Thread {
	
	@Override
	public void run() {
		
		while (true) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}			
		}
		
	}

}
