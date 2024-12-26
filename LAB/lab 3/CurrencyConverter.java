import java.awt.*;
import java.awt.event.*;

public class CurrencyConverter {
    private static TextField nepaleseField, euroField;

    public static void main(String[] args) {
        Frame frame = new Frame("Factorial");
        frame.setSize(500, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        Label dollarLabel = new Label("Dollar");

        TextField dollarField = new TextField();

        dollarField.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                if (!dollarField.getText().isEmpty()) {
                    try {
                        double dollar = Double.parseDouble(dollarField.getText());
                        nepaleseField.setText(String.format("%.2f", dollar * 135.96));
                        euroField.setText(String.format("%.2f", dollar * 0.96));
                    } catch (NumberFormatException ex) {
                        nepaleseField.setText("Invalid input");
                        euroField.setText("Invalid input");
                    }
                }
            }
        });

        Label nepaleseLabel = new Label("Nepalese");
        nepaleseField = new TextField();
        nepaleseField.setEditable(false);

        Label euroLabel = new Label("Euro");
        euroField = new TextField();
        euroField.setEditable(false);

        frame.add(dollarLabel);
        frame.add(dollarField);
        frame.add(nepaleseLabel);
        frame.add(nepaleseField);
        frame.add(euroLabel);
        frame.add(euroField);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
