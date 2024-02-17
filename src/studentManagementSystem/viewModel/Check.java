package studentManagementSystem.viewModel;

import javax.swing.JOptionPane;

import studentManagementSystem.validator.EmailValidator;
import studentManagementSystem.view.register.RegisterFrame;

public class Check {
	private static Check instance;
	
	public static Check getInstance() {
		if(instance == null) {
			instance = new Check();
		}return instance;
	}
	
	public boolean checkRegisterFields() {
		if(RegisterFrame.getInstance().getNameTF().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Name field cannot be left empty.");
			return false;
		}else if(RegisterFrame.getInstance().getSurnameTF().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Surname field cannot be left empty.");
			return false;
		}else if(RegisterFrame.getInstance().getEmailTF().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Email field cannot be left empty.");
			return false;
		}else if(!EmailValidator.isValidEmail(RegisterFrame.getInstance().getEmailTF().getText())) {
			JOptionPane.showMessageDialog(null, "Please enter a valid mail address.");
			return false;
		}else if(RegisterFrame.getInstance().getPasswordTF().getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Password field cannot be left empty.");
			return false;
		}else if(RegisterFrame.getInstance().getPasswordTF().getText().length() < 8) {
			JOptionPane.showMessageDialog(null, "Your password must consist of at least 8 characters");
			return false;
		}else return true;
	}
}