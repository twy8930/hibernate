package pojo;

/**
 * 学号类bean
 * @author twy
 *
 */
public class PNum {
	
	private long id;
	private String detail;
	private Person person;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

}
