package javabasic;

import java.sql.Timestamp;

// 게시물
public class Article {

	private int bno; // 번호
	private String btitle; // 제목
	private String bcontent; // 내용
	private String bwriter; // 작성자
	private Timestamp bregdate; // 작성일시

	public Article(int bno, String btitle, String bcontent, String bwriter, Timestamp bregdate) {
		super();
		this.bno = bno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bregdate = bregdate;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
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

	public Timestamp getBregdate() {
		return bregdate;
	}

	public void setBregdate(Timestamp bregdate) {
		this.bregdate = bregdate;
	}

	@Override
	public String toString() {
		return "Article [bno=" + bno + ", btitle=" + btitle + ", bcontent=" + bcontent + ", bwriter=" + bwriter
				+ ", bregdate=" + bregdate + "]";
	}

}
