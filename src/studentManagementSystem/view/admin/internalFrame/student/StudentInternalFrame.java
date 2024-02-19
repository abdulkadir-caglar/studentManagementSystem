package studentManagementSystem.view.admin.internalFrame.student;

import javax.swing.JScrollPane;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTable;

import studentManagementSystem.view.admin.internalFrame.BaseInternalFrame;

import java.awt.Color;

public class StudentInternalFrame extends BaseInternalFrame {
	private static StudentInternalFrame instance;
	
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnEdit;
	private JButton btnRemove;
	private JButton btnAdd;
	
	public static StudentInternalFrame getInstance() {
		if(instance == null) {
			instance = new StudentInternalFrame();
		}return instance;
	}

	public StudentInternalFrame() {
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 10, 303, 342);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setColumnHeaderView(table);
		
		Font font = new Font("Arial", Font.PLAIN, 16);
		
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