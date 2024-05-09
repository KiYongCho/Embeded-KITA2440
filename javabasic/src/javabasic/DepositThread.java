package javabasic;

// 입금 쓰레드
public class DepositThread extends Thread {
	
	Account account;
	int amount; // 입금액
	
	DepositThread(Account account, int amount) {
		this.account = account;
		this.amount = amount;
	}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			this.account.deposite(this.amount);
			System.out.println(this.amount + "원 입금됨!");
			System.out.println(account);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

}
