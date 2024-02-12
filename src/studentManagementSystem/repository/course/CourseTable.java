package studentManagementSystem.repository.course;

import studentManagementSystem.repository.dbConfig.DatabaseConfig;

public class CourseTable {
	private DatabaseConfig db = new DatabaseConfig();
	
	private String query = "CREATE TABLE course ("
		    + "id INT(11) PRIMARY KEY AUTO_INCREMENT,"
		    + "course_name VARCHAR(100))";
	
	public void create() {
		db.createDB(query);
	}
}
