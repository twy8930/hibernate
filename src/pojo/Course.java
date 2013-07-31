package pojo;

/**
 * 课程类bean
 * 
 * @author twy
 * 
 */
public class Course {

	private long id;
	private long courseId;
	private String courseName;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
