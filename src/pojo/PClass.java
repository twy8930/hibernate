package pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * 班级类bean
 * @author twy
 *
 */
public class PClass {
	
	private long id;
	private String cname;
	private Set<Person> persons=new HashSet<Person>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Set<Person> getPersons() {
		return persons;
	}
	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}
	
}
