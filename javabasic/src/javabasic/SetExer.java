package javabasic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExer {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		
		System.out.println(set.size());
		
		System.out.println(set.contains(300));
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		set.forEach(e -> System.out.println(e));
		
		set.add(100);
		set.add(100);
		
		set.forEach(e -> System.out.println(e));
		
		Object[] iArray = (Object[])(set.toArray());
		int iArrayLeng = iArray.length;
		for (int i=0; i<iArrayLeng; i++) {
			System.out.println(iArray[i]);
		}
		
	} // main
	
} // class









