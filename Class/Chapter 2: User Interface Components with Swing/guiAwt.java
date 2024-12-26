import java.awt.*;
import java.awt.event.*;

public class guiAwt {
    public static void main(String[] args) {
        Frame f = new Frame("AWT GUI");
        f.addWindowListener(new WindowAdapter() {
            
        });
        f.setSize(500, 500);
        f.setVisible(true);
        
    }
}
