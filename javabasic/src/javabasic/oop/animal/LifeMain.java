package javabasic.oop.animal;

public class LifeMain {

	public static void main(String[] args) {
		
		ILife dog = new Dog("말티즈");
		ILife cat = new Cat("러시안고양이");
		
		ILife rose = new Rose("백장미");
		ILife lily = new Lily("홍백합");
		
		// 개를 숨쉬도록 해보자.
		dog.breath();
		
		// 장미를 광합성하게 해보자.
		// 방법 1 (형변환 이용)
		// ((IPlant)rose).light();
		// 방법 2 (인터페이스 분리 이용)
		rose.light(); // 백장미 광합성 한다!
		
		cat.breath();
		
		lily.light();

	} // main

} // class










