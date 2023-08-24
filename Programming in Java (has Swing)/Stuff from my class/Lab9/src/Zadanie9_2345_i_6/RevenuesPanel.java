package Zadanie9_2345_i_6;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;

public class RevenuesPanel extends JPanel {
    RevenuesPanel() {
        FlowLayout layoutManager = new FlowLayout();
        setLayout(layoutManager);
        setBorder(new TitledBorder("Przychody"));

        JTextField textField = new JTextField(20);

        add(Box.createHorizontalStrut(10));
        add(textField);
        add(Box.createHorizontalStrut(10));

        setVisible(true);
    }
}
