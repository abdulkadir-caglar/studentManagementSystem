package studentManagementSystem.dto.studentDto;

import studentManagementSystem.encryptor.Encryptor;
import studentManagementSystem.model.student.Student;
import studentManagementSystem.view.register.RegisterFrame;

public class StudentDto {
	private Student student;
	private Encryptor encryptor = new Encryptor();
	
	public Student setStudent() {
		student = new Student();
		
		student.setFirstName(RegisterFrame.getInstance().getNameTF().getText());
		student.setLastName(RegisterFrame.getInstance().getSurnameTF().getText());
		student.setEmail(RegisterFrame.getInstance().getEmailTF().getText());
		student.setPassword(encryptor.encryptString(RegisterFrame.getInstance().getPasswordTF().getText()));
	
		return student;
	}
}