package javabasic.jdbc.board;

import java.sql.Timestamp;

public class Board {

	private int bid;
	private String btitle;
	private String bcontent;
	private Timestamp bregdate;

	public Board() {
	}

	public Board(int bid, String btitle, String bcontent, Timestamp bregdate) {
		super();
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
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

	public Timestamp getBregdate() {
		return bregdate;
	}

	public void setBregdate(Timestamp bregdate) {
		this.bregdate = bregdate;
	}

	@Override
	public String toString() {
		return "Board [bid=" + bid + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bregdate=" + bregdate + "]";
	}

} // class
