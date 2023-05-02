package JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;

public class Main {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null,"deez nuts", "Eviction notice", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"deez nuts", "Eviction notice", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"deez nuts", "Eviction notice", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"deez nuts", "Eviction notice", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"deez nuts", "Eviction notice", JOptionPane.ERROR_MESSAGE);

//        int answer = JOptionPane.showConfirmDialog(null, "ooorgh...", "Milk Ape notice", JOptionPane.YES_NO_CANCEL_OPTION);
//        System.out.println(answer);
//        String name = JOptionPane.showInputDialog("What is your name?");
//        System.out.println("Hello " + name);

        String[] responses = {"No, you're balling", "Balls", "abababababaaaa~"};
        ImageIcon icon = new ImageIcon("jesus_pelota.gif");

        JOptionPane.showOptionDialog(null, "You are BALLING",
                "((secret message shhhh))", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon, responses, 2);
    }
}
