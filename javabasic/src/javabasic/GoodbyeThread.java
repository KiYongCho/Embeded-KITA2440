package javabasic;

public class GoodbyeThread extends Thread {
	
	@Override
	public void run() {
		while (true) {
			System.out.println("Good bye!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}			
		}
	}

}
