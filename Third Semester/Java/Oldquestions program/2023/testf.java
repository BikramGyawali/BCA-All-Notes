import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class testf {
    public static void main(String[] args) {
        JFrame f = new JFrame("Internal Frame Example");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JInternalFrame i1 = new JInternalFrame("Internal Frame 1", true, true, true, true);
        i1.setSize(200, 200);
        i1.setLocation(20, 20);
// last 4 true means the internal frame is resizable, closable, maximizable, and iconifiable
        JInternalFrame i2 = new JInternalFrame("Internal Frame 2", true, true, true, true);
        i2.setSize(200, 200);
        i2.setLocation(50, 50);

        JDesktopPane d1 = new JDesktopPane();
        d1.setBounds(0, 0, 400, 400);
        d1.add(i1);
        d1.add(i2);
        f.add(d1);
        i1.setVisible(true);
        i2.setVisible(true);

    }
}
