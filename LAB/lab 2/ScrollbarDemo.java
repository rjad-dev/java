import java.awt.*;
import java.awt.event.*;

public class ScrollbarDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Vertical and Horizontal Scrollbar Demo");
        frame.setSize(400, 300);
        frame.setLayout(null);

        Label verticalLabel = new Label("Vertical Scroll");
        verticalLabel.setBounds(50, 30, 200, 30);
        frame.add(verticalLabel);

        Scrollbar verticalScrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 20, 0, 100);
        verticalScrollbar.setBounds(50, 50, 20, 200);
        frame.add(verticalScrollbar);

        Label horizontalLabel = new Label("Horizontal Scroll");
        horizontalLabel.setBounds(50, 250, 200, 30);
        frame.add(horizontalLabel);

        Scrollbar horizontalScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 100);
        horizontalScrollbar.setBounds(50, 220, 300, 20);
        frame.add(horizontalScrollbar);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
