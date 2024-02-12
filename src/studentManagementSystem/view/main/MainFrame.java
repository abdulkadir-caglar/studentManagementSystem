package studentManagementSystem.view.main;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblEmail;
	private JLabel lblPassword;
	private JTextField emailTF;
	private JTextField passwordTF;
	private JButton btnLogin;
	private JButton btnRegister;

	public MainFrame() {
		setTitle("Student Info");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridBagLayout());
		setContentPane(contentPane);
		
		lblEmail = new JLabel("Email");
		emailTF = new JTextField();
		lblPassword = new JLabel("Password");
		passwordTF = new JTextField();
		JPanel panel = new JPanel();
		
		Font labelFont = new Font("Arial", Font.BOLD, 14);
		lblEmail.setFont(labelFont);
		lblPassword.setFont(labelFont);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		
		emailTF.setColumns(20);
		passwordTF.setColumns(20);
		
        panel.setLayout(new GridLayout(8, 2, 5, 10));
		
        
		panel.add(lblEmail);
		panel.add(emailTF);
		panel.add(new JLabel());
		panel.add(lblPassword);
		panel.add(passwordTF);
		panel.add(new JLabel());
		
		btnLogin = new JButton("Log In");
		btnRegister = new JButton("Register");
		
		Font btnFont = new Font("Arial", Font.PLAIN, 12);
		btnLogin.setFont(btnFont);
		btnRegister.setFont(btnFont);
		
		panel.add(btnLogin);
		panel.add(btnRegister);
		
		contentPane.add(new JLabel());
		contentPane.add(panel);
	}

}
