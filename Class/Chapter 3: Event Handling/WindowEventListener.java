import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowEventListener extends WindowAdapter {  // with 'extends' and 'adapter class' only required method can be implemented
    static JCheckBox cb1,cb2,cb3,cb4;
    static JLabel l; 
    public static void main(String[] args) {
        JFrame f = new JFrame("Window Event Demo");

        f.setSize(400,400);
        f.setLayout(new GridLayout(2,1));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        f.addWindowListener(new WindowEventListener());
    }
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }
}
