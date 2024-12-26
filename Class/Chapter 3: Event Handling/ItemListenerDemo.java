import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ItemListenerDemo implements ItemListener {
    static JCheckBox cb1,cb2,cb3,cb4;
    static JLabel l; 
    public static void main(String[] args) {
        JFrame f = new JFrame("Item Event Demo");

        JPanel p = new JPanel();
         cb1 = new JCheckBox("One");
         cb2 = new JCheckBox("Two");
         cb3 = new JCheckBox("Three");
         cb4 = new JCheckBox("Four");

        p.add(cb1);
        p.add(cb2);
        p.add(cb3);
        p.add(cb4);
        p.setLayout(new GridLayout(2,2));


        l = new JLabel();

        f.add(p);
        f.add(l);

        f.setSize(400,400);
        f.setLayout(new GridLayout(2,1));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        cb1.addItemListener(new ItemListenerDemo());
        cb2.addItemListener(new ItemListenerDemo());
        cb3.addItemListener(new ItemListenerDemo());
        cb4.addItemListener(new ItemListenerDemo());

    }
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        String selectedItem = "";
        if(cb1.isSelected()){
            selectedItem += cb1.getText() +" ";
        }
        if(cb2.isSelected()){
            selectedItem += cb2.getText() +" ";
        }
        if(cb3.isSelected()){
            selectedItem += cb3.getText() +" ";
        }
        if(cb4.isSelected()){
            selectedItem += cb4.getText() +" ";
        }
        l.setText("Selected Items: " + selectedItem);
    }
}
