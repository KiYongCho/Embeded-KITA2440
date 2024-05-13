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
import java.util.ArrayList;
import java.util.List;

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
			
			List<ProductInfo> piList = new ArrayList<ProductInfo>();
			
			while ((readedLine=br.readLine()) != null) {
				
				// 상품명 추출
				// <strong class="item_name">흑화고 1호 선물세트 450g(중) 장흥표고버섯</strong>
				String prodStartStr = "<strong class=\"item_name\">";
				int prodStartIndex = readedLine.indexOf(prodStartStr) + prodStartStr.length();
				int prodEndIndex = readedLine.indexOf("</strong>", prodStartIndex);
				String prodName = null;
				if (prodStartIndex>-1 && prodEndIndex>-1) {
					prodName = readedLine.substring(prodStartIndex, prodEndIndex);
				}
				
				// 가격 추출
				// <span  style="">9,800원 </span>
				String priceStartStr = "<span  style=\"\">";
				int priceStartIndex = readedLine.indexOf(priceStartStr) + priceStartStr.length();
				int priceEndIndex = readedLine.indexOf("원", priceStartIndex);
				String prodPrice = null;
				if (priceStartIndex>-1 && priceEndIndex>-1) {
					prodPrice = readedLine.substring(priceStartIndex, priceEndIndex);
				}
				
				// 포인트 추출
				String pointStartStr = "<img src=\"https://cdn-pro-web-241-113.cdn-nhncommerce.com/namdo0743_godomall_com/data/skin/front/mplshop_/img/icon/goods_icon/icon_mileage.png\" alt=\"마일리지\" title=\"마일리지\" /> ";
				int pointStartIndex = readedLine.indexOf(pointStartStr) + pointStartStr.length();
				int pointEndIndex = readedLine.indexOf("원", pointStartIndex);
				String prodPoint = null;
				if (pointStartIndex>-1 && pointEndIndex>-1) {
					prodPoint = readedLine.substring(pointStartIndex, pointEndIndex);
				}
				
				piList.add(new ProductInfo(
												prodName,
												Integer.parseInt(prodPrice),
												Integer.parseInt(prodPoint)
				));
				
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


























