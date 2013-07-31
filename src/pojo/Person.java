package pojo;

/**
 * 人物类bean
 * @author twy
 *
 */
public class Person {
	
	private long id;
	private String name;
	private int age;
	private long cid;
	private PClass pClass;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public PClass getpClass() {
		return pClass;
	}
	public void setpClass(PClass pClass) {
		this.pClass = pClass;
	}
}
