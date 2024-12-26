import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LanguageDropdownDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("CheckBox Demo");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        Label label = new Label("Which language you like most?");
        Choice languageChoice = new Choice();
        languageChoice.add("C");
        languageChoice.add("Java");
        languageChoice.add("Python");
        languageChoice.add("C++");
        languageChoice.add("Dot Net");

        languageChoice.select(languageChoice.getItemCount() - 1);

        Label numberOfItemsLabel = new Label("\nNumber of items: "+languageChoice.getItemCount());
        Label selectedItemLabel = new Label("\nSelected item: "+languageChoice.getSelectedItem());

        frame.add(label);
        frame.add(languageChoice);
        frame.add(numberOfItemsLabel);
        frame.add(selectedItemLabel);

        System.out.println("Number of items: " + languageChoice.getItemCount());
        System.out.println("Currently selected item: " + languageChoice.getSelectedItem());

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
