package javabasic.oop;

public class CarMain {
	
	public static void main(String[] args) {
		
		Car car1 = new Car(); // Car타입의 객체 생성
		car1.mfName = "현대";
		car1.carName = "소나타";
		car1.color = "빨강";
		car1.tireCount = 4;
		
		car1.carCount = 1;
		
		System.out.println(car1.mfName+"에서 만든 "+car1.carName+"는 "
				+car1.color+"색이며 타이어수는 "+car1.tireCount);
		
		car1.startCar();
		car1.accelCar();
		car1.breakCar();
		car1.stopCar();
		
		car1.carName = "그랜져";
		
		car1.startCar();
		car1.accelCar();
		car1.breakCar();
		car1.stopCar();
		
		Car car2 = new Car();
		car2.mfName = "기아";
		car2.carName = "소렌토";
		car2.color = "백";
		car2.tireCount = 4;
		
		car2.carCount = 2;
		
		car2.startCar();
		car2.accelCar();
		car2.breakCar();
		car2.stopCar();		
		
		// 해쉬코드값(참조값)이 같다는 건 메모리에 같은 곳에 있다는 것이고
		// 메모리에 같은 곳에 있다는 건 같은 객체라는 뜻!!!
		System.out.println("car1에 저장된 참조값 : " + car1.hashCode());
		System.out.println("car2에 저장된 참조값 : " + car2.hashCode());
		
		Car car3 = new Car();
		System.out.println("car3에 저장된 참조값 : " + car3.hashCode());
		
		car3.carCount = 3;
		
		Car car4 = new Car();
		
		car4.carCount = 4;
		
		System.out.println(car3.equals(car4));
		
		System.out.println(Car.carCount);
		System.out.println(car1.carCount);
		System.out.println(car2.carCount);
		System.out.println(car3.carCount);
		System.out.println(car4.carCount);
		
		car4.carCount = 100;
		
		System.out.println(Car.carCount);
		System.out.println(car1.carCount);
		System.out.println(car2.carCount);
		System.out.println(car3.carCount);
		System.out.println(car4.carCount);
		
		System.out.println(Car.getCarCount());
		System.out.println(car1.getCarCount());
		System.out.println(car2.getCarCount());
		System.out.println(car3.getCarCount());
		System.out.println(car4.getCarCount());
		
	} // main

} // class























