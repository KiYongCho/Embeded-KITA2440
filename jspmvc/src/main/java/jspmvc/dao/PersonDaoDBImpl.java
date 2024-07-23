package jspmvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jspmvc.util.ConnectionUtil;
import jspmvc.vo.Person;

public class PersonDaoDBImpl implements PersonDao {
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	@Override
	public List<Person> listPerson(List<Person> personList) throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " select * from person order by pid desc ";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		personList = new ArrayList<Person>();
		while (rs.next()) {
			Person person = new Person(
					rs.getInt("pid"),
					rs.getString("name"),
					rs.getInt("age")
			);
			personList.add(person);
		}
		return personList;
	}

	@Override
	public Person getPerson(List<Person> personList, int pid) throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " select * from person where pid=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pid);
		rs = pstmt.executeQuery();
		Person person = null;
		if (rs.next()) {
			person = new Person(
					rs.getInt("pid"),
					rs.getString("name"),
					rs.getInt("age")
			);
		}
		return person;
	}

	@Override
	public List<Person> registPerson(List<Person> personList, Person person) throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " insert into person values(seq_person.nextval, ?, ?) ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, person.getName());
		pstmt.setInt(2, person.getAge());
		pstmt.executeUpdate();
		personList.add(person);
		return personList;
	}

	@Override
	public List<Person> updatePerson(List<Person> personList, 
			Person personBefore, Person personAfter) throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " update person set name=?, age=? where pid=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, personAfter.getName());
		pstmt.setInt(2, personAfter.getAge());
		pstmt.setInt(3, personAfter.getPid());
		pstmt.executeUpdate();
		personList.remove(personBefore);
		personList.add(personAfter);
		return personList;
	}

	@Override
	public List<Person> deletePerson(List<Person> personList, int pid) throws Exception {
		conn = ConnectionUtil.getConnection();
		String sql = " delete person where pid=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, pid);
		pstmt.executeUpdate();
		//personList.remove(getPerson(personList, pid));
		Person removePerson = null;
		// list의 요소 제거할때 list 순회를 끝내고 제거해라!!!
		for (Person person : personList) {
			if (person.getPid() == pid) {
				removePerson = person;
			}
		}
		personList.remove(removePerson);
		return personList;
	}

} // class










