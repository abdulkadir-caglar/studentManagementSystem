package studentManagementSystem.viewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import studentManagementSystem.controller.student.StudentController;
import studentManagementSystem.dto.studentDto.StudentDto;
import studentManagementSystem.view.main.MainFrame;
import studentManagementSystem.view.register.RegisterFrame;
import studentManagementSystem.viewModel.RegisterCheck;

public class RegisterFrameController implements ActionListener{
	private final StudentController studentController = new StudentController();
	private final StudentDto studentDto = new StudentDto();

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == RegisterFrame.getInstance().getBtnRegister()) {
			if(RegisterCheck.getInstance().checkRegisterFields()) {
				studentController.saveStudent(studentDto.setStudent());
				JOptionPane.showMessageDialog(null, "Successfully saved.");
			}
		}
		
		if(e.getSource() == RegisterFrame.getInstance().getBtnLogin()) {
			RegisterFrame.getInstance().dispose();
			MainFrame.getInstance().setVisible(true);
		}
	}
	
}