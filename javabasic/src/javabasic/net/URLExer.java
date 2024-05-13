package javabasic.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class URLExer {
	
	public static void main(String[] args) {
		
		// URI 객체 생성
		URI uri = null;
		try {
			uri = new URI("https://g-sa.koreaisacademy.com");
		} catch (URISyntaxException use) {
			use.printStackTrace();
		}
		
		// URL로 변경
		URL url = null;
		try {
			url = uri.toURL();
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		}
		
		// 커넥션 생성
		URLConnection conn = null;
		try {
			conn = url.openConnection();
			if (conn!=null) {
				System.out.println("연결되었습니다!");
				System.out.println(conn);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		// InputStream 생성
		InputStream is = null;
		try {
			is = conn.getInputStream();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		// InputStream을 Reader로 변환해서 버퍼링
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(is));
		
		// 실습) assets/google0513.txt 파일로 저장해 보자!
		File file = new File("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\google0513.txt");
		BufferedWriter bw
			= null;
		
		String readedLine = null;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			while ((readedLine=br.readLine()) != null) {
				bw.write(readedLine+"\n");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main

} // class













