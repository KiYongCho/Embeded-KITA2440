package javabasic.jdbc.guest;

public class GuestMain {
	
	public static void main(String[] args) throws Exception {
		
		GuestDao guestDao = new GuestDao();
		
		// 등록
		Guest guest =new Guest(0, "장보고", 30, "M", "999999-9999999", null);
		int result = guestDao.insertGuest(guest);
		if (result>0) {
			System.out.println("등록 완료!");
		}
		
		// 수정
		
		// 삭제
		
		// 목록
		
		// 한행 조회
		
	} // main

} // class
















