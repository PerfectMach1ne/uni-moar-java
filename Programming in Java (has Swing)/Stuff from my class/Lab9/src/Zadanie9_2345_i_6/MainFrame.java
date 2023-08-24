package Zadanie9_2345_i_6;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
    private StartPanel startPanel = new StartPanel();
    private RevenuesPanel revenuesPanel = new RevenuesPanel();
    private ExpensesPanel expensesPanel = new ExpensesPanel();
    private MenuBar menuBar = new MenuBar();

    MainFrame() {
        setTitle("Pojazdy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,500);

        add(menuBar, BorderLayout.NORTH);
        add(startPanel, BorderLayout.EAST);
        add(revenuesPanel, BorderLayout.WEST);
        add(expensesPanel, BorderLayout.CENTER);

        setVisible(true);
    }

}
