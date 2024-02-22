package studentManagementSystem.repository.student;

public class StudentQueries {
	private String saveStudent = "INSERT INTO student (student_name, student_last_name, email, password) VALUES (?, ?, ?, ?)";
	
	private String findStudentByLogin = "SELECT * FROM student WHERE email=? AND password=?";
	
	private String findStudentByEmail= "SELECT * FROM student WHERE email=?";
	
	public String getSaveStudent() {
		return this.saveStudent;
	}

	public String getFindStudentByLogin() {
		return findStudentByLogin;
	}
	
	public String getFindStudentByEmail() {
		return findStudentByEmail;
	}
}