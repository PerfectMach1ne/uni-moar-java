package ProgressBar;

import javafx.scene.paint.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBarDemo() {
        bar.setValue(0);
        bar.setBounds(0,0,420,21);
        bar.setStringPainted(true);

        frame.add(bar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(421,421);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        for (int counter = 0; counter <= 100; counter += 4) {
            bar.setValue(counter);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        bar.setString("Done!");
    }
}
