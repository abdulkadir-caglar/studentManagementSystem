package studentManagementSystem.controller.student;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import studentManagementSystem.model.student.Student;
import studentManagementSystem.repository.dbConfig.DatabaseConfig;
import studentManagementSystem.repository.student.StudentQueries;

public class StudentController {
	private DatabaseConfig db = new DatabaseConfig();
	private StudentQueries queries = new StudentQueries();
	
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
}
