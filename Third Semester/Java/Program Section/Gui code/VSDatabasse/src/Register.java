import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Register {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Registration");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(50, 50, 100, 30);
        JTextField t1 = new JTextField(); // ✅ Use JTextField instead of JTextArea
        t1.setBounds(150, 50, 150, 30);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50, 100, 100, 30);
        JPasswordField t2 = new JPasswordField();
        t2.setBounds(150, 100, 150, 30);

        JButton b1 = new JButton("Register");
        b1.setBounds(120, 160, 120, 30);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);

        f.setVisible(true); // ✅ Keep after all components are added

        b1.addActionListener((ActionEvent e) -> {
            try {
                String user = t1.getText();
                String pass = new String(t2.getPassword());

                Class.forName("com.mysql.cj.jdbc.Driver");
                try (
                        Connection con = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/javamark", "root", "")) {
                    System.out.println("Connection successful ✅");
                    Statement st = con.createStatement();

                    // 🔐 Be sure the table 'register' exists with columns UserName, pass
                    String query = "INSERT INTO register(UserName, pass) VALUES ('" + user + "', '" + pass + "')";
                    st.executeUpdate(query);
                    System.out.println("Data inserted successfully ✅");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        });
    }
}
