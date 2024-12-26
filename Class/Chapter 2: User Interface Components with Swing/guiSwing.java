import javax.swing.*;

public class guiSwing{
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JLabel labelEmail = new JLabel("Email:");
        labelEmail.setBounds(120, 65, 100, 100);
        f.add(labelEmail);

        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(120, 85, 100, 100);
        f.add(labelPassword);

        JTextField textAreaEmail = new JTextField();
        textAreaEmail.setBounds(200, 100, 200, 25);
        f.add(textAreaEmail);

        JPasswordField textAreaPassword = new JPasswordField();
        textAreaPassword.setBounds(200, 120, 200, 25);
        f.add(textAreaPassword);

        JCheckBox checkBoxTermsAndConditions = new JCheckBox("I accept terms and conditions");
        checkBoxTermsAndConditions.setBounds(150, 150, 300, 50);
        f.add(checkBoxTermsAndConditions);

        JRadioButton radioButtonMaleGender = new JRadioButton("Male");
        radioButtonMaleGender.setBounds(150, 170, 100, 100);
        f.add(radioButtonMaleGender);

        JRadioButton radioButtonFemaleGender = new JRadioButton("Female");
        radioButtonFemaleGender.setBounds(200, 170, 100, 100);
        f.add(radioButtonFemaleGender);

        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(radioButtonMaleGender);
        genderButtonGroup.add(radioButtonFemaleGender);

        JButton buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(200, 250, 100, 50);
        f.add(buttonSubmit);

        f.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // others are DISPOSE_ON_CLOSE & DO_NOTHING_ON_CLOSE

        f.setSize(500, 500);

        f.setVisible(true);
    }
}