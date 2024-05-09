package javabasic;

public class Person {

	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if (p.name.equals(this.name) 
				&& p.age == this.age) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return this.name + "님은 " + this.age + "살 입니다!";
	}

}








