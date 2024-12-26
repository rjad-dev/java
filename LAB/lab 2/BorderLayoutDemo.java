import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Demo");
        frame.setSize(400, 150);
        frame.setLayout(new BorderLayout());

        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");

        frame.add(b1, BorderLayout.NORTH);
        frame.add(b2, BorderLayout.SOUTH);
        frame.add(b3, BorderLayout.EAST);
        frame.add(b4, BorderLayout.WEST);
        frame.add(b5, BorderLayout.CENTER);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
