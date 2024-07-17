package jspbasic.product;

import java.sql.Date;

public class Product {
	
	private int pno;
	private String pcomp;
	private String pname;
	private String pcolor;
	private int pamt;
	private int pprice;
	private Date pmdate;
	
	public Product() {
	}
	
	public Product(int pno, String pcomp, String pname, String pcolor, int pamt, int pprice, Date pmdate) {
		super();
		this.pno = pno;
		this.pcomp = pcomp;
		this.pname = pname;
		this.pcolor = pcolor;
		this.pamt = pamt;
		this.pprice = pprice;
		this.pmdate = pmdate;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPcomp() {
		return pcomp;
	}

	public void setPcomp(String pcomp) {
		this.pcomp = pcomp;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcolor() {
		return pcolor;
	}

	public void setPcolor(String pcolor) {
		this.pcolor = pcolor;
	}

	public int getPamt() {
		return pamt;
	}

	public void setPamt(int pamt) {
		this.pamt = pamt;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public Date getPmdate() {
		return pmdate;
	}

	public void setPmdate(Date pmdate) {
		this.pmdate = pmdate;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pcomp=" + pcomp + ", pname=" + pname + ", pcolor=" + pcolor + ", pamt=" + pamt
				+ ", pprice=" + pprice + ", pmdate=" + pmdate + "]";
	}
	
}
