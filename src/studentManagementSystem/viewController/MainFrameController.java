package studentManagementSystem.viewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import studentManagementSystem.view.main.MainFrame;
import studentManagementSystem.view.register.RegisterFrame;

public class MainFrameController implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == MainFrame.getInstance().getBtnRegister()) {
			MainFrame.getInstance().dispose();
			RegisterFrame.getInstance().setVisible(true);
		}
	}	
}