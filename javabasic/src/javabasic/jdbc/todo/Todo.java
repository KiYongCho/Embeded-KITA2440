package javabasic.jdbc.todo;

import java.sql.Timestamp;

public class Todo {

	private int tdid;
	private String tdcontent;
	private String tdcomplete;
	private Timestamp tdregdate;

	public Todo() {
	}

	public Todo(int tdid, String tdcontent, String tdcomplete, Timestamp tdregdate) {
		super();
		this.tdid = tdid;
		this.tdcontent = tdcontent;
		this.tdcomplete = tdcomplete;
		this.tdregdate = tdregdate;
	}

	public int getTdid() {
		return tdid;
	}

	public void setTdid(int tdid) {
		this.tdid = tdid;
	}

	public String getTdcontent() {
		return tdcontent;
	}

	public void setTdcontent(String tdcontent) {
		this.tdcontent = tdcontent;
	}

	public String getTdcomplete() {
		return tdcomplete;
	}

	public void setTdcomplete(String tdcomplete) {
		this.tdcomplete = tdcomplete;
	}

	public Timestamp getTdregdate() {
		return tdregdate;
	}

	public void setTdregdate(Timestamp tdregdate) {
		this.tdregdate = tdregdate;
	}

	@Override
	public String toString() {
		return "Todo [tdid=" + tdid + ", tdcontent=" + tdcontent + ", tdcomplete=" + tdcomplete + ", tdregdate="
				+ tdregdate + "]";
	}

}
