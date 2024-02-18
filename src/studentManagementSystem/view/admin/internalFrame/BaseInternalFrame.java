package studentManagementSystem.view.admin.internalFrame;

import javax.swing.JInternalFrame;

public abstract class BaseInternalFrame extends JInternalFrame {

	public BaseInternalFrame() {
		setBounds(0, 0, 786, 391);
		setResizable(false);
		setMaximizable(false);
		setIconifiable(false);
		setClosable(false);
		getContentPane().setLayout(null);
	}
}