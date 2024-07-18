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
	
	public Board() {
	}

	public Board(int bid, String btitle, String bcontent, String bwriter, int bcount, Timestamp bregdate) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bcount = bcount;
		this.bregdate = bregdate;
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

	@Override
	public String toString() {
		return "Board [bid=" + bid + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriter=" + bwriter
				+ ", bcount=" + bcount + ", bregdate=" + bregdate + "]";
	}
	
}






