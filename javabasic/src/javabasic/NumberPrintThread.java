package javabasic;

public class NumberPrintThread implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println((int)(Math.random()*10) + 1);
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
