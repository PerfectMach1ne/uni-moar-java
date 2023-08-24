package SwingStuff;

import javax.swing.*;

public class FrameThread {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainFrame();
            new TextPanel();
        });
    }
}
