package member;

import java.sql.SQLException;

public interface MemberInterface {
	
	public abstract int getMember(Member member) throws SQLException;

}
