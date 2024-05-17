package javabasic.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class TransactionExer2 {
	
	static Connection conn = ConnectionUtil.getConnection();
	
	public static void main(String[] args) {
		
		BankAccount hong = new BankAccount(1, "홍길동", 1000);
		BankAccount kang = new BankAccount(2, "강감찬", 0);
		
		Savepoint beforeWithdraw = null;
		
		try {
			
			conn.setAutoCommit(false);
			
			beforeWithdraw =  conn.setSavepoint("beforeWithdraw"); 
			
			int wdResult = TransactionExer2.withdraw(hong, 500);
			if (wdResult > 0) {
				System.out.println(hong.getBaname() + " 계좌에서 500원 출금 완료!");
			}
			
			int result = 100 / 0;
			
			int dpResult = TransactionExer2.deposit(kang, 500);
			if (dpResult > 0) {
				System.out.println(kang.getBaname() + " 계좌에 500원 입금 완료!");
			}
			
			conn.commit();
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			try {
				conn.rollback(beforeWithdraw);
			} catch (SQLException sqle2) {
				sqle2.printStackTrace();
			}
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			try {
				conn.rollback(beforeWithdraw);
			} catch (SQLException sqle2) {
				sqle2.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		
	} // main
	
	// 출금 (계좌, 출금할 금액)
	private static int withdraw(BankAccount ba, int money) throws SQLException {
		// 계좌 잔액이 출금할 금액 이상인지 확인
		if (ba.getBamoney() >= money) {
			String sql = " update bankaccount set bamoney=? where baid=? ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ba.getBamoney() - money);
			ps.setInt(2, ba.getBaid());
			return ps.executeUpdate();
		} else {
			try {
				throw new BankException();
			} catch (BankException be) {
				System.out.println(be.getMessage());
			}
			return 0;
		}
	}
	
	// 입금 (계좌, 입금할 금액)
	private static int deposit(BankAccount ba, int money) throws SQLException {
		String sql = " update bankaccount set bamoney=? where baid=? ";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, ba.getBamoney() + money);
		ps.setInt(2, ba.getBaid());
		return ps.executeUpdate();	
	}

} // class













