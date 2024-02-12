package studentManagementSystem.repository.exam;

import studentManagementSystem.repository.dbConfig.DatabaseConfig;

public class ExamScoreTable {
	private DatabaseConfig db = new DatabaseConfig();

	private String query = "CREATE TABLE exam_score("
			+ "exam_id INT AUTO_INCREMENT PRIMARY KEY,"
			+ "    student_id INT,"
			+ "    course_id INT,"
			+ "    score DECIMAL(5, 2),"
			+ "    FOREIGN KEY (student_id) REFERENCES student(id),"
			+ "    FOREIGN KEY (course_id) REFERENCES course(id))";

	public void create() {
		db.createDB(query);
	}
}
