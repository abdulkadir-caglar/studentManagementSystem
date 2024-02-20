package studentManagementSystem.viewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import studentManagementSystem.view.admin.AdminFrame;
import studentManagementSystem.view.admin.internalFrame.course.CourseInternalFrame;
import studentManagementSystem.view.admin.internalFrame.student.StudentInternalFrame;
import studentManagementSystem.view.admin.navbar.AdminNavBar;

public class AdminNavbarController implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == AdminNavBar.getInstance().getBtnStudent()) {
			System.out.println("student");
			AdminFrame.getInstance().getDesktopPane().add(StudentInternalFrame.getInstance());
		}
		if(e.getSource() == AdminNavBar.getInstance().getBtnCourse()) {
			System.out.println("course");
			AdminFrame.getInstance().getDesktopPane().add(CourseInternalFrame.getInstance());
		}
	}
}