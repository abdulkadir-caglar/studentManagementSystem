package studentManagementSystem.view.admin;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import studentManagementSystem.view.admin.navbar.AdminNavBar;

public class AdminFrame extends JFrame {

	private JDesktopPane desktopPane;
	private AdminNavBar navBar;
	private JPanel contentPane;
	
	public AdminFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 498);
		contentPane = new JPanel(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		navBar = new AdminNavBar();
		navBar.setSize(786, 50);
		navBar.setLocation(0, 10);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 70, 786, 391);

		setContentPane(contentPane);
		contentPane.add(navBar);
		contentPane.add(desktopPane);
	}
}