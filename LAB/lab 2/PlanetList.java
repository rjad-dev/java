import java.awt.*;
import java.awt.event.*;

public class PlanetList {
    public static void main(String[] args) {
        Frame frame = new Frame("List Demo");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        Label label = new Label("Choose the planet");
        List planetList = new List(9, false);
        planetList.add("Mercury");
        planetList.add("Venus");
        planetList.add("Earth");
        planetList.add("Mars");
        planetList.add("Jupiter");
        planetList.add("Saturn");
        planetList.add("Uranus");
        planetList.add("Neptune");
        planetList.add("Pluto");

        frame.add(label);
        frame.add(planetList);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
