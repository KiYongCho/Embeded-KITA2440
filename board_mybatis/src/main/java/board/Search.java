package board;

public class Search {
	
	private String bsort;
	private String searchKeyword;
	private String searchValue;
	
	public Search() {
	}

	public Search(String bsort, String searchKeyword, String searchValue) {
		super();
		this.bsort = bsort;
		this.searchKeyword = searchKeyword;
		this.searchValue = searchValue;
	}

	public String getBsort() {
		return bsort;
	}

	public void setBsort(String bsort) {
		this.bsort = bsort;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	public String getSearchValue() {
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}

	@Override
	public String toString() {
		return "Search [bsort=" + bsort + ", searchKeyword=" + searchKeyword + ", searchValue=" + searchValue + "]";
	}
	
}
