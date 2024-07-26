package blog;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BlogMain {
	
	public static void main(String[] args) {
		
		String resource = "conf/configuration.xml";
		Reader reader;
		SqlSession session = null;
		
		try {
			
			reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
			session = ssf.openSession();
			
			// 1. blog테이블에 5개 행 입력
//			for (int i=1; i<6; i++) {
//				Blog blog = new Blog(0, "블로그제목"+i, "블로그내용"+i, null, null, 0);
//				session.insert("insertBlog", blog);
//				session.commit();
//			}
			
			// 2. blog 행의 수 출력
//			int listCount = session.selectOne("countBlog");
//			System.out.println("blog 행의 수 : " + listCount);
			
			// 3. blog 5번째 행 수정
//			Blog blog = new Blog(5, "제목수정", "내용수정", null, null, 0);
//			session.update("updateBlog", blog);
//			session.commit();
			
			// 4. blog 5번째 행 삭제
//			session.delete("deleteBlog", 5);
//			session.commit();
			
			// 5. 조인된 blog 리스트
//			List<Blog> blogList = session.selectList("selectBlog");
//			System.out.println(blogList);
//			for (Blog blog : blogList) {
//				System.out.println("blod_id : " + blog.getBlogId());
//				Author author = blog.getAuthor();
//				System.out.println("\tauthor : " + author);
//				List<Comment> commList = blog.getComms();
//				for (Comment comment :  commList) {
//					System.out.println("\tcomment : " + comment);
//				}
//			}
			
			// 6. comment 리스트 검색
//			CommentSearcher cs = new CommentSearcher(1, "content", "내용");
//			List<Comment> commentList = session.selectList("selectCommsByBlogId", cs);
//			for (Comment comment : commentList) {
//				System.out.println(comment);
//			}
			
			// 7. commentId에 해당하는 comment 리스트 검색 
			List<Integer> commIdList = new ArrayList<Integer>();
			commIdList.add(1);
			commIdList.add(2);
			commIdList.add(3);
			commIdList.add(4);
			List<Comment> commentList 
				= session.selectList("selectCommsByCommIds", commIdList);
			for (Comment comment : commentList) {
				System.out.println(comment);
			}
			
			
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (session!=null) {
				session.close();
			}
		}
		
	} // main

} // class












