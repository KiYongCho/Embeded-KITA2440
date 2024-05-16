package javabasic.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonMain {
	
	public static void main(String[] args) {
		
		// 커넥션 생성
		Connection conn = ConnectionUtil.getConnection();
		
		/* 데이터 입력 */
		/*
		// 입력데이터 객체 생성
		Person person = new Person("홍길동", 20);
		// 데이터베이스에 보낼 문장
		Statement stmt = null;
		// SQL : Structured Query Language (데이터베이스에 보내는 문장)
		String sql = " insert into person(pname, page) values('"
				+ person.getPname() + "', " + person.getPage() + ") ";
		try {
			// 커넥션 통해서 Statement 생성
			stmt = conn.createStatement();
			// 쿼리 실행하고 결과를 불리언으로 반환
			stmt.execute(sql);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				stmt.close();
				ConnectionUtil.closeConnection(conn);
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		*/
		
		/* 데이터 조회 */
		/*
		String selectSql = " select pname, page from person ";
		Statement stmt = null;
		// 결과행집합의 각 행을 가리키는 커서(Cursor)
		ResultSet rs = null;
		try {
			conn = ConnectionUtil.getConnection();
			stmt = conn.createStatement();
			// select 구문 수행하고 결과를 커서로 반환
			rs = stmt.executeQuery(selectSql);
			// 행이 있는동안 반복해서 컬럼의 값들을 타입에 맞춰서 출력
			while (rs.next()) {
				System.out.println(rs.getString(1) + ", " + rs.getInt(2));
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				ConnectionUtil.closeConnection(conn);
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		*/
		
		/* 데이터 수정 */
		/*
		// 수정데이터 객체 생성
		Person person = new Person("강감찬", 30);
		// 데이터베이스에 보낼 문장
		Statement stmt = null;
		// SQL : Structured Query Language (데이터베이스에 보내는 문장)
		String sql = " update person set pname='"
				+person.getPname()+"', page="+person.getPage()+" ";
		try {
			// 커넥션 통해서 Statement 생성
			stmt = conn.createStatement();
			// 쿼리 실행하고 결과를 불리언으로 반환
			stmt.execute(sql);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				stmt.close();
				ConnectionUtil.closeConnection(conn);
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
		*/
		
		/* 데이터 삭제 */
		// 데이터베이스에 보낼 문장
		Statement stmt = null;
		// SQL : Structured Query Language (데이터베이스에 보내는 문장)
		String sql = " delete person ";
		try {
			// 커넥션 통해서 Statement 생성
			stmt = conn.createStatement();
			// 쿼리 실행하고 결과를 불리언으로 반환
			stmt.execute(sql);
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				stmt.close();
				ConnectionUtil.closeConnection(conn);
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}		
		
	} // main

} // class































