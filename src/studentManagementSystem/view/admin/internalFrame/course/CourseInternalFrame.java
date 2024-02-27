package studentManagementSystem.view.admin.internalFrame.course;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import studentManagementSystem.view.admin.internalFrame.BaseInternalFrame;

public class CourseInternalFrame extends BaseInternalFrame {
	private static CourseInternalFrame instance;
	
	private JLabel lblCourse;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnEdit;
	private JButton btnRemove;
	private JButton btnAdd; 
	
	public static CourseInternalFrame getInstance() {
		if(instance == null) {
			instance = new CourseInternalFrame();
		}return instance;
	}

	public CourseInternalFrame() {
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 10, 303, 342);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		Font font = new Font("Arial", Font.PLAIN, 16);
		
		lblCourse = new JLabel("COURSE");
		lblCourse.setFont(font);
		lblCourse.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourse.setBounds(368, 12, 115, 31);
		getContentPane().add(lblCourse);
		
		btnEdit = new JButton("Edit");
		btnEdit.setBounds(368, 119, 115, 31);
		btnEdit.setFont(font);
		getContentPane().add(btnEdit);
		
		btnRemove = new JButton("Remove");
		btnRemove.setBounds(368, 159, 115, 31);
		btnRemove.setFont(font);
		getContentPane().add(btnRemove);
		
		btnAdd = new JButton("New");
		btnAdd.setBounds(368, 200, 115, 31);
		btnAdd.setFont(font);
		getContentPane().add(btnAdd);
	}

}
