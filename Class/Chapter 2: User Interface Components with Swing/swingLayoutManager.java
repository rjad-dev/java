import java.awt.*;
import javax.swing.*;

public class swingLayoutManager {
    public static void main(String[] args) {
        JFrame f = new JFrame("Layout manager");
        
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");
        JButton b6 = new JButton("Button 6");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
    
        // f.setLayout(new FlowLayout());
        f.setLayout(new GridLayout(2, 2));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // others are DISPOSE_ON_CLOSE & DO_NOTHING_ON_CLOSE
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
