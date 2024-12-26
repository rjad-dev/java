import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Armstrong {
    private static JTextField numberField;
    private static JLabel resultLabel;

    private static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    static class CheckActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int number = Integer.parseInt(numberField.getText());
                boolean isArmstrong = isArmstrong(number);
                resultLabel.setText(isArmstrong ? "It is Armstrong" : "Not Armstrong");
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");
                JOptionPane.showMessageDialog(null,
                        "Please enter a valid number",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Armstrong Checker");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel numberLabel = new JLabel("Number");
        numberField = new JTextField(10);
        JButton checkButton = new JButton("Check");
        resultLabel = new JLabel("");

        checkButton.addActionListener(new CheckActionListener());

        mainPanel.add(numberLabel);
        mainPanel.add(numberField);
        mainPanel.add(checkButton);
        mainPanel.add(resultLabel);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}