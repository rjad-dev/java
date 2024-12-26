import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class eventListenerMouseDemo implements MouseListener{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.addMouseListener(new eventListenerMouseDemo());

        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent m) {
        System.out.println("Mouse Clicked");
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
