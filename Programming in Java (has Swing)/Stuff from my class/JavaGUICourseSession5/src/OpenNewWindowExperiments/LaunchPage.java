package OpenNewWindowExperiments;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    LaunchPage() {
        myButton.setBounds(265,265,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(690,690);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == myButton ) {
            frame.dispose();
            new NewWindow();
        }
    }
}
