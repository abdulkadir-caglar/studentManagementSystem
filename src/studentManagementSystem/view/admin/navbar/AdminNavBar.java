package studentManagementSystem.view.admin.navbar;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;

public class AdminNavBar extends JPanel {
	private JButton btnStudent;
	private JButton btnCourse;
	
	public AdminNavBar() {
		this.setBounds(100,100,800,50);
		
		Font font = new Font ("Arial", Font.PLAIN, 16);
		
		btnStudent = new JButton("Students");
		btnStudent.setPreferredSize(new Dimension(100, 40));
		btnStudent.setFont(font);
		this.add(btnStudent);
		
		btnCourse = new JButton("Courses");
		btnCourse.setPreferredSize(new Dimension(100, 40));
		btnCourse.setFont(font);
		this.add(btnCourse);
	}
}