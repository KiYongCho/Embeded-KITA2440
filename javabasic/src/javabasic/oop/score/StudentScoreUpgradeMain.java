package javabasic.oop.score;

public class StudentScoreUpgradeMain {

	public static void main(String[] args) {

		StudentScoreUpgrade[] ssArray = { 
				new StudentScoreUpgrade("홍길동", 100, 90, 80),
				new StudentScoreUpgrade("강감찬", 90, 80, 70), 
				new StudentScoreUpgrade("이순신", 80, 70, 60)
		};

		for (StudentScoreUpgrade ss : ssArray) {
			System.out.println(ss);
		}

		int[] subSumArray = sumOfSubject(ssArray);
		System.out.println("총점\t" + subSumArray[0] + "\t" + subSumArray[1] + "\t" + subSumArray[2]);
		System.out.println("평균\t" + subSumArray[0] / 3 + "\t" + subSumArray[1] / 3 + "\t" + subSumArray[2] / 3);

	} // main

	static int[] sumOfSubject(StudentScoreUpgrade[] ssArray) {
		int[] sumArray = new int[3];
		for (StudentScoreUpgrade ss : ssArray) {
			sumArray[0] += ss.kor;
			sumArray[1] += ss.eng;
			sumArray[2] += ss.math;
		}
		return sumArray;
	}

} // class
