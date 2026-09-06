package packageLine;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class BGhelperPackageLine {
    public int Xa,Ya,Xb,Yb;

    public void inputCoordinate(Scanner sa) {
        System.out.println("Enter Start and End Coordinates:");
        System.out.print("Suru X Coordinate enter garnus hos: ");
        Xa=sa.nextInt();
        System.out.print("Suru Y Coordinate enter garnus hos: ");
        Ya=sa.nextInt();
        System.out.print("Antim X Coordinate enter garnus hos: ");
        Xb=sa.nextInt();
        System.out.print("Antim Y Coordinate enter garnus hos: ");
        Yb=sa.nextInt();
    }

    public void showCoordinate() {
        System.out.println("\nInput Coordinates:");
        System.out.println("Suru = ("+Xa+","+Ya+")");
        System.out.println("Antim = ("+Xb+","+Yb+")");
    }

    public static void createFrame(String BGTitle,JPanel AshliPanel) {
        JFrame BGF=new JFrame(BGTitle);
        BGF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BGF.setSize(750,550);
        BGF.setLocationRelativeTo(null);
        BGF.add(AshliPanel);
        BGF.setVisible(true);
    }

    public static class PointPanel extends JPanel {
        private int Xa,Ya,Xb,Yb;
        private int[][] BGPoints;
        private boolean BGLibrary;

        public PointPanel(int Xa,int Ya,int Xb,int Yb,int[][] BGPoints) {
            this.Xa=Xa;
            this.Ya=Ya;
            this.Xb=Xb;
            this.Yb=Yb;
            this.BGPoints=BGPoints;
            this.BGLibrary=false;
        }

        public PointPanel(int Xa,int Ya,int Xb,int Yb) {
            this.Xa=Xa;
            this.Ya=Ya;
            this.Xb=Xb;
            this.Yb=Yb;
            this.BGLibrary=true;
        }

        private int BGScreenX(int XCoordinate) {
            return getWidth()/2+XCoordinate*20;
        }

        private int BGScreenY(int YCoordinate) {
            return getHeight()/2-YCoordinate*20;
        }

        private void BGDrawAxes(Graphics2D g2) {
            int centerX=getWidth()/2;
            int centerY=getHeight()/2;
            g2.drawLine(0,centerY,getWidth(),centerY);
            g2.drawLine(centerX,0,centerX,getHeight());
            g2.drawString("X-Axis",getWidth()-60,centerY-8);
            g2.drawString("Y-Axis",centerX+8,25);
            g2.drawString("O(0,0)",centerX+8,centerY+18);
        }

        private void BGDrawCalculatedLine(Graphics2D g2) {
    int X1=BGScreenX(Xa);
    int Y1=BGScreenY(Ya);
    int X2=BGScreenX(Xb);
    int Y2=BGScreenY(Yb);
    g2.drawLine(X1,Y1,X2,Y2);
}

        private void BGDrawLibraryLine(Graphics2D g2) {
            int X1=BGScreenX(Xa);
            int Y1=BGScreenY(Ya);
            int X2=BGScreenX(Xb);
            int Y2=BGScreenY(Yb);
            g2.drawLine(X1,Y1,X2,Y2);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2=(Graphics2D)g;
            g2.setStroke(new BasicStroke(2));
            BGDrawAxes(g2);

            if(BGLibrary) {
                BGDrawLibraryLine(g2);
            } else {
                BGDrawCalculatedLine(g2);
            }

            int SX=BGScreenX(Xa);
            int SY=BGScreenY(Ya);
            int EX=BGScreenX(Xb);
            int EY=BGScreenY(Yb);

            g2.drawString("("+Xa+","+Ya+")",SX+8,SY+20);
			g2.drawString("("+Xb+","+Yb+")",EX+8,EY-10);
        }
    }
}