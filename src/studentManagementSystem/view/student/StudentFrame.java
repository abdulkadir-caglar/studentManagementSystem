package studentManagementSystem.view.student;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import studentManagementSystem.viewController.StudentFrameController;

public class StudentFrame extends JFrame {
	private static StudentFrame instance;

	private JPanel contentPane;
	private JButton btnCourse;
	private JButton btnExam;
	private JButton btnProfile;
	
	public static StudentFrame getInstance() {
		if(instance == null) {
			instance = new StudentFrame();
		}return instance;
	}

	public StudentFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(180, 180, 180, 180));
		contentPane.setLayout(new GridLayout(4,2,10,20));
		
		Font btnFont = new Font("Arial", Font.BOLD, 16);
		
		btnCourse = new JButton("My Courses");
		btnCourse.setFont(btnFont);
		btnCourse.addActionListener(new StudentFrameController());
		
		btnExam= new JButton("Exam Scores");
		btnExam.setFont(btnFont);
		btnExam.addActionListener(new StudentFrameController());
		
		btnProfile = new JButton("Profile");
		btnProfile.setFont(btnFont);
		btnProfile.addActionListener(new StudentFrameController());
		
		contentPane.add(btnCourse);
		contentPane.add(btnExam);
		contentPane.add(btnProfile);
		setContentPane(contentPane);
	}

	public JButton getBtnCourse() {
		return this.btnCourse;
	}
	
	public JButton getBtnExam() {
		return this.btnExam;
	}
	
	public JButton getBtnProfile() {
		return this.btnProfile;
	}
}