package ComboBoxes;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        comboBox.setSelectedIndex(2);

//        comboBox.setEditable(true);
        System.out.println(comboBox.getItemCount());

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource() == comboBox ) {
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
