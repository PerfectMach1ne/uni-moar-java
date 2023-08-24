package Zadanie9_1;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridBagLayout;

public class MainFrame extends JFrame {
    /// ZADANIE 9.1
    MainFrame() {
        setTitle("Pojazdy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(500,200);

        JPanel panel = new JPanel();

        panel.setBackground(Color.decode("#c493d3"));
        panel.setLayout(new GridBagLayout());
        panel.setBounds(0,0,600,200);

        JLabel label = new JLabel("Typ pojazdu");
        JTextField textField = new JTextField(10);

        panel.add(label);
        panel.add(Box.createHorizontalStrut(10));   // Oddzielenie elementow
        panel.add(textField);

        add(panel);

        setVisible(true);
    }
}
