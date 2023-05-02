package Labels;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        // JLabels - a GUI display area for a string of text, an image, or both

        ImageIcon image = new ImageIcon("./assets/bestfriends.png");
        Border border = BorderFactory.createLineBorder(new Color(0xC493D3),5);

        JLabel label = new JLabel();
        label.setText("hop on among us bestie");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.MAGENTA);
        label.setFont(new Font("French Script MT",Font.ITALIC,72));
        label.setIconTextGap(-21);
        label.setBackground(Color.PINK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100,0,690,690);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(900,900);
//        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xFFAEFD));
        frame.setIconImage(new ImageIcon("/ass.png").getImage());
        frame.setVisible(true);
        frame.setResizable(true);
        frame.add(label);
        frame.pack();

        new Thread(() -> {
            try {
                Thread.sleep(21000);
                playSans();
                Thread.sleep(1000);
                frame.dispose();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    static void playSans() {
        try {
            AudioInputStream audioInputStream =
                    AudioSystem.getAudioInputStream( new File("./assets/snas.wav") );
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Error with playing sound.");
            e.printStackTrace();
        }
    }
}
