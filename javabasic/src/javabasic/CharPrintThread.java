package javabasic;

public class CharPrintThread implements Runnable {

	@Override
	public void run() {
		
		while (true) {
			
			// 대문자 A ~ Z 중 임의의 영문자를 출력
			int ranNum = (int)(Math.random()*26) + 65;
			System.out.println((char)ranNum);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

	}

}
