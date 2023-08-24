package pl.gocbar;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.TitledBorder;

public class StartPanel extends JPanel  {

	private BufferedImage image;
	private Timer timer;
	private final static int ONE_SECOND = 4000;

	public StartPanel() throws IOException {
		FlowLayout manager = new FlowLayout();
		setLayout(manager);
		setBorder(new TitledBorder("Panel powitalny"));
		image = ImageIO.read(new File("images/swinka.jpg"));		
		// Create a timer.
//				timer = new Timer(ONE_SECOND, new ActionListener() {
//					public void actionPerformed(ActionEvent evt) {
//						setVisible(false);
//					}
//				});
//		timer.setRepeats(false);
//		timer.start();
		setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this); 
	}
}
