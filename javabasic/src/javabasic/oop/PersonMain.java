package javabasic.oop;

public class PersonMain {
	
	public static void main(String[] args) {
		
		// Person타입객체 3개 생성
		Person person1 = new Person();
		Person.objCount++;
		Person person2 = new Person();
		Person.objCount++;
		Person person3 = new Person();
		Person.objCount++;
		
		// 객체 데이터 설정
		person1.name = "홍길동";
		person1.age = 20;
		person1.jobName = "산적";
		
		person2.name = "강감찬";
		person2.age = 30;
		person2.jobName = "장군";
		
		person3.name = "유관순";
		person3.age = 15;
		person3.jobName = "독립투사";		
		
		// 객체 데이터 출력
		System.out.println(person1.name+"님의 나이는 "+person1.age+"이고 "
				+"직업은 "+person1.jobName);
		System.out.println(person2.name+"님의 나이는 "+person2.age+"이고 "
				+"직업은 "+person2.jobName);
		System.out.println(person3.name+"님의 나이는 "+person3.age+"이고 "
				+"직업은 "+person3.jobName);
		
		// 객체 메소드 호출
		person1.say();
		person1.walk();
		person2.say();
		person2.walk();
		person3.say();
		person3.walk();
		
		// 생성된 객체 수
		System.out.println("총 "+Person.objCount+"개의 객체 생성됨!");
		System.out.println("총 "+Person.getObjCount()+"개의 객체 생성됨!");
		
	} // main

} // class











