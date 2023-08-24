package Zadanie3_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextArea textArea;
    private JButton button;

    public MainFrame() {
        super("Ramka glowna");
        setSize(800, 600);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        /**
         * @ConstructorProperties({"text"})
         *     public JButton(String text) {
         *         this(text, null);
         *     }                                */
        button = new JButton("Click me !!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("Hello world!");
            }
        });

        add(textArea, BorderLayout.PAGE_START);
        add(button, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
