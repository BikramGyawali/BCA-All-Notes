import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.lang.classfile.constantpool.IntegerEntry;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) {
        JFrame f = new JFrame("Database connection");
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 500); // Increased size to fit all components

        JLabel l = new JLabel("ID");
        l.setBounds(100, 200, 100, 20);
        JTextField t = new JTextField();
        t.setBounds(200, 200, 100, 30);

        JLabel l1 = new JLabel("Marks in Java");
        l1.setBounds(100, 240, 100, 20);
        JTextField t1 = new JTextField();
        t1.setBounds(200, 240, 100, 30);

        JButton b = new JButton("Submit");
        b.setBounds(170, 300, 100, 30);

        f.add(t);
        f.add(t1);
        f.add(b);
        f.add(l);
        f.add(l1);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(t.getText());
                    // String mark = t1.getText();
                    int mark= Integer.parseInt(t1.getText());

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javamark", "root", "");
                    System.out.println("Connection successful");

                    Statement st = con.createStatement();
                    String query = "INSERT INTO result (id, mark) VALUES ('" + id + "', '" + mark + "')";
                    st.execute(query);

                    System.out.println("Data inserted successfully");
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        });
    }
}
