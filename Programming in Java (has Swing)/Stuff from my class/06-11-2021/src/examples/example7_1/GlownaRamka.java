package examples.example7_1;

import javax.swing.*;
import java.awt.*;

public class GlownaRamka extends JFrame {

    private JTextArea textArea;
    private JButton button;

    public GlownaRamka() {
        super("Ramka główna");
        setSize(600, 400);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        button = new JButton("Click me!");

        add(textArea, BorderLayout.CENTER);
        add(button, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
