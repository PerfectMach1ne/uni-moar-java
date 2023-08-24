package CwiczeniaLab2.TwoEight;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame {
    public CalculatorFrame() {
        ActiveCalculatorPanel panel = new ActiveCalculatorPanel();
        add(panel);
        pack();
    }
}
