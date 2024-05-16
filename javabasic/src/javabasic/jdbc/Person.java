package javabasic.jdbc;

public class Person {

	private String pname;
	private int page;

	public Person() {
	}

	public Person(String pname, int page) {
		super();
		this.pname = pname;
		this.page = page;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Person [pname=" + pname + ", page=" + page + "]";
	}

}
