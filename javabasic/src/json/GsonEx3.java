package json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonEx3 {
	
	// 실습 : 네트워크상의 JSON데이터(문자열)를 받아서 List로 변환 후 출력해 보기
	// https://jsonplaceholder.typicode.com/posts
	
	public static void main(String[] args) throws Exception {
		
		String uriStr = "https://jsonplaceholder.typicode.com/posts";
		URL url = new URI(uriStr).toURL();
		URLConnection conn = url.openConnection();
		if (conn!=null) {
			System.out.println("연결됨!");
		}
		
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String jsonStr = "";
		String line = "";
		while ((line = br.readLine()) != null) {
			jsonStr += line;
		}
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		List<Post> postList = gson.fromJson(jsonStr, List.class);
		System.out.println(postList);
		
	} // main

} // class






















