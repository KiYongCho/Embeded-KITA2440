package reply;

import java.util.List;

public interface ReplyInterface {
	
	public abstract List<Reply> listReply(int bid) throws Exception;
	
	public abstract int registReply(Reply reply) throws Exception;
	
	public abstract int deleteReply(int rid) throws Exception;

}
