package javabasic.oop;

class HumanMain {

	public static void main(String[] args) {

		Human human1 = new Human("홍길동", 80);
		
		// System.out.println(human1.name); // private이므로 직접 접근이 불가능
		System.out.println(human1.getName()); // getter로 접근
		
		// human1.name = "강감찬"; // private이므로 직접 접근이 불가능
		human1.setName("강감찬"); // setter로 변경
		
		human1.setAge(50);
		System.out.println(human1.getAge());

	}

}
