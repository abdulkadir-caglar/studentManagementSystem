package studentManagementSystem.repository.student;

import studentManagementSystem.repository.dbConfig.DatabaseConfig;

public class StudentTable {
	private DatabaseConfig db = new DatabaseConfig();
	
	private String query = "CREATE TABLE student ("
		    + "id INT(11) PRIMARY KEY AUTO_INCREMENT,"
		    + "student_name VARCHAR(50),"
		    + "student_last_name VARCHAR(50),"
		    + "email VARCHAR(100),"
		    + "password VARCHAR(64),";
	
	public void create() {
		db.createDB(query);
	}
}
