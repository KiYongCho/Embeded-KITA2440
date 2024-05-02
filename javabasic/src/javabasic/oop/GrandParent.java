package javabasic.oop;

public class GrandParent {
	
	String name;
	int age;
	String job;	
	
	GrandParent() {
	}
	
	GrandParent(String name, int age, String job) {
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	void say() {
		System.out.println("할아버님이 말씀하셨다!");
	}

} // class











