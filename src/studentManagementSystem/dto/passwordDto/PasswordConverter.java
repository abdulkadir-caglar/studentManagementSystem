package studentManagementSystem.dto.passwordDto;

import studentManagementSystem.view.main.MainFrame;

public class PasswordConverter {
	public String convertPassword() {
		char[] passwordChars = MainFrame.getInstance().getPasswordTF().getPassword();
		
		return new String(passwordChars);
	}
}
