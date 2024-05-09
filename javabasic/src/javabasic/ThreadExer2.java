package javabasic;

public class ThreadExer2 {
	
	public static void main(String[] args) {
		
		Thread ht = new HelloThread();
		Thread gt = new GoodbyeThread();
		
		ht.start();
		//ht.yield();
		//try {
		//	ht.join();
		//} catch (InterruptedException ie) {
		//	ie.printStackTrace();
		//}
		gt.start();
		
//		  - activeCount() : 실행중인 쓰레드의 수
//		  - currentThread() : 현재 실행중인 쓰레드
//		  - getId() : 쓰레드의 아이디
//		  - getName() : 쓰레드의 이름
//		  - getPriority() : 쓰레드 우선순위 (기본 5, 1~10)
//		  - getState() : 쓰레드의 상태
		
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread());
		System.out.println(ht.getId());
		ht.setName("Hello Thread");
		System.out.println(ht.getName());
		gt.setName("Goodbye Thread");
		System.out.println(gt.getName());
		ht.setPriority(10);
		gt.setPriority(1);
		System.out.println(ht.getPriority());
		System.out.println(ht.getState());
		
	}

}







