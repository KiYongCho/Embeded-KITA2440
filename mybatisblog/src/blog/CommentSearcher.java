package blog;

public class CommentSearcher {
	
	private Integer blogId;
	private String searchKey;
	private String searchValue;
	
	public CommentSearcher() {
	}

	public CommentSearcher(Integer blogId, String searchKey, String searchValue) {
		super();
		this.blogId = blogId;
		this.searchKey = searchKey;
		this.searchValue = searchValue;
	}

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	@Override
	public String toString() {
		return "CommentSearcher [blogId=" + blogId + ", searchKey=" + searchKey + ", searchValue=" + searchValue + "]";
	}
	
}
