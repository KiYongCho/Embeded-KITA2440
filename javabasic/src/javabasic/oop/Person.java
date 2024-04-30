package javabasic.oop;

public class Person {
	
	static int objCount = 0; // static은 초기화 해주는 것이 좋다.
	
	String name; // ""로 자동 초기화
	int age;        // 0으로 자동 초기화
	String jobName; // ""로 자동 초기화
	
	static int getObjCount() {
		return objCount;
	}
	
	void say() {
		System.out.println(this.name+"님이 말한다.");
	}
	
	void walk() {
		System.out.println(this.name+"님이 걷는다.");
	}

}
