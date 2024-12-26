import java.awt.*;
import java.awt.event.*;

import javax.swing.GroupLayout;

public class GroupLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Demo");
        frame.setSize(400, 150);

        Panel p = new Panel();
        GroupLayout l = new GroupLayout(p);
        p.setLayout(l);
        p.setBackground(Color.RED);
        frame.add(p);

        l.setAutoCreateGaps(true);
        l.setAutoCreateContainerGaps(true);

        Button b1 = new Button("B1");
        Button b2 = new Button("B2");
        Button b3 = new Button("B3");
        Button b4 = new Button("b4");

        l.setHorizontalGroup(l.createSequentialGroup().addComponent(b1).addComponent(b2).addGroup(l.createParallelGroup().addComponent(b3).addComponent(b4)));
        l.setVerticalGroup(l.createSequentialGroup().addGroup(l.createParallelGroup().addComponent(b1).addComponent(b2).addComponent(b3).addComponent(b4)));

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
