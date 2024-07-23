package jspmvc.service;

import java.util.List;

import jspmvc.vo.Person;

public interface PersonService {
	
	public abstract List<Person> listPerson(List<Person> personList) throws Exception;
	
	public abstract Person getPerson(List<Person> personList, int pid) throws Exception;
	
	public abstract List<Person> registPerson
		(List<Person> personList, Person person) throws Exception;
	
	public abstract List<Person> updatePerson(List<Person> personList, 
			Person personBefore, Person personAfter) throws Exception;
	
	public abstract List<Person> deletePerson(List<Person> personList, int pid) throws Exception;

}
