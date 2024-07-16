package json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;

public class GsonEx5 {
	
	public static void main(String[] args) throws Exception {
		
		String uriStr = "http://localhost:8888/Jsonserver/json.jsp";
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
		List<LinkedTreeMap> humanList = gson.fromJson(jsonStr, List.class);
		System.out.println(humanList);
		
		for (int i=0; i<humanList.size(); i++ ) {
			LinkedTreeMap<String, Object> human1 = humanList.get(i);
			for (Map.Entry<String, Object> entry : human1.entrySet()) {
				String key = entry.getKey();
				Object value = entry.getValue();
				System.out.println(key);
				System.out.println(value);
			}
		}
		
	} // main

} // class
















