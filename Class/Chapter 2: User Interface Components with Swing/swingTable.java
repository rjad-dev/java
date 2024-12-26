import javax.swing.*;

public class swingTable {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        String data[][] = {
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"},
            {"1", "Ram", "Nowhere"},
            {"2", "Haram", "Chinchpokle"}

        };
        String heading[] = {"id", "name", "address"};
        JTable swingTable = new JTable(data, heading);

        JScrollPane jsp = new JScrollPane(swingTable);
        f.add(jsp);



        // f.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // others are DISPOSE_ON_CLOSE & DO_NOTHING_ON_CLOSE

        f.setSize(500, 500);

        f.setVisible(true);
    }
}
