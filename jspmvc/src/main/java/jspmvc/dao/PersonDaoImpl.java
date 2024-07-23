package jspmvc.dao;

import java.util.ArrayList;
import java.util.List;

import jspmvc.vo.Person;

public class PersonDaoImpl implements PersonDao {

	@Override
	public List<Person> listPerson(List<Person> personList) throws Exception {
		return personList;
	}

	@Override
	public Person getPerson(List<Person> personList, int pid) throws Exception {
		for (Person person : personList) {
			if (person.getPid() == pid) {
				return person;
			}
		}
		return null;
	}

	@Override
	public List<Person> registPerson(List<Person> personList, Person person) throws Exception {
		personList.add(person);		
		return personList;
	}

	@Override
	public List<Person> updatePerson(List<Person> personList, 
			Person personBefore, Person personAfter) throws Exception {
		personList.remove(personBefore);
		personList.add(personAfter);
		return personList;
	}

	@Override
	public List<Person> deletePerson(List<Person> personList, int pid) throws Exception {
		Person person = getPerson(personList, pid);
		personList.remove(person);
		return personList;
	}

}
