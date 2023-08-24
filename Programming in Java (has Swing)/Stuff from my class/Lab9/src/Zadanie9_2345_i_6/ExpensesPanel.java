package Zadanie9_2345_i_6;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;

public class ExpensesPanel extends JPanel {
    ExpensesPanel() {
        FlowLayout layoutManager = new FlowLayout();
        setLayout(layoutManager);
        setBorder(new TitledBorder("Wydatki"));

        JTextField textField = new JTextField(20);

        add(Box.createHorizontalStrut(10));
        add(textField);
        add(Box.createHorizontalStrut(10));

        setVisible(true);
    }
}