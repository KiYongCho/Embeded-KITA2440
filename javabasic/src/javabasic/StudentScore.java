package javabasic;

public class StudentScore {

	private int cno; // 반 번호
	private int sno; // 학생 번호
	private String sname; // 학생명
	private int kor; // 국어점수
	private int eng; // 영어점수
	private int math; // 수학점수
	private int total; // 총점

	public StudentScore(int cno, int sno, String sname, int kor, int eng, int math, int total) {
		super();
		this.cno = cno;
		this.sno = sno;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return kor + eng + math;
	}

	@Override
	public String toString() {
		return "학생성적 [반번호=" + cno + ", 학생번호=" + sno + ", 학생명=" + sname 
				+ ", 국어=" + kor + ", 영어=" + eng
				+ ", 수학=" + math + ", total=" + getTotal() + "]";
	}

}
