import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("TextArea Demo");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(2, 1));

        Label titleLabel = new Label("Control in action: TextArea");

        Panel panel = new Panel();
        panel.setLayout(new FlowLayout()); 

        Label commentsLabel = new Label("Comments:");
        TextArea commentsArea = new TextArea("We are demonstrating TextArea", 5, 30);
        Button showButton = new Button("Show");

        panel.add(commentsLabel);
        panel.add(commentsArea);
        panel.add(showButton);


        frame.add(titleLabel);
        frame.add(panel);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
