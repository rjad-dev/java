import java.awt.*;
import java.awt.event.*;

public class ColorChanger {
    public static void main(String[] args) {
        Frame frame = new Frame("Color changer");

        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());

        Button redButton = new Button("RED");
        Button greenButton = new Button("GREEN");
        Button blueButton = new Button("BLUE");
        Button closeButton = new Button("CLOSE");

        Panel colorPanel = new Panel();
        colorPanel.setBackground(Color.red);

        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.red);
            }
        });
        
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.green);
            }
        });
        
        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                colorPanel.setBackground(Color.blue);
            }
        });
        
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(closeButton);
        
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(colorPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
