package json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class GsonEx1 {
	
	public static void main(String[] args) {
		
		// Gson 객체 생성 1
		Gson gson1 = new Gson();
		
		// Gson 객체 생성 2
		Gson gson2 = new GsonBuilder().create();
		
		// Gson 객체 생성 3
		Gson gson3 = new GsonBuilder().setPrettyPrinting().create();
		
		// Json 객체 생성
		JsonObject jsonObject = new JsonObject();
		
		// Json 객체에 key/value 추가
		jsonObject.addProperty("name", "홍길동");
		jsonObject.addProperty("age", 30);
		
		// Json 객체를 Json 문자열로 변환
		String JsonStr = gson3.toJson(jsonObject);
		System.out.println(JsonStr);
		
		// Java 객체를 Json 문자열로 변환
		Person person = new Person("홍길동", 30);
		String personJsonStr = gson3.toJson(person);
		System.out.println(personJsonStr);
		
		// Json 문자열을 Java 객체로 변환
		String jsonStr = "{\"name\": \"강감찬\", \"age\": 50}"; // {"name":"강감찬", "age":50}
		Person person2 = gson3.fromJson(jsonStr, Person.class);
		System.out.println(person2);
		
		// Map 객체를 Json 문자열로
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "유관순");
		map.put("age", "20");
		map.put("gender", "femail");
		String mapStr = gson3.toJson(map);
		System.out.println(mapStr);
		
		// Json 문자열을 Map 객체로
		String jsonStr2 = "{\"name\":\"홍길동\", \"age\":\"30\"}";
		Map<String, String> map2 = gson3.fromJson(jsonStr2, Map.class);
		for (Map.Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		// List 객체를 Json 문자열로
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("홍길동", 30));
		personList.add(new Person("강감찬", 40));
		personList.add(new Person("이순신", 50));
		String jsonStr3 = gson3.toJson(personList);
		System.out.println(jsonStr3);
		
		// Json 문자열을 List 객체로
		List<Person> personList2 = gson3.fromJson(jsonStr3, List.class);
		System.out.println(personList2);
		
		
	} // main

} // class













