package studentManagementSystem.viewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import studentManagementSystem.view.student.StudentFrame;

public class StudentFrameController implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == StudentFrame.getInstance().getBtnCourse()) {
			System.out.println("course");
		}else if(e.getSource() == StudentFrame.getInstance().getBtnExam()) {
			System.out.println("exam");
		}else if(e.getSource() == StudentFrame.getInstance().getBtnProfile()) {
			System.out.println("course");
		}
		
	}
	
}
