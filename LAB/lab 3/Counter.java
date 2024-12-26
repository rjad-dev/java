import java.awt.*;
import java.awt.event.*;

public class Counter {
    public static void main(String[] args) {
        Frame frame = new Frame("Counter");
        frame.setSize(500, 200);
        frame.setLayout(new FlowLayout());

        Label instructLabel = new Label("Enter an integer");
        TextField tf = new TextField(15);
        Button b = new Button("Count Down");
        Label resultLabel = new Label("                         ");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(tf.getText());
                    StringBuilder result = new StringBuilder();

                    for (int i = number; i >= 0; i--) {
                        result.append(i);
                        if (i > 0) {
                            result.append(", ");
                        }
                    }

                    resultLabel.setText(result.toString());
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid integer");
                }
            }
        });

        frame.add(instructLabel);
        frame.add(tf);
        frame.add(b);
        frame.add(resultLabel);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
