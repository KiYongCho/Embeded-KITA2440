package jspbasic.product;

import java.sql.Date;

public class Product {
	
	private String pno;
	private String pcomp;
	private String pname;
	private String pcolor;
	private String pamt;
	private String pprice;
	private String pmdate;
	
	public Product() {
	}

	public Product(String pno, String pcomp, String pname, String pcolor, String pamt, String pprice, String pmdate) {
		super();
		this.pno = pno;
		this.pcomp = pcomp;
		this.pname = pname;
		this.pcolor = pcolor;
		this.pamt = pamt;
		this.pprice = pprice;
		this.pmdate = pmdate;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
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

	public String getPamt() {
		return pamt;
	}

	public void setPamt(String pamt) {
		this.pamt = pamt;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public String getPmdate() {
		return pmdate;
	}

	public void setPmdate(String pmdate) {
		this.pmdate = pmdate;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pcomp=" + pcomp + ", pname=" + pname + ", pcolor=" + pcolor + ", pamt=" + pamt
				+ ", pprice=" + pprice + ", pmdate=" + pmdate + "]";
	}
	
}
