import javax.swing.*;

public class jlist {
    public static void main(String[] args) {
        JFrame f = new JFrame("JList Example");

        String colors[] = {"red", "green", "bblue"};
        JList<String> list = new JList<>(colors);

        list.setBounds(20, 20, 200, 200);

        f.add(list);

        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // others are DISPOSE_ON_CLOSE & DO_NOTHING_ON_CLOSE
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
