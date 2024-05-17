package javabasic.jdbc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
JDBC 개인 실습)

1. https://support.staffbase.com/hc/en-us/article_attachments
    /360009197031/username.csv 파일을 가져온다.
	Username	Identifier	  First name  	Last name
	booker12	9012	          Rachel	        Booker
	grey07	    2070	          Laura	        Grey
	johnson81	4081	          Craig	        Johnson
	jenkins46	9346	          Mary	        Jenkins
	smith79	    5079	          Jamie	        Smith
	
2. userinfo라는 테이블을 생성
create table userinfo (
	username varchar2(20),
	identifier   number primary key,
	firstname varchar2(20),
	lastname varchar2(20)
);

3. userinfo테이블에 csv 파일의 내용을 insert

4. userinfo테이블의 데이터를 출력

*/

public class JDBCExer {
	
	private Connection conn;
	
	JDBCExer() {
		conn = ConnectionUtil.getConnection();
	}
	
	public static void main(String[] args) {
		
		JDBCExer exer = new JDBCExer();
		
		try {
			
			// 1. 네트워크 데이터 가져오기
			String dataStr 
				= exer.getData("https://support.staffbase.com/hc/en-us/article_attachments/360009197031/username.csv");
			
			// 2. 테이블에 데이터 입력
			/*
			String[] dataArr = dataStr.split("\n");
			int dataArrLeng = dataArr.length;
			List<UserInfo> userInfoList = new ArrayList<UserInfo>();
			for (int i=1; i<dataArrLeng; i++) {
				String[] lineArr = dataArr[i].split(";");
				UserInfo userInfo 
					= new UserInfo(lineArr[0],Integer.parseInt(lineArr[1])
							,lineArr[2],lineArr[3]);
				userInfoList.add(userInfo);
			}
			int insertResult = exer.insertData(userInfoList);
			if (insertResult > 0) {
				System.out.println(insertResult + "개 행 입력 성공!");
			}
			*/
			
			// 3. 테이블 데이터 출력
			// exer.listData();
			
			// 4. 데이터를 파일에 저장 (assets/userinfo.txt)
			exer.saveAsFile(dataStr);			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	} // main
	
	// 데이터 가져오기
	private String getData(String uri) throws Exception {
		URLConnection urlc = new URI(uri).toURL().openConnection();
		BufferedReader br 
			= new BufferedReader(new InputStreamReader(urlc.getInputStream()));
		String result = "";
		String readLine = "";
		while ((readLine=br.readLine()) != null) {
			result += readLine + "\n";
		}
		return result;
	}
	
	// 데이터 입력
	private int insertData(List<UserInfo> uiList) throws Exception {
		
		String sql = " insert into userinfo(username, identifier, firstname, lastname) ";
		sql += " values(?, ?, ?, ?) ";
		PreparedStatement pstmt = this.conn.prepareStatement(sql);
		int returnValue = 0; 
		
		for (UserInfo userInfo : uiList) {
			pstmt.setString(1, userInfo.getUserName());
			pstmt.setInt(2, userInfo.getIdentifier());
			pstmt.setString(3, userInfo.getFirstName());
			pstmt.setString(4, userInfo.getLastName());
			returnValue += pstmt.executeUpdate();
		}
		return returnValue;
	}
	
	// 데이터 출력
	private void listData() throws Exception {
		String sql = " select username, identifier, firstname, lastname from userinfo ";
		Statement stmt = this.conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString(1)+":"+rs.getInt(2)
					+":"+rs.getString(3)+":"+rs.getString(4));
		}
	}
	
	// 파일에 저장
	private void saveAsFile(String dataStr) throws Exception {
		File file = new File("C:\\Users\\Administrator\\git\\Embeded-KITA2440\\javabasic\\src\\assets\\userinfo.txt");
		FileWriter fw = new FileWriter(file);
		fw.write(dataStr);
		fw.flush();
		fw.close();
	}

} // class




































