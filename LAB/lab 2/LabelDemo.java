import java.awt.*;
import java.awt.event.*;

public class LabelDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Label Demo");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 2));

        Label nameLabel = new Label("Full Name");
        Label addressLabel = new Label("Address");

        TextField nameField = new TextField();
        TextField addressField = new TextField();

        Button okButton = new Button("Ok");
        Button cancelButton = new Button("Cancel");

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(okButton);
        frame.add(cancelButton);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }
}
