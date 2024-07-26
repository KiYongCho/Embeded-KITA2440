package blog;

public class Comment {
	
	private int commId;
	private String commTitle;
	private String commContent;
	private int blogId;
	
	public Comment() {
	}

	public Comment(int commId, String commTitle, String commContent, int blogId) {
		super();
		this.commId = commId;
		this.commTitle = commTitle;
		this.commContent = commContent;
		this.blogId = blogId;
	}

	public int getCommId() {
		return commId;
	}

	public void setCommId(int commId) {
		this.commId = commId;
	}

	public String getCommTitle() {
		return commTitle;
	}

	public void setCommTitle(String commTitle) {
		this.commTitle = commTitle;
	}

	public String getCommContent() {
		return commContent;
	}

	public void setCommContent(String commContent) {
		this.commContent = commContent;
	}

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	@Override
	public String toString() {
		return "Comment [commId=" + commId + ", commTitle=" + commTitle + ", commContent=" + commContent + ", blogId="
				+ blogId + "]";
	}
	
}
