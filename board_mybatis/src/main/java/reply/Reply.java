package reply;

import java.sql.Timestamp;

public class Reply {
	
	private int rid;
	private String rwriter;
	private String rcontent;
	private Timestamp rregdate;
	private int bid;
	
	public Reply() {
	}

	public Reply(int rid, String rwriter, String rcontent, Timestamp rregdate, int bid) {
		super();
		this.rid = rid;
		this.rwriter = rwriter;
		this.rcontent = rcontent;
		this.rregdate = rregdate;
		this.bid = bid;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRwriter() {
		return rwriter;
	}

	public void setRwriter(String rwriter) {
		this.rwriter = rwriter;
	}

	public String getRcontent() {
		return rcontent;
	}

	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}

	public Timestamp getRregdate() {
		return rregdate;
	}

	public void setRregdate(Timestamp rregdate) {
		this.rregdate = rregdate;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	@Override
	public String toString() {
		return "Reply [rid=" + rid + ", rwriter=" + rwriter + ", rcontent=" + rcontent + ", rregdate=" + rregdate
				+ ", bid=" + bid + "]";
	}
	
}
