package javabasic.oop;

public class Car {
	
	// 클래스의 데이터 = 객체들이 공유 = 정적 멤버 변수 (static member variable)
	static int carCount = 0;

	// 객체의 데이터 = 멤버 변수(non-static member variable)
	String mfName; // 제조사명
	String carName; // 이름
	String color;// 색상
	int tireCount; // 타이어 수
	
	// 클래스의 메소드 = 객체없이 호출해서 사용할 수 있는 메소드
	// 정적 멤버 메소드(static member method)
	static int getCarCount() {
		return carCount;
	}
	
	// 객체의 기능 = 멤버 메소드(non-static member method)
	// this : 메모리에서 참조되는 객체 자신을 가리키는 키워드
	void startCar() {
		System.out.println(this.carName + " 자동차 출발!");
	}
	void stopCar() {
		System.out.println(this.carName + " 자동차 정지!");
	}
	void accelCar() {
		System.out.println(this.carName + " 자동차 가속!");
	}
	void breakCar() {
		System.out.println(this.carName + " 자동차 감속!");
	}
	

}
