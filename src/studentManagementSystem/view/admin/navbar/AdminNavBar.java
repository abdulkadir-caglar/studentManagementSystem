package studentManagementSystem.view.admin.navbar;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import studentManagementSystem.viewController.AdminNavbarController;

import java.awt.Dimension;

public class AdminNavBar extends JPanel {
	private static AdminNavBar instance;
	
	private JButton btnStudent;
	private JButton btnCourse;
	
	public static AdminNavBar getInstance() {
		if(instance == null) {
			instance = new AdminNavBar();
		}return instance;
	}
	
	public AdminNavBar() {
		this.setBounds(100,100,800,50);
		
		Font font = new Font ("Arial", Font.PLAIN, 16);
		
		btnStudent = new JButton("Students");
		btnStudent.setPreferredSize(new Dimension(100, 40));
		btnStudent.setFont(font);
		btnStudent.addActionListener(new AdminNavbarController());
		this.add(btnStudent);
		
		btnCourse = new JButton("Courses");
		btnCourse.setPreferredSize(new Dimension(100, 40));
		btnCourse.setFont(font);
		btnCourse.addActionListener(new AdminNavbarController());
		this.add(btnCourse);
	}
	
	public JButton getBtnStudent() {
		return this.btnStudent;
	}
	
	public JButton getBtnCourse() {
		return this.btnCourse;
	}
}