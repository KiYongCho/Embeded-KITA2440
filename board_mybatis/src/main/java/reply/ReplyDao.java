package reply;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.Board;

public class ReplyDao implements ReplyInterface {
	
	private static Reader reader = null;
	private static SqlSessionFactory ssf = null;
	
	static {
		try {
			reader = Resources.getResourceAsReader("conf/configuration.xml");
			ssf = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}	

	@Override
	public List<Reply> listReply(int bid) throws Exception {
		return ssf.openSession().selectList("reply.listReply", bid);
	}

	@Override
	public int registReply(Reply reply) throws Exception {
		SqlSession ss = ssf.openSession(true);
		
		Board board = new Board();
		board.setBid(reply.getBid());
		board.setRcount(1);
		ss.update("board.changeRcount", board);
				
		int result = ss.insert("reply.registReply", reply);
		ss.close();
		return  result;
	}

	@Override
	public int deleteReply(Reply reply) throws Exception {
		SqlSession ss = ssf.openSession(true);
		
		Board board = new Board();
		board.setBid(reply.getBid());
		board.setRcount(-1);
		ss.update("board.changeRcount", board);		
		
		int result = ss.delete("reply.deleteReply", reply.getRid());
		ss.close();
		return  result;		
	}

}
















