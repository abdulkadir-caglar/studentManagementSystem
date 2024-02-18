package studentManagementSystem.view.register;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import studentManagementSystem.viewController.RegisterFrameController;

public class RegisterFrame extends JFrame {

	private static RegisterFrame instance;
	
	private JPanel contentPane;
	private JPanel panel;
	
	private JLabel lblName;
	private JLabel lblSurname;
	private JLabel lblEmail;
	private JLabel lblPassword;
	
	private JTextField nameTF;
	private JTextField surnameTF;
	private JTextField emailTF;
	private JPasswordField passwordTF;
	
	private JButton btnRegister;
	private JButton btnLogin;
	
	public static RegisterFrame getInstance() {
		if(instance == null) {
			instance = new RegisterFrame();
		}return instance;
	}
	
	public RegisterFrame() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridBagLayout());
		setContentPane(contentPane);
		panel = new JPanel(new GridLayout(14, 2, 5, 10));
		contentPane.add(panel);
		
		Font lblFont = new Font("Arial", Font.BOLD, 14);
		
		lblName = new JLabel("Name");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(lblFont);
		panel.add(lblName);
		
		nameTF = new JTextField();
		nameTF.setColumns(20);
		panel.add(nameTF);
		
		panel.add(new JLabel());
		
		lblSurname = new JLabel("Surname");
		lblSurname.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurname.setFont(lblFont);
		panel.add(lblSurname);
		
		surnameTF = new JTextField();
		surnameTF.setColumns(20);
		panel.add(surnameTF);
		
		panel.add(new JLabel());
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(lblFont);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblEmail);
		
		emailTF = new JTextField();
		emailTF.setColumns(20);
		panel.add(emailTF);
		
		panel.add(new JLabel());
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(lblFont);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblPassword);
		
		passwordTF = new JPasswordField();
		passwordTF.setColumns(20);
		panel.add(passwordTF);
		
		panel.add(new JLabel());
		
		Font font = new Font("Arial", Font.PLAIN, 12);
		btnRegister = new JButton("Register");
		btnRegister.setFont(font);
		btnRegister.addActionListener(new RegisterFrameController());
		panel.add(btnRegister);
		
		btnLogin = new JButton("Log In");
		btnLogin.setFont(font);
		panel.add(btnLogin);
	}

	public JTextField getNameTF() {
		return nameTF;
	}

	public JTextField getSurnameTF() {
		return surnameTF;
	}

	public JTextField getEmailTF() {
		return emailTF;
	}

	public JTextField getPasswordTF() {
		return passwordTF;
	}
	
	public JButton getBtnRegister() {
		return btnRegister;
	}
}