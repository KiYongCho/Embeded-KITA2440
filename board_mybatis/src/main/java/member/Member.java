package member;

public class Member {
	
	private String mid;
	private String mpass;
	
	public Member() {
	}
	
	public Member(String mid, String mpass) {
		super();
		this.mid = mid;
		this.mpass = mpass;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpass() {
		return mpass;
	}

	public void setMpass(String mpass) {
		this.mpass = mpass;
	}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", mpass=" + mpass + "]";
	}
	
}
