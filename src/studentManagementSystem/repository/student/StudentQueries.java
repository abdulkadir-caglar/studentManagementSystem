package studentManagementSystem.repository.student;

public class StudentQueries {
	private String saveStudent = "INSERT INTO student (student_name, student_last_name, email, password) VALUES (?, ?, ?, ?)";
	
	public String getSaveStudent() {
		return this.saveStudent;
	}
}
