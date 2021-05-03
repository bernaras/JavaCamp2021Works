
public class Student extends User{

	  int studentId;
	  String studentCourse;
	  
	  public Student (int id, String userName, String password, String email,int studentId, String studentCourse) {
			
		}

public Student() {
	
}

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentCourse() {
	return studentCourse;
}

public void setStudentCourse(String studentCourse) {
	this.studentCourse = studentCourse;
}

 
	
}
