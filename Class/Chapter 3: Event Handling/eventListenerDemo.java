import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class eventListenerDemo implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Touch me");

        f.add(b);

        b.addActionListener(new eventListenerDemo());

        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
