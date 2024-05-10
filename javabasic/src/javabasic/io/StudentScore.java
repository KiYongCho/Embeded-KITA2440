package javabasic.io;

import java.io.Serializable;

public class StudentScore implements Serializable {

	public static final long serialVersionUID = 2398478923749327947L;

	private int sno;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;

	public StudentScore() {
	}

	public StudentScore(int sno, String name, int kor, int eng, int math, int total) {
		super();
		this.sno = sno;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return total;
	}

	public void setTotal(int total) {
		this.total = kor + eng + math;
	}

	@Override
	public String toString() {
		return "StudentScore [sno=" + sno + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + total + "]";
	}

}
