import java.awt.*;
import java.awt.event.*;

public class SimpleInterest {
    private static TextField principalField, rateField, timeField;
    private static Label resultLabel;

    private static void calculateInterest() {
        try {
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double time = Double.parseDouble(timeField.getText());
            
            double interest = (principal * rate * time) / 100;
            resultLabel.setText(String.format("%.2f", interest));
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }
    public static void main(String[] args) {
        Frame frame  = new Frame("Simple Interest Calculator");
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        Label principalLabel = new Label("Principal Amount:");
        principalField = new TextField();
        
        Label rateLabel = new Label("Rate (%):");
        rateField = new TextField();
        
        Label timeLabel = new Label("Time (years):");
        timeField = new TextField();
        
        Label resultTextLabel = new Label("Simple Interest:");
        resultLabel = new Label("");

        Button calculateButton = new Button("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateInterest();
            }
        });

        frame.add(principalLabel);
        frame.add(principalField);
        frame.add(rateLabel);
        frame.add(rateField);
        frame.add(timeLabel);
        frame.add(timeField);
        frame.add(resultTextLabel);
        frame.add(resultLabel);
        frame.add(new Label("")); // Empty label for spacing
        frame.add(calculateButton);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
