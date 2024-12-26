import java.awt.*;
import java.awt.event.*;

public class ButtonDemo{
    public static void main(String[] args) {
        Frame frame = new Frame("Button Demo");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(2, 2));

        Button buttonOne = new Button("One");
        Button buttonTwo = new Button("2");
        Button buttonThree = new Button("Three");
        Button buttonFour = new Button("4");

        buttonTwo.setEnabled(false);
        buttonFour.setEnabled(false);

        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonFour);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
