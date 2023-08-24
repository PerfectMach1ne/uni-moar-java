package SwingStuff;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("FieldCanBeLocal")
public class MainFrame extends JFrame {
    final private JTextArea textArea;
    final private JButton button;

    public MainFrame() {
        super("Main frame");
        setSize(600, 400);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        button = new JButton("Click me!!!");

        button.addActionListener(event -> textArea.setText("Hellooo world!!!"));

        add(textArea, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
