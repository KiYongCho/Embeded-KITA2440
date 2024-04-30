package javabasic.oop;

public class Board {

	private int articleNo;
	private String articleSubject;
	private String articleContent;
	private String articleWriter;

	public Board(int articleNo, String articleSubject, String articleContent, String articleWriter) {
		super();
		this.articleNo = articleNo;
		this.articleSubject = articleSubject;
		this.articleContent = articleContent;
		this.articleWriter = articleWriter;
	}

	public int getArticleNo() {
		return articleNo;
	}

	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}

	public String getArticleSubject() {
		return articleSubject;
	}

	public void setArticleSubject(String articleSubject) {
		this.articleSubject = articleSubject;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleWriter() {
		return articleWriter;
	}

	public void setArticleWriter(String articleWriter) {
		this.articleWriter = articleWriter;
	}

	@Override
	public String toString() {
		return "Board [articleNo=" + articleNo + ", articleSubject=" + articleSubject + ", articleContent="
				+ articleContent + ", articleWriter=" + articleWriter + "]";
	}
	
} // class




















