import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
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
        JButton b = new JButton("Submit");
        b.setBounds(170, 300, 100, 30);

        f.add(t);
        f.add(t1);
        f.add(b);
        f.add(l);
        f.add(l1);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaMark", "root", "");
                System.out.println("Connection successfull");
                Statement st = con.createStatement();
                String query = "Insert Into" + "result(id,mark)" + "values(10,10)";
                st.executeQuery(query);
            }
        });

    }
}