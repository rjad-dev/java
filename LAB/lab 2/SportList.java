import java.awt.*;
import java.awt.event.*;

public class SportList {
    public static void main(String[] args) {
        Frame frame = new Frame("List Demo");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        Label label = new Label("Choose sports");
        List sportList = new List(7, true);
        sportList.add("Footbal");
        sportList.add("Cricket");
        sportList.add("Hockey");
        sportList.add("Golf");
        sportList.add("Baseball");
        sportList.add("Badminton");
        sportList.add("Rugby");

        frame.add(label);
        frame.add(sportList);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
