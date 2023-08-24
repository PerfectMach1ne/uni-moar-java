package Frames;

public class Main {
    public static void main(String[] args) {
        // JFrame - a GUI window to add components to
        // 2 different ways to create a frame
        // Ist :: Just create a JFrame instance and change all the
        // members and properties
        // IInd :: Use JFrame as a parent class to a child class
       /* JFrame frame = new JFrame(); //creates a frame
        frame.setTitle("I love boobs so much it's unreal"); //hj
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(469,421);
        frame.setVisible(true); //will make frame visible

        ImageIcon image = new ImageIcon("assets/ass.png");
        frame.setIconImage(image.getImage());
        //frame.getContentPane().setBackground(new Color(196,147,211));
        frame.getContentPane().setBackground(new Color(0xC493D3));*/

        //Frames.MyFrame myFrame = new Frames.MyFrame();    // <-- redundant if you won't use the name
        new MyFrame();
    }
}
