package javabasic.oop.score;

public class StudentScoreUpgrade {

	String name; // 학생명
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	int sum; // 개인점수합계
	int avg; // 개인점수평균

	public StudentScoreUpgrade() {
	}

	public StudentScoreUpgrade(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = kor + eng + math;
		this.avg = sum/3;
	}

	@Override
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg;
	}

}
