package javabasic.jdbc.student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javabasic.jdbc.ConnectionUtil;

public class StudentMain {
	
	Connection conn;
	
	public StudentMain() {
		conn = ConnectionUtil.getConnection();
	}
	
	public static void main(String[] args) {
		
		// 객체 생성
		StudentMain sm = new StudentMain();
		
		try {
			
			// 조인 수행 결과 행들의 커서(ResultSet)
			ResultSet rs = sm.getJoinedResultSet();
			
			// 학생리스트
			List<Student> studentList = new InsertData().getStudentList();
			
			// 학생 수만큼 반복
			for (int i=0; i<studentList.size(); i++) {
				// 과목리스트 생성
				List<Subject> subList = new ArrayList<Subject>();
				// 학생별 과목의 수
				int subjectListSize = studentList.get(i).getSubjectList().size();
				
				// 과목의 수만큼 반복 (1번학생은 3바퀴, 2번학생은 2바퀴 ...)
				for (int j=0; j<subjectListSize; j++) {
					// 결과행 한 행 추출 (커서를 이동시킴)
					rs.next();
					// 과목리스트에 과목을 추가
					subList.add(new Subject(rs.getInt("SUBNO"), rs.getString("SUBNAME"))); 
				}
				
				// Student객체 생성
				Student student 
				= new Student(
						rs.getInt("SNO"),
						rs.getString("SNAME"),
						rs.getInt("SAGE"),
						rs.getString("SGENDER"),
						subList
					);
				System.out.println(student); // => student.toString()
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main
	
	// 조인 쿼리 결과를 ResultSet으로 반환
	ResultSet getJoinedResultSet() throws SQLException {
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT S.SNO SNO, S.SNAME SNAME, S.SAGE SAGE, S.SGENDER SGENDER ");
		sb.append("      , SUB.SUBNO, SUB.SUBNAME ");
		sb.append(" FROM STUDENT S, SUBJECT SUB ");
		sb.append(" WHERE S.SUBNO = SUB.SUBNO ");
		String joinSql = sb.toString();			
		
		Statement stmt = this.conn.createStatement();
		return stmt.executeQuery(joinSql);		
	}

} // class





















