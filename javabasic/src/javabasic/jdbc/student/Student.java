package javabasic.jdbc.student;

import java.util.List;

class Student {

	private int sno;
	private String sname;
	private int sage;
	private String sgender;
	private List<Subject> subjectList; 	// 학생의 과목 리스트

	public Student() {
	}

	public Student(int sno, String sname, int sage, String sgender, List<Subject> subjectList) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
		this.sgender = sgender;
		this.subjectList = subjectList;
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

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		// 1번 홍길동 : 20살, 남자, 국어/영어/수학
		String sgenderPrn = sgender.equals("M") ? "남자" : "여자";
		String subjectListPrn = "";
		for (Subject subject : subjectList) {
			subjectListPrn += subject.toString();
		}
		return sno + "번 " + sname + " : " + sage + "살, "
				+ sgenderPrn + ", " + subjectListPrn;
	}

}














