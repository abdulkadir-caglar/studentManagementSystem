package studentManagementSystem.dto.studentDto;

import studentManagementSystem.model.student.Student;
import studentManagementSystem.view.register.RegisterFrame;

public class StudentDto {
	private Student student;
	
	public Student setStudent() {
		student = new Student();
		
		student.setFirstName(RegisterFrame.getInstance().getNameTF().getText());
		student.setLastName(RegisterFrame.getInstance().getSurnameTF().getText());
		student.setEmail(RegisterFrame.getInstance().getEmailTF().getText());
		student.setPassword(RegisterFrame.getInstance().getPasswordTF().getText());
	
		return student;
	}
}