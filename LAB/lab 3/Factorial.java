import java.awt.*;
import java.awt.event.*;

public class Factorial {
    private TextField inputField, resultField;
    private void calculateFactorial() {
        try {
            int number = Integer.parseInt(inputField.getText());
            if(number < 0) {
                resultField.setText("Invalid input");
                return;
            }
            
            long result = 1;
            for(int i = 1; i <= number; i++) {
                result *= i;
            }
            
            resultField.setText(String.valueOf(result));
        } catch(NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    private void createAndShowGUI(){
        Frame frame = new Frame("Factorial");
        frame.setSize(500, 200);
        frame.setLayout(new FlowLayout());

        Label numberLabel = new Label("Number");
        Label factorialLabel = new Label("Factorial");
        inputField = new TextField(10);
        resultField = new TextField(15);
        resultField.setEditable(false);
        Button calculateButton = new Button("Calculate");

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });

        frame.add(numberLabel);
        frame.add(inputField);
        frame.add(factorialLabel);
        frame.add(resultField);
        frame.add(calculateButton);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Factorial().createAndShowGUI();
    }    
}
