import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumber {
    private static JTextField numberField, reverseField;

    static class ReverseActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String number = numberField.getText();
                StringBuilder reversed = new StringBuilder(number).reverse();
                reverseField.setText(reversed.toString());
            } catch (Exception ex) {
                reverseField.setText("Invalid input");
                JOptionPane.showMessageDialog(null,
                        "Please enter a valid number",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Reverse Number");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel numberLabel = new JLabel("Number");
        numberField = new JTextField();

        JLabel reverseLabel = new JLabel("Reverse");
        reverseField = new JTextField();
        reverseField.setEditable(false);

        JButton reverseButton = new JButton("Reverse");
        reverseButton.addActionListener(new ReverseActionListener());

        mainPanel.add(numberLabel);
        mainPanel.add(numberField);
        mainPanel.add(reverseLabel);
        mainPanel.add(reverseField);
        mainPanel.add(new JLabel(""));
        mainPanel.add(reverseButton);
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}