import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxAndRadioDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Checkbox and Radio Demo");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(8, 1));

        Label label = new Label("Choose program to enroll");

        Checkbox checkBoxC = new Checkbox("C");
        Checkbox checkBoxJava = new Checkbox("Java");
        Checkbox checkBoxHTML = new Checkbox("HTML");
        Checkbox checkBoxPHP = new Checkbox("PHP");

        Label radioLabel = new Label("Payment");

        CheckboxGroup paymentGroup = new CheckboxGroup();
        Checkbox radioButtonNow = new Checkbox("Now", paymentGroup, false);
        Checkbox radioButtonLater = new Checkbox("Later", paymentGroup, false);

        frame.add(label);
        frame.add(checkBoxC);
        frame.add(checkBoxJava);
        frame.add(checkBoxHTML);
        frame.add(checkBoxPHP);
        frame.add(radioLabel);
        frame.add(radioButtonNow);
        frame.add(radioButtonLater);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
