import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;


class GuiFact {
    public static void main(String[] args){
JFrame f= new JFrame("Factorail");
f.setLayout(null);
f.setSize(400,400);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JTextField t1= new JTextField();
 t1.setBounds(50,100,100,30);
 f.add(t1);

 JLabel l= new JLabel();
l.setBounds(50,150,100,30);
f.add(l);

JButton b = new JButton("Result");
b.setBounds(50,200,100,30);
f.add(b);


b.addMouseListener(new MouseAdapter(){
public void mousePressed(MouseEvent e){
    try{
        int n= Integer.parseInt(t1.getText());
        int fac=1;
        for(int i=1;i<n;i++){
            fac*=i;
        }

        l.setText("Fact     "  + fac);

        JOptionPane.showMessageDialog(f,"The factorial is " +n+ " is  "+fac); // to show message in dialog
    }
    catch(NumberFormatException ex){
        l.setText("Invalid number");
    }
}

 public void  mouseReleased(MouseEvent e){
    try{
 
int n = Integer.parseInt(t1.getText());
int r= n*n*n;
l.setText("Cube   "+  r);
JOptionPane.showMessageDialog(f,"The cube of "+n+ " is " +r);
    }
catch(NumberFormatException ex){
l.setText("Not in format");
}

}
});
 }
}