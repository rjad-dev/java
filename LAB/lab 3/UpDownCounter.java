import java.awt.*;
import java.awt.event.*;

public class UpDownCounter {

    private int count = 5;

    public static void main(String[] args) {
        new UpDownCounter().createAndShowGUI();
    }

    private void createAndShowGUI() {
        Frame frame = new Frame("Counter");
        frame.setSize(500, 200);
        frame.setLayout(new FlowLayout());

        Label countLabel = new Label("Count");
        TextField countField = new TextField(10);
        countField.setText(String.valueOf(count));
        countField.setEditable(false);

        Button upButton = new Button("Up");
        Button downButton = new Button("Down");
        Button resetButton = new Button("Reset");

        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                countField.setText(String.valueOf(count));
            }
        });

        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count--;
                countField.setText(String.valueOf(count));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count = 5;
                countField.setText(String.valueOf(count));
            }
        });

        frame.add(countLabel);
        frame.add(countField);
        frame.add(upButton);
        frame.add(downButton);
        frame.add(resetButton);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}