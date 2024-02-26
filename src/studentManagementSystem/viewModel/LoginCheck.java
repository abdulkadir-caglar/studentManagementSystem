package studentManagementSystem.viewModel;

import javax.swing.JOptionPane;

import studentManagementSystem.dto.passwordDto.PasswordConverter;
import studentManagementSystem.validator.EmailValidator;
import studentManagementSystem.view.main.MainFrame;

public class LoginCheck {
	private static LoginCheck instance;
	private final PasswordConverter pc = new PasswordConverter();
	
	public static LoginCheck getInstance() {
		if(instance == null) {
			instance  = new LoginCheck();
		}return instance;
	}
	
	public boolean loginCheck() {
		if(MainFrame.getInstance().getEmailTF().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Email field cannot be left empty.");
			return false;
		}else if(pc.convertPassword().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Password field cannot be left empty.");
			return false;
		}else if(!EmailValidator.isValidEmail(MainFrame.getInstance().getEmailTF().getText())) {
			JOptionPane.showMessageDialog(null, "Please enter a valid mail address.");
			return false;
		}else return true;
	}
}
