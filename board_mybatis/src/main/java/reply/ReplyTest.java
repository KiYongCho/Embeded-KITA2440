package reply;

import java.util.List;

public class ReplyTest {
	
	public static void main(String[] args) throws Exception {
		
		ReplyInterface ri = new ReplyDao();
		
		// insert
//		Reply reply = new Reply(0, "댓글작성자1", "댓글내용1", null, 103);
//		ri.registReply(reply);
//		reply = new Reply(0, "댓글작성자2", "댓글내용2", null, 103);
//		ri.registReply(reply);
//		reply = new Reply(0, "댓글작성자3", "댓글내용3", null, 103);
//		ri.registReply(reply);
	
		// delete
		ri.deleteReply(3);		
		
		// list
		List<Reply> replyList = ri.listReply();
		for (Reply eachReply : replyList) {
			System.out.println(eachReply);
		}
		
	} // main

} // class








