import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame Example");
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(50, 50, 100, 30);

        f.add(l1);
    }
}