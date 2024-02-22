package studentManagementSystem.controller.student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import studentManagementSystem.dto.passwordDto.PasswordConverter;
import studentManagementSystem.encryptor.Encryptor;
import studentManagementSystem.model.student.Student;
import studentManagementSystem.repository.dbConfig.DatabaseConfig;
import studentManagementSystem.repository.student.StudentQueries;
import studentManagementSystem.view.main.MainFrame;
import studentManagementSystem.view.register.RegisterFrame;

public class StudentController {
	private DatabaseConfig db = new DatabaseConfig();
	private StudentQueries queries = new StudentQueries();
	private Encryptor encryptor = new Encryptor();
	private PasswordConverter pc = new PasswordConverter();
	
	public void saveStudent(Student student) {
		try {
			PreparedStatement saveSt = db.connect().prepareStatement(queries.getSaveStudent());
			
			saveSt.setString(1, student.getFirstName());
			saveSt.setString(2, student.getLastName());
			saveSt.setString(3, student.getEmail());
			saveSt.setString(4, student.getPassword());
			saveSt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet getStudentByLogin() {
		try {
			PreparedStatement ps = db.connect().prepareStatement(queries.getFindStudentByLogin());
			ps.setString(1, MainFrame.getInstance().getEmailTF().getText());
			ps.setString(2, encryptor.encryptString(pc.convertPassword()));
			return ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ResultSet getStudentByEmail() {
		try {
			PreparedStatement ps = db.connect().prepareStatement(queries.getFindStudentByEmail());
			ps.setString(1, RegisterFrame.getInstance().getEmailTF().getText());
			return ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
