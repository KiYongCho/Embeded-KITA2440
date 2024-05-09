package javabasic;

public class AccountMain {
	
	public static void main(String[] args) {
		
		// 계좌 생성
		Account account = new Account("홍길동", 10000);
		
		// 입금쓰레드 생성
		DepositThread dt1 = new DepositThread(account, 2000);
		DepositThread dt2 = new DepositThread(account, 1000);
		DepositThread dt3 = new DepositThread(account, 500);
		
		// 출금쓰레드 생성
		WithdrawThread wt1 = new WithdrawThread(account, 1500);
		WithdrawThread wt2 = new WithdrawThread(account, 1000);
		WithdrawThread wt3 = new WithdrawThread(account, 500);
		
		dt1.start();
		dt2.start();
		dt3.start();
		wt1.start();
		wt2.start();
		wt3.start();
		
	} // main

} // class








