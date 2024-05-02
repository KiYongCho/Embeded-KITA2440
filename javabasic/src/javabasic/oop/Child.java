package javabasic.oop;

public class Child extends Parent {

	String name;
	int age;
	String job;
	
	Child(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	@Override
	void say() {
		System.out.println("자식이 말했다!");
	}
	
}
