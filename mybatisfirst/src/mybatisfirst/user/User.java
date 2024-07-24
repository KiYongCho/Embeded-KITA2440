package mybatisfirst.user;

public class User {
	
	private int sid;
	private String email;
	private String name;
	private String passwd;
	
	public User() {
	}

	public User(int sid, String email, String name, String passwd) {
		super();
		this.sid = sid;
		this.email = email;
		this.name = name;
		this.passwd = passwd;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "User [sid=" + sid + ", email=" + email + ", name=" + name + ", passwd=" + passwd + "]";
	}
	
}
