package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonEx2 {
	
	public static void main(String[] args) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		// 실습1 : Person객체를 Json문자열로 변환 후 출력
		Person person1 = new Person("손흥민", 30);
		String person1Str = gson.toJson(person1);
		System.out.println(person1Str);
		
		// 실습2 : 실습1의 Json문자열을 Person객체로 변환 후 출력
		Person person2 = gson.fromJson(person1Str, Person.class);
		System.out.println(person2);
		
		// 실습3 : Map객체를 Json문자열로 변환 후 출력
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("국어", 100);
		map.put("수학", 90);
		map.put("영어", 80);
		String mapStr = gson.toJson(map);
		System.out.println(mapStr);
		
		// 실습4: 실습3의 Json문자열을 Map객체로 변환 후 출력
		Map<String, Integer> map2 = gson.fromJson(mapStr, Map.class);
		System.out.println(map2);
		
		// 실습5 : List객체를 Json문자열로 변환 후 출력
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("이대호", 30));
		personList.add(new Person("이승엽", 40));
		personList.add(new Person("선동열", 50));
		String listStr = gson.toJson(personList);
		System.out.println(listStr);
		
		// 실습6 : 실습5의 Json문장열을 List객체로 변환 후 출력
		List<Person> personList2 = gson.fromJson(listStr, List.class);
		System.out.println(personList2);
		
	} // main

} // class












