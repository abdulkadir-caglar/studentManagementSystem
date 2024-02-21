package studentManagementSystem.viewController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import studentManagementSystem.dto.passwordDto.PasswordConverter;
import studentManagementSystem.encryptor.Encryptor;
import studentManagementSystem.view.admin.AdminFrame;
import studentManagementSystem.view.main.MainFrame;
import studentManagementSystem.view.register.RegisterFrame;

public class MainFrameController implements ActionListener{
	Encryptor encryptor = new Encryptor();
	PasswordConverter pc = new PasswordConverter();

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == MainFrame.getInstance().getBtnRegister()) {
			MainFrame.getInstance().dispose();
			RegisterFrame.getInstance().setVisible(true);
		}
		
		if(e.getSource() == MainFrame.getInstance().getBtnLogin()) {
			
			if(MainFrame.getInstance().getEmailTF().getText().equals("admin") && pc.convertPassword().equals("admin")) {
				MainFrame.getInstance().dispose();
				AdminFrame.getInstance().setVisible(true);
			}
		}
	}	
}