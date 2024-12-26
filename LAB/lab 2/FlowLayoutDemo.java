import java.awt.*;
import java.awt.event.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Demo");
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");
        Button b4 = new Button("b4");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
