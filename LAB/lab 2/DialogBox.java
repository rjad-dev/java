import java.awt.*;

public class DialogBox extends Frame {

    public DialogBox() {
        setTitle("Dialog box");
        setSize(500, 300);
        setVisible(true);
        setLocation(300, 300);

        Dialog d = new Dialog(this, "This is dialog box", true);
        Label l = new Label("Modal Dialog", Label.CENTER);

        d.add(l);
        d.setSize(300, 200);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new DialogBox();
    }
}
