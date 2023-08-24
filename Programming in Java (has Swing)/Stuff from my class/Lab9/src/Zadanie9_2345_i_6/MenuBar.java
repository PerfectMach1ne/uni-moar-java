package Zadanie9_2345_i_6;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {
    MenuBar() {
        JMenu menuRevenues, menuExpenses;
        JMenuItem menuRevItem1, menuRevItem2, menuExpItem1, menuExpItem2;

        menuRevenues = new JMenu("Przychody");
        menuExpenses = new JMenu("Wydatki");

        menuRevItem1 = new JMenuItem("Otwórz PRZYCHODY");
        menuRevItem2 = new JMenuItem("ZAMKNIJ");
        menuExpItem1 = new JMenuItem("Otwórz WYDATKI");
        menuExpItem2 = new JMenuItem("ZAMKNIJ");

        menuRevenues.add(menuRevItem1);
        menuRevenues.add(menuRevItem2);
        menuExpenses.add(menuExpItem1);
        menuExpenses.add(menuExpItem2);

        add(menuRevenues);
        add(menuExpenses);

    }
}
