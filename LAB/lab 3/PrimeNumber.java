import javax.swing.*;
import java.awt.*;

public class PrimeNumber {
    private static JTextField numberField, resultField;

    private static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        if (number <= 3)
            return true;

        if (number % 2 == 0 || number % 3 == 0)
            return false;

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    private static void checkPrime() {
        try {
            int number = Integer.parseInt(numberField.getText());
            boolean prime = isPrime(number);
            resultField.setText(prime ? "Yes" : "No");
        } catch (NumberFormatException e) {
            resultField.setText("Invalid input");
            JOptionPane.showMessageDialog(null,
                    "Please enter a valid number",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Prime Number Test");
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel(new GridLayout(3, 2, 10, 10));
            mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            JLabel numberLabel = new JLabel("Number");
            numberField = new JTextField();

            JLabel primeLabel = new JLabel("Prime");
            resultField = new JTextField();
            resultField.setEditable(false);

            JButton checkButton = new JButton("Check");
            checkButton.addActionListener(e -> checkPrime());

            mainPanel.add(numberLabel);
            mainPanel.add(numberField);
            mainPanel.add(primeLabel);
            mainPanel.add(resultField);
            mainPanel.add(new JLabel(""));
            mainPanel.add(checkButton);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }
}