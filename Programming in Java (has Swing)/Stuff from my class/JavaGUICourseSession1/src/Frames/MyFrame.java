package Frames;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;


public class MyFrame extends JFrame {
    MyFrame() {
        JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("I love boobs so much it's unreal"); //hj
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(469,421);
        frame.setVisible(true); //will make frame visible

        ImageIcon image = new ImageIcon(getClass().getClassLoader().getResource("assets/ass.png"));
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0xC493D3));
    }
}
