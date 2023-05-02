/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;*/

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;

import java.awt.Font;
import java.awt.Color;

public class MyFrame extends JFrame /*implements ActionListener*/ {
    JButton button;
    JLabel label;

    MyFrame() {

        ImageIcon icon1 = new ImageIcon("mario.png");
        ImageIcon icon2 = new ImageIcon("relaxed.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(200,200,256,256);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(130,100,210,135);
        button.addActionListener(e ->  {
//            System.out.println("pee");
            button.setEnabled(false);
            label.setVisible(true);
        });
        button.setText("I'm a BUTTon");
        button.setFocusable(false);
        button.setIcon(icon1);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont( new Font("Comic Sans MS",Font.BOLD,14) );
        button.setIconTextGap(-35);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder( BorderFactory.createEtchedBorder() );
        // ...since >this< class is implementing ActionListener

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);

        this.add(button);
        this.add(label);
    }

//    @Override
//    public void actionPerformed(ActionEvent ev) {
//        if ( ev.getSource() == button ) {
//            System.out.println("pee");
//        }
//    }
}
