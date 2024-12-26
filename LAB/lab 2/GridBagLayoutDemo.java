import java.awt.*;
import java.awt.event.*;

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("FlowLayout Demo");
        frame.setSize(400, 150);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        Button b1 = new Button("B1");
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.weightx = 0.5;
        gbc.weighty = 0.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(b1, gbc);

        Button b2 = new Button("B2");
        gbc.gridx = 1;
        frame.add(b2, gbc);

        Button b3 = new Button("B3");
        gbc.gridx = 2;
        frame.add(b3, gbc);

        Button b4 = new Button("b4");
        gbc.ipady = 40;
        gbc.gridwidth = 3;
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(b4, gbc);

        Button b5 = new Button("b5");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipady = 20;
        gbc.gridwidth = 2;
        frame.add(b5, gbc);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
