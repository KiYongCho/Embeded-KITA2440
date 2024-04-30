package javabasic.oop.score;

import java.util.ArrayList;
import java.util.List;

public class StudentScoreUpgradeMain2 {

	public static void main(String[] args) {

//		StudentScoreUpgrade[] ssArray = { 
//				new StudentScoreUpgrade("홍길동", 100, 90, 80),
//				new StudentScoreUpgrade("강감찬", 90, 80, 70), 
//				new StudentScoreUpgrade("이순신", 80, 70, 60)
//		};
		
		List<StudentScoreUpgrade> ssList = new ArrayList<StudentScoreUpgrade>();
		ssList.add(new StudentScoreUpgrade("홍길동", 100, 90, 80));
		ssList.add(new StudentScoreUpgrade("강감찬", 90, 80, 70));
		ssList.add(new StudentScoreUpgrade("이순신", 80, 70, 60));

		for (StudentScoreUpgrade ss : ssList) {
			System.out.println(ss);
		}

		List<Integer> subSumList = sumOfSubject(ssList);
		System.out.println("총점\t" + subSumList.get(0) + "\t" + subSumList.get(1) + "\t" + subSumList.get(2));
		System.out.println("평균\t" + subSumList.get(0) / 3 + "\t" + subSumList.get(1) / 3 + "\t" + subSumList.get(2) / 3);

	} // main

//	static int[] sumOfSubject(StudentScoreUpgrade[] ssArray) {
//		int[] sumArray = new int[3];
//		for (StudentScoreUpgrade ss : ssArray) {
//			sumArray[0] += ss.kor;
//			sumArray[1] += ss.eng;
//			sumArray[2] += ss.math;
//		}
//		return sumArray;
//	}
	
	static List<Integer> sumOfSubject(List<StudentScoreUpgrade> ssList) {
		List<Integer> sumList = new ArrayList<Integer>();
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		for (StudentScoreUpgrade ss : ssList) {
			korSum += ss.kor;
			engSum += ss.eng;
			mathSum += ss.math;
		}
		sumList.add(0, korSum);
		sumList.add(1, engSum);
		sumList.add(2, mathSum);
		return sumList;
	}

} // class










