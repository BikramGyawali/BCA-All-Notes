import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Database {
    public static void main(String[] args) {
        JFrame f = new JFrame("Database connection");
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200);
        JLabel l = new JLabel("ID");
        l.setBounds(100, 200, 20, 20);
        JTextField t = new JTextField();
        t.setBounds(200, 200, 100, 30);
        JLabel l1 = new JLabel("Marks in Java");
        l1.setBounds(100, 240, 100, 20);
        JTextField t1 = new JTextField();
        t1.setBounds(200, 240, 100, 30);
        f.add(t);
        f.add(t1);

        f.add(l);
        f.add(l1);
    }
}