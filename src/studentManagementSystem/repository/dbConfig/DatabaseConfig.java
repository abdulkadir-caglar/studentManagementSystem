package studentManagementSystem.repository.dbConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConfig {
	
	private String url = "jdbc:mysql://localhost:3306/student";
	private String userName = "root";
	private String password = "password";
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	public Connection connect() {
		try {
			Connection conn = DriverManager.getConnection(url, userName,password);
			return conn;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void createDB(String q) {
		try {
			Class.forName(driver);
			Statement pSt = connect().createStatement();
			pSt.executeUpdate(q);
			
			System.out.println("Success!");
			connect().close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
