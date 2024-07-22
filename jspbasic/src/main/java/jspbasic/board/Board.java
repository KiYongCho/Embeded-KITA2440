package jspbasic.board;

import java.io.Serializable;
import java.sql.Timestamp;

public class Board implements Serializable {
	
	public static final long serialVersionUID = 2398478293479L;
	
	private int bid;
	private String btitle;
	private String bcontent;
	private String bwriter;
	private int bcount;
	private Timestamp bregdate;
	private String bsort;
	private String cfn;
	private String sfn;
		
	public Board() {
	}

	public Board(int bid, String btitle, String bcontent, String bwriter, int bcount, Timestamp bregdate, String bsort,
			String cfn, String sfn) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bcount = bcount;
		this.bregdate = bregdate;
		this.bsort = bsort;
		this.cfn = cfn;
		this.sfn = sfn;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public int getBcount() {
		return bcount;
	}

	public void setBcount(int bcount) {
		this.bcount = bcount;
	}

	public Timestamp getBregdate() {
		return bregdate;
	}

	public void setBregdate(Timestamp bregdate) {
		this.bregdate = bregdate;
	}

	public String getBsort() {
		return bsort;
	}

	public void setBsort(String bsort) {
		this.bsort = bsort;
	}

	public String getCfn() {
		return cfn;
	}

	public void setCfn(String cfn) {
		this.cfn = cfn;
	}

	public String getSfn() {
		return sfn;
	}

	public void setSfn(String sfn) {
		this.sfn = sfn;
	}
	
	@Override
	public String toString() {
		return "Board [bid=" + bid + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriter=" + bwriter
				+ ", bcount=" + bcount + ", bregdate=" + bregdate + ", bsort=" + bsort + ", cfn=" + cfn + ", sfn=" + sfn
				+ "]";
	}	
	
}






