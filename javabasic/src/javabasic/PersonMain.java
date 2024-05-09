package javabasic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonMain {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		if (p1.equals(p2)) {
			System.out.println("두 사람은 동일한 사람입니다!");
		} else {
			System.out.println("두 사람은 다른 사람입니다!");
		}
		
		Class cl = p1.getClass();
		System.out.println(cl.getName());
		
		Field[] fields = cl.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName());
		}
		
		Method[] methods = cl.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		System.out.println(p1);
		System.out.println(p2);
		
	} // main

} // class












