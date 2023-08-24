package pl.gocbar;

import java.awt.Frame;
import java.awt.GridLayout;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

public class LoginDialog extends JDialog {

	private JPanel loginPanel;
	private PersonManager dbmanager;
	private JButton loginButton;
	private JButton newUserButton;
	private JComboBox comboUser;
	private JLabel loginLabel;
	private JLabel passwordLabel;
	private JPasswordField passwordField;
	private JButton dropUserButton;
	private JButton finishButton;

	public LoginDialog() {

	}

	public LoginDialog(Frame parent, boolean modal, PersonManager dataBase) 
			throws IOException, SQLException {

		super(parent, modal);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Logowanie");
		setName("dialogLogowanie"); // NOI18N
		setResizable(true);
		setSize(150, 100);
		dbmanager = new PersonManager();
		this.createLoginPanel();
		loginButton.setEnabled(false);
		passwordField.setEnabled(false);
		this.dbmanager = dataBase;
		add(loginPanel);
		setVisible(true);
	}

	public void createLoginPanel() {
		loginPanel = new JPanel();
		loginLabel = new JLabel("Login: ");
		passwordLabel = new JLabel("Hasło: ");
		comboUser = new JComboBox();
		passwordField = new JPasswordField(15);
		loginButton = new JButton("Zaloguj się");
		newUserButton = new JButton("Załóż konto");
		dropUserButton = new JButton("Usuń");
		finishButton = new JButton("Zakończ");

		loginPanel.setBorder(BorderFactory.createTitledBorder("Panel logowania"));
		GridLayout grid = new GridLayout(4, 2);
		loginPanel.setLayout(grid);
		setBounds(200, 150, 260, 165);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Logowanie");
		setName("dialogLogowanie"); // NOI18N
		setResizable(true);

		loginPanel.add(loginLabel);
		loginPanel.add(comboUser);
		loginPanel.add(passwordLabel);
		loginPanel.add(passwordField);
		loginPanel.add(loginButton);
		loginPanel.add(newUserButton);
		loginPanel.add(finishButton);
		loginPanel.add(dropUserButton);
	}
}
