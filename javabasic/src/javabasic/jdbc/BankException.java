package javabasic.jdbc;

public class BankException extends Exception {
	
	@Override
	public String getMessage() {
		return "잔액이 부족하여 출금 불가!";
	}

}
