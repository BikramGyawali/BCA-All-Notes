import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// import java.awt.event.addActionListener;

public class swing {
    public static void main(String[] args) {

        // Starting the GUI
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(400, 400);
        JLabel j1 = new JLabel("Number one");
        j1.setBounds(100, 100, 80, 20);
        JTextArea t1 = new JTextArea();
        t1.setBounds(200, 100, 80, 20);
        JLabel j2 = new JLabel("Number two");
        j2.setBounds(100, 130, 80, 20);
        JTextArea t2 = new JTextArea();
        t2.setBounds(200, 130, 80, 20);
        JLabel j3 = new JLabel("Result");
        j3.setBounds(100, 160, 80, 20);
        JTextArea t3 = new JTextArea();
        t3.setBounds(200, 160, 80, 20);

        JButton b1 = new JButton("Add");
        b1.setBounds(140, 200, 80, 40);

        // Implementing the event handler

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                t3.setText("a  + b =" + c);
            }
        });
        // added the methds to the frame
        f.add(j1);
        f.add(j2);
        f.add(j3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(b1);
    }

}