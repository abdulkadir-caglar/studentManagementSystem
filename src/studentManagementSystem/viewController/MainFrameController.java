package studentManagementSystem.viewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import studentManagementSystem.view.admin.AdminFrame;
import studentManagementSystem.view.main.MainFrame;
import studentManagementSystem.view.register.RegisterFrame;

public class MainFrameController implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == MainFrame.getInstance().getBtnRegister()) {
			MainFrame.getInstance().dispose();
			RegisterFrame.getInstance().setVisible(true);
		}
		
		if(e.getSource() == MainFrame.getInstance().getBtnLogin()) {
			char[] passwordChars = MainFrame.getInstance().getPasswordTF().getPassword();
			if(MainFrame.getInstance().getEmailTF().getText().equals("admin") && new String(passwordChars).equals("admin")) {
				MainFrame.getInstance().dispose();
				AdminFrame.getInstance().setVisible(true);
			}
		}
	}	
}