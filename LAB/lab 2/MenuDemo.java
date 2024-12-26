import java.awt.*;
import java.awt.event.*;

public class MenuDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Menu Demo");
        frame.setSize(500, 300);
        MenuBar mbar = new MenuBar();
        frame.setMenuBar(mbar);

        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu run = new Menu("Run");
        Menu source = new Menu("Source");
        Menu refactor = new Menu("Refactor");
        Menu navigate = new Menu("Navigate");
        Menu search = new Menu("Search");
        Menu project = new Menu("Project");
        Menu window = new Menu("Window");
        Menu help = new Menu("Help");

        mbar.add(file);
        mbar.add(edit);
        mbar.add(run);
        mbar.add(source);
        mbar.add(refactor);
        mbar.add(navigate);
        mbar.add(search);
        mbar.add(project);
        mbar.add(window);
        mbar.add(help);

        MenuItem openProject = new MenuItem("Open Project");
        MenuItem closeProject = new MenuItem("Close Project");
        MenuItem buildAll = new MenuItem("Build All");
        MenuItem buildProject = new MenuItem("Build Project");

        project.add(openProject);
        project.add(closeProject);
        project.add(buildAll);
        project.add(buildProject);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
