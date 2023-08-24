package example_5;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame {

	public CalculatorFrame() {
		
		ActiveCalculatorPanel panel = new ActiveCalculatorPanel();
		add(panel);
		pack();
	}
}
