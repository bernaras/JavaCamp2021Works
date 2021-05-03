
public class Instructor extends User{
	 
	String instructorId;
	String instructorCourse;
	
	public Instructor(int id, String userName, String password, String email,
			String instructorId,String instructorCourse) {
		
			}
	
public Instructor() {
		
	}

public String getInstructorId() {
	return instructorId;
}

public void setInstructorId(String instructorId) {
	this.instructorId = instructorId;
}

public String getInstructorCourse() {
	return instructorCourse;
}

public void setInstructorCourse(String instructorCourse) {
	this.instructorCourse = instructorCourse;
}

	 
}
