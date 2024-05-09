// Collection 실습
// 3개의 반에 각각 3명의 국어,영어,수학 점수가 있다
// 반별 각 학생의 국영수 총점을 산출해 반,이름,총점을 출력하는 프로그램을 만들어 보자~

package javabasic;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionExer {
	
	public static void main(String[] args) {
		
		StudentScore s11 
			= new StudentScore(1, 1, "홍길동", 100, 100, 100, 0);
		StudentScore s12 
		= new StudentScore(1, 2, "김길동", 90, 90, 90, 0);
		StudentScore s13 
		= new StudentScore(1, 3, "이길동", 80, 80, 80, 0);
		StudentScore s21 
		= new StudentScore(2, 1, "최길동", 70, 70, 70, 0);
		StudentScore s22 
		= new StudentScore(2, 2, "박길동", 60, 60, 60, 0);
		StudentScore s23 
		= new StudentScore(2, 3, "조길동", 50, 50, 50, 0);
		StudentScore s31 
		= new StudentScore(3, 1, "장길동", 40, 40, 40, 0);
		StudentScore s32 
		= new StudentScore(3, 2, "주길동", 30, 30, 30, 0);
		StudentScore s33 
		= new StudentScore(3, 3, "성길동", 20, 20, 20, 0);
		
		//Map<String, StudentScore> map = new LinkedHashMap<String, StudentScore>();
		Map<String, StudentScore> map = new HashMap<String, StudentScore>();
		map.put("s11", s11);		map.put("s12", s12);		map.put("s13", s13);
		map.put("s21", s21);		map.put("s22", s22);		map.put("s23", s23);
		map.put("s31", s31);		map.put("s32", s32);		map.put("s33", s33);
		
		map.values().forEach(studentScore -> System.out.println(studentScore));
		
	} // main

} // class

















