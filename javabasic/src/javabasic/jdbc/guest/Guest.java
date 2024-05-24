package javabasic.jdbc.guest;

import java.sql.Date;

public class Guest {

	private int gno;
	private String gname;
	private int gage;
	private String ggender;
	private String gsid;
	private Date gconndt;

	public Guest() {
	}

	public Guest(int gno, String gname, int gage, String ggender, String gsid, Date gconndt) {
		super();
		this.gno = gno;
		this.gname = gname;
		this.gage = gage;
		this.ggender = ggender;
		this.gsid = gsid;
		this.gconndt = gconndt;
	}

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getGage() {
		return gage;
	}

	public void setGage(int gage) {
		this.gage = gage;
	}

	public String getGgender() {
		return ggender;
	}

	public void setGgender(String ggender) {
		this.ggender = ggender;
	}

	public String getGsid() {
		return gsid;
	}

	public void setGsid(String gsid) {
		this.gsid = gsid;
	}

	public Date getGconndt() {
		return gconndt;
	}

	public void setGconndt(Date gconndt) {
		this.gconndt = gconndt;
	}

	@Override
	public String toString() {
		return "Guest [gno=" + gno + ", gname=" + gname + ", gage=" + gage + ", ggender=" + ggender + ", gsid=" + gsid
				+ ", gconndt=" + gconndt + "]";
	}

}
