package board;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardDao implements BoardInterface {
	
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
	public List<Board> listBoard(String bsort, String searchKeyword, String searchValue) 
			throws SQLException {
		Search search = new Search(bsort, searchKeyword, searchValue);
		return ssf.openSession().selectList("board.selectBoard", search);
	}

	@Override
	public Board getBoard(int bid) throws SQLException {
		SqlSession ss = ssf.openSession();
		Board board = ss.selectOne("board.getBoard", bid);
		ss.close();
		return board;
	}

	@Override
	public int registBoard(Board board) throws SQLException {
		SqlSession ss = ssf.openSession();
		int result = ss.insert("board.registBoard", board);
		ss.commit();
		ss.close();
		return result;		
	}

	@Override
	public int updateBoard(Board board) throws SQLException {
		SqlSession ss = ssf.openSession();
		int result = ss.insert("board.updateBoard", board);
		ss.commit();
		ss.close();
		return result;
	}

	@Override
	public int deleteBoard(int bid) throws SQLException {
		SqlSession ss = ssf.openSession();
		int result = ss.insert("board.deleteBoard", bid);
		ss.commit();
		ss.close();
		return result;
	}

	@Override
	public int addCount(int bid) throws SQLException {
		SqlSession ss = ssf.openSession();
		int result = ss.insert("board.addCount", bid);
		ss.commit();
		ss.close();
		return result;		
	}

} // class














