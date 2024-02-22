package studentManagementSystem.viewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import studentManagementSystem.controller.student.StudentController;
import studentManagementSystem.dto.passwordDto.PasswordConverter;
import studentManagementSystem.session.SessionInfo;
import studentManagementSystem.view.admin.AdminFrame;
import studentManagementSystem.view.main.MainFrame;
import studentManagementSystem.view.register.RegisterFrame;

public class MainFrameController implements ActionListener{
	private PasswordConverter pc = new PasswordConverter();
	private StudentController studentController = new StudentController();
	private SessionInfo session = new SessionInfo();
	
	private int userId;

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == MainFrame.getInstance().getBtnRegister()) {
			MainFrame.getInstance().dispose();
			RegisterFrame.getInstance().setVisible(true);
		}
		
		if(e.getSource() == MainFrame.getInstance().getBtnLogin()) {
			try {
				ResultSet rs = studentController.getStudentByLogin();
				
				if(MainFrame.getInstance().getEmailTF().getText().equals("admin") && pc.convertPassword().equals("admin")) {
					MainFrame.getInstance().dispose();
					AdminFrame.getInstance().setVisible(true);
				}else if(rs.next()) {
					session.setUserId(rs.getInt("id"));
					session.setUserName(rs.getString("student_name"));
					session.setUserSurname(rs.getString("student_last_name"));
					session.setUserEmail(rs.getString("email"));
				}
					
			} catch (SQLException exp) {
				exp.printStackTrace();
			}
		}
	}	
}