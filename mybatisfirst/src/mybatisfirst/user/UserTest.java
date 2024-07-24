package mybatisfirst.user;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserTest {
	
	public static void main(String[] args) {
		
		String resource = "conf/configuration.xml";
		Reader reader;
		SqlSession session = null;
		
		try {
			
			reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
			session = ssf.openSession();
			
			// insert
//			User user = new User(0, "hong@hong.com", "홍길동", "hong");
//			int result = session.insert("insertUser", user);
//			session.commit();
//			if (result > 0) {
//				System.out.println("입력 성공!");
//			} else {
//				System.out.println("입력 실패!");
//			}
			
			// select
//			List<User> userList = session.selectList("selectAllUsers");
//			for (User user : userList) {
//				System.out.println(user);
//			}
			
			// delete
//			int result = session.delete("deleteUser", 3);
//			session.commit();
//			if (result > 0) {
//				System.out.println("삭제 성공!");
//			} else {
//				System.out.println("삭제 실패!");
//			}
			
			// update
//			User user = new User(1, "kang@kang.com", "강감찬", "kang");
//			int result = session.update("updateUser", user);
//			session.commit();
//			if (result > 0) {
//				System.out.println("수정 성공!");
//			} else {
//				System.out.println("수정 실패!");
//			}
			
			// selectOne
			User user = session.selectOne("getUser", 1);
			System.out.println(user);
 			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (session!=null) session.close();
		}
		
	} // main

} // class













