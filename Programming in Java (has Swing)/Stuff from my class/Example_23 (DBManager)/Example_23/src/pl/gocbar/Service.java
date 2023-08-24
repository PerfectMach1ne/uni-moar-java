package pl.gocbar;

import java.io.IOException;
import java.sql.SQLException;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Service {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				try {
					MainFrame mainFrame = new MainFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
