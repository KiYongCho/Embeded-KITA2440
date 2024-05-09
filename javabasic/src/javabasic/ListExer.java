package javabasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExer {
	
	public static void main(String[] args) {
		
		List<String> fruitList = new ArrayList<String>();
		
		fruitList.add("오렌지");
		fruitList.add("사과");
		fruitList.add("포도");
		fruitList.add("복숭아");
		fruitList.add("딸기");
		
		System.out.println(fruitList.size());
		
		fruitList.set(1, "바나나");
		
		fruitList.remove(4);
		fruitList.remove("복숭아");
		
		System.out.println(fruitList.size());
		
		System.out.println(fruitList.contains("포도"));
		
		System.out.println(fruitList.get(1));
		
		Iterator<String> iter = fruitList.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
		int listSize = fruitList.size();
		for (int i=0; i<listSize; i++) {
			System.out.println(fruitList.get(i));
		}
		
		fruitList.forEach(e -> System.out.println(e));
		
		fruitList.clear();
		
	} // main
	

} // class























