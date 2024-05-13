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

/*
 * 웹크롤링 실습)
 * 개요 : 쇼핑몰에서 쌀에 대한 상품명, 판매가, 적립포인트를 크롤링해서 assets/rice.txt에 저장
 * 경로 : https://okjmall.com/goods/goods_list.php?cateCd=015
*/

public class CrawlingExer {
	
	public static void main(String[] args) {
		
		// URI 객체 생성
		URI uri = null;
		URL url = null;
		URLConnection conn = null;
		InputStream is = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			uri = new URI("https://okjmall.com/goods/goods_list.php?cateCd=015");
			url = uri.toURL();
			conn = url.openConnection();
			is = conn.getInputStream();
			
			br = new BufferedReader(new InputStreamReader(is));
			
			File file = new File("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\rice.txt");
						
			String readedLine = null;
			bw = new BufferedWriter(new FileWriter(file));
			
			
			
			while ((readedLine=br.readLine()) != null) {
				System.out.println(readedLine.indexOf("<strong class=\"item_name\">"));
				//bw.write(readedLine+"\n");
			}
			
		} catch (URISyntaxException use) {
			use.printStackTrace();
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
		
	} // main

} // class


























