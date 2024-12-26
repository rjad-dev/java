import java.awt.*;
import java.awt.event.*;

public class TextDisplay {
    public static void main(String[] args) {
        Frame frame = new Frame("Display text");

        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        TextField inputField = new TextField(15);
        Button submitButton = new Button("Submit");
        Label outputLabel = new Label("                                             ");

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                outputLabel.setText(inputField.getText());
            }
        });

        frame.add(inputField);
        frame.add(submitButton);
        frame.add(outputLabel);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
