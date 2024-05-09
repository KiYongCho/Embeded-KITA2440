package javabasic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExer {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "오렌지");
		map.put(1, "오렌지");
		map.put(2, "사과");
		map.put(3, "딸기");
		map.put(4, "포도");
		map.put(5, "복숭아");
		
		System.out.println(map.size());
		
		System.out.println(map.get(4));
		
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet.size());
		
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		entrySet.forEach(entry -> System.out.println(entry));
		
		//Set<Integer> keySet = map.keySet();
		map.keySet().forEach(key -> System.out.println(key));
		
		//Collection<String> values = map.values();
		map.values().forEach(value -> System.out.println(value));
		
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("포도"));
		
		map.replace(3, "참외");
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		entry.forEach(en -> System.out.println(en));
		
	} // main

} // class














