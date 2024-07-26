package blog;

public class Author {
	
	private int authorId;
	private String authorName;
	private int blogId;
	
	public Author() {
	}

	public Author(int authorId, String authorName, int blogId) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.blogId = blogId;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", blogId=" + blogId + "]";
	}
	
}
