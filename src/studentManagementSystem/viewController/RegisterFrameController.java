package studentManagementSystem.viewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import studentManagementSystem.controller.student.StudentController;
import studentManagementSystem.dto.studentDto.StudentDto;
import studentManagementSystem.view.register.RegisterFrame;
import studentManagementSystem.viewModel.Check;

public class RegisterFrameController implements ActionListener{
	StudentController studentController = new StudentController();
	StudentDto studentDto = new StudentDto();

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == RegisterFrame.getInstance().getBtnRegister()) {
			if(Check.getInstance().checkRegisterFields()) {
				studentController.saveStudent(studentDto.setStudent());
				JOptionPane.showMessageDialog(null, "Successfully saved.");
			}
		}
	}
	
}
