package studentManagementSystem.viewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import studentManagementSystem.view.admin.AdminFrame;
import studentManagementSystem.view.admin.internalFrame.course.CourseInternalFrame;
import studentManagementSystem.view.admin.internalFrame.student.StudentInternalFrame;
import studentManagementSystem.view.admin.navbar.AdminNavBar;

public class AdminNavbarController implements ActionListener{
	StudentInternalFrame student = StudentInternalFrame.getInstance();
	CourseInternalFrame course =  CourseInternalFrame.getInstance();
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == AdminNavBar.getInstance().getBtnStudent()) {
			if(course.isVisible()) {
				course.setVisible(false);
				AdminFrame.getInstance().getDesktopPane().remove(course);
			}
			if(!student.isVisible())
				if (!AdminFrame.getInstance().getDesktopPane().isAncestorOf(student)) {
                    AdminFrame.getInstance().getDesktopPane().add(student);
                }
				student.setVisible(true);
		}
		if(e.getSource() == AdminNavBar.getInstance().getBtnCourse()) {
			if(student.isVisible()) {
				student.setVisible(false);
				AdminFrame.getInstance().getDesktopPane().remove(student);
			}	
			if(!course.isVisible()) {
				if (!AdminFrame.getInstance().getDesktopPane().isAncestorOf(course)) {
                    AdminFrame.getInstance().getDesktopPane().add(course);
                }
				course.setVisible(true);
			}		
		}
	}
}