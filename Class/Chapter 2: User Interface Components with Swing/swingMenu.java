import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class swingMenu {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu");


        JMenuBar menuBar = new JMenuBar();

        // Creating menus
        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        JMenu menuView = new JMenu("View");
        

        // Creating menu items
        // JMenuItem fileMenuItemOpen = new JMenuItem("Open", new ImageIcon("icons/share.png"));
        JMenuItem fileMenuItemOpen = new JMenuItem("Open");
        JMenuItem fileMenuItemSave = new JMenuItem("Save");
        JMenuItem fileMenuItemExit = new JMenuItem("Exit");

        //setAccelerator and addActionListener we will read in next chapter

        fileMenuItemExit.setAccelerator(KeyStroke.getKeyStroke("command E"));

        fileMenuItemExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        JMenuItem editMenuItemCut = new JMenuItem("Cut");
        JMenuItem editMenuItemCopy = new JMenuItem("Copy");
        JMenuItem editMenuItemPaste = new JMenuItem("Paste");

        JMenu viewMenuZoom = new JMenu("Zoom");
        JMenuItem viewMenuItemZoomIn = new JMenuItem("Zoom in");
        JMenuItem viewMenuItemZoomOut = new JMenuItem("Zoom out");

        //adding menu items to file menu
        menuFile.add(fileMenuItemOpen);
        menuFile.add(fileMenuItemSave);
        menuFile.add(fileMenuItemExit);

        menuEdit.add(editMenuItemCut);
        menuEdit.add(editMenuItemCopy);
        menuEdit.add(editMenuItemPaste);

        menuView.add(viewMenuZoom);
        viewMenuZoom.add(viewMenuItemZoomIn);
        viewMenuZoom.add(viewMenuItemZoomOut);
        
        //Adding menu to menu bar
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuView);

        //Adding menubar to frame
        f.setJMenuBar(menuBar);

        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // others are DISPOSE_ON_CLOSE & DO_NOTHING_ON_CLOSE
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
