import java.awt.Color;

import javax.swing.*;

public class swingPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JPanel jp = new JPanel();
        jp.setBackground(Color.ORANGE);
        jp.setBounds(20, 20, 200, 200);

        JButton jb = new JButton("Submit");
        jb.setBounds(30, 30, 100, 100);

        jp.add(jb);
        f.add(jp);

        // f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // others are DISPOSE_ON_CLOSE & DO_NOTHING_ON_CLOSE
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
