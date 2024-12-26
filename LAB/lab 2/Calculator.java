import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        Frame frame = new Frame("Button Demo");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2));

        Label firstNumberLabel = new Label("First Number");
        TextField firstNumbTextField = new TextField();

        Label secondNumberLabel = new Label("Second Number");
        TextField secondNumbTextField = new TextField();

        Label resultNumberLabel = new Label("Result");
        TextField resultNumbTextField = new TextField();

        Button addButton = new Button("+");
        Button subtractButton = new Button("-");

        frame.add(firstNumberLabel);
        frame.add(firstNumbTextField);
        frame.add(secondNumberLabel);
        frame.add(secondNumbTextField);
        frame.add(resultNumberLabel);
        frame.add(resultNumbTextField);
        frame.add(addButton);
        frame.add(subtractButton);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
