import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyListenerDemo implements KeyListener{
    static JLabel l;
    static JTextField t;
    public static void main(String[] args) {
        JFrame f = new JFrame();
        t = new JTextField(10);
        l = new JLabel();
        f.add(l);
        f.add(t);

        t.addKeyListener(new KeyListenerDemo());

        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // others are DISPOSE_ON_CLOSE & DO_NOTHING_ON_CLOSE
        f.setSize(500, 500);
        f.setVisible(true);

    }

    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed");
        l.setText(t.getText());
    }
}
