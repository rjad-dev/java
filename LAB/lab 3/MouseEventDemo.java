import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo implements MouseListener {
    private static JLabel titleLabel, clickLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java MouseEvent Demo");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleLabel = new JLabel("Welcome to MouseEvent Demo", JLabel.CENTER);
        titleLabel.setBounds(100, 100, 200, 30);
        titleLabel.setOpaque(true);
        titleLabel.setBackground(Color.MAGENTA);
        frame.add(titleLabel);

        clickLabel = new JLabel("", JLabel.CENTER);
        clickLabel.setBounds(100, 200, 200, 30);
        frame.add(clickLabel);

        MouseEventDemo demo = new MouseEventDemo();
        frame.getContentPane().addMouseListener(demo);

        frame.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        clickLabel.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}