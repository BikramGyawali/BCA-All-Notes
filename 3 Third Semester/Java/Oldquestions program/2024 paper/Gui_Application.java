import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Gui_Application {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration Form");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1 = new JLabel("Name");
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);
        JTextField t1 = new JTextField();
        t1.setBounds(120, 60, 200, 20);
        f.add(t1);
        JLabel l2 = new JLabel("Mobile");
        f.add(l2);
        l2.setBounds(50, 100, 100, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(120, 110, 200, 20);
        f.add(t2);
        JLabel l3 = new JLabel("Gender");
        l3.setBounds(50, 160, 100, 30);
        f.add(l3);
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(120, 160, 100, 30);
        r1.setSelected(true); // to set default selection
        f.add(r1);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(220, 160, 100, 30);
        f.add(r2);
        ButtonGroup bg = new ButtonGroup(); // to make only one radio button selected at a time
        bg.add(r1);
        bg.add(r2);
        JLabel l4 = new JLabel("Date of Birth");
        l4.setBounds(50, 210, 150, 30);
        f.add(l4);
        String day[] = new String[32];
        day[0] = "DD";
        for (int i = 1; i <= 31; i++) {
            day[i] = String.valueOf(i);
        }
        JComboBox<String> d = new JComboBox<>(day);
        d.setBounds(150, 210, 60, 30);
        f.add(d);

        // For month
        String month[] = { "MM", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

        JComboBox<String> m = new JComboBox<>(month);
        m.setBounds(230, 210, 80, 30);
        f.add(m);

        // For Year
        String year[] = new String[73];
        year[0] = "YYYY";
        int iyear = 1954;
        for (int i = 1; i < year.length; i++) {
            year[i] = String.valueOf(iyear++);
        }
        JComboBox<String> y = new JComboBox<>(year);
        y.setBounds(330, 210, 80, 30);
        f.add(y);
        JLabel l5 = new JLabel("Address");
        l5.setBounds(50, 260, 100, 30);
        f.add(l5);
        JTextArea t3 = new JTextArea();
        t3.setLineWrap(true);
        t3.setWrapStyleWord(true);
        t3.setBounds(150, 260, 500, 80);
        f.add(t3);
        JCheckBox c1 = new JCheckBox("Accept Terms and Conditions");
        c1.setBounds(150, 350, 250, 40);
        f.add(c1);
        JButton b1 = new JButton("Submit");
        b1.setBounds(150, 400, 100, 30);
        f.add(b1);

        // implementing the logic

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!c1.isSelected()) {
                    JOptionPane.showMessageDialog(f, "Please accept the terms and condition first");

                    return;
                }
                String name = t1.getText();
                String mobile = t2.getText();
                String gender = (r1.isSelected()) ? r1.getText() : r2.getText();
                String date = d.getSelectedItem().toString();
                String month = m.getSelectedItem().toString();
                String year = y.getSelectedItem().toString();
                String address = t3.getText();

                try {
                    File f1 = new File("exam.txt");
                    if (f1.createNewFile()) {
                        System.out.println("File is created");
                    } else {
                        System.out.println("File already exists");
                    }
                    FileWriter fw = new FileWriter("exam.txt");
                    fw.write("Name: " + name + " Mobile: " + mobile + " Gender: " + gender + " Date of Birth: " + date
                            + "-" + month + "-" + year + " Address: " + address);
                    fw.close();
                    JOptionPane.showMessageDialog(f, "Data saved Successfully");
                } catch (IOException ex) {
                    System.out.println("Error creating file: " + ex.getMessage());
                }
            }
        });
    }
}
