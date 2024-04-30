package javabasic.oop.score;

public class StudentScore {

	String name; // 학생명
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수

	StudentScore() {
	}

	public StudentScore(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math;
	}

}
