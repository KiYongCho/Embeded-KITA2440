package blog;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CommentMain {
	
	public static void main(String[] args) {
		
		String resource = "conf/configuration.xml";
		Reader reader;
		SqlSession session = null;
		
		try {
			
			reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
			session = ssf.openSession();
			
			// 1. comment테이블에 5개 행 입력
//			for (int i=1; i<6; i++) {
//				 Comment comment = new Comment(0, "댓글제목"+i, "댓글내용"+i, 1);
//				session.insert("insertComment", comment);
//				session.commit();
//			}
			
			// 2. author 행의 수 출력
//			int listCount = session.selectOne("countComment");
//			System.out.println("comment 행의 수 : " + listCount);
			
			// 3. comment 5번째 행 수정
//			Comment comment = new Comment(5, "댓글제목수정", "댓글내용수정", 0);
//			session.update("updateComment", comment);
//			session.commit();
			
			// 4. comment 5번째 행 삭제
			session.delete("deleteComment", 5);
			session.commit();
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (session!=null) {
				session.close();
			}
		}
		
	} // main

} // class












