package pl.gocbar;

import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainFrame extends JFrame {

	private PersonManager personManager;
	private StartPanel startPanel;
	private LoginDialog loginDialog;
	private DBManager dbmanager;

	public MainFrame() throws IOException, SQLException {
		super("Gdzie wyciekają pieniążki ....");
		setSize(460, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		personManager = new PersonManager();
		startPanel = new StartPanel();
		loginDialog = new LoginDialog(this, true, (PersonManager) dbmanager);
		loginDialog.setLocationRelativeTo(this);
		add(startPanel);
		setVisible(true);
	}

	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			// SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("Nie potrafię wczytać systemowego wyglądu: " + e);
		}
	}
}
