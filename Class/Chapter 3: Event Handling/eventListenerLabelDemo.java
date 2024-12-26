import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class eventListenerLabelDemo implements MouseListener{
    static JLabel l;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        l = new JLabel("hello");
        f.add(l);
        f.addMouseListener(new eventListenerMouseDemo());

        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
        int x = e.getX();
        int y = e.getY();
        System.out.println("X: " + x + "Y: " + y);
        l.setText("X: " + x + "Y: " + y);

    }

    public void mousePressed(MouseEvent m) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent m) {
        System.out.println("Mouse Released");
    }

    public void mouseEntered(MouseEvent m) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent m) {
        System.out.println("Mouse Exited");
    }
}
