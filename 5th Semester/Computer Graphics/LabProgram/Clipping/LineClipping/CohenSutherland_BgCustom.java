package LineClipping;
import packageClipping.BGhelperPackageClipping;
import java.util.Scanner;

public class CohenSutherland_BgCustom {
    private final int INSIDE=0;
    private final int LEFT=1;
    private final int RIGHT=2;
    private final int BOTTOM=4;
    private final int TOP=8;
    public int BGRegionCode(double x,double y,double xmin,double ymin,double xmax,double ymax) {
        int bikram=INSIDE;
        if(x<xmin) bikram|=LEFT;
        else if(x>xmax) bikram|=RIGHT;
        if(y<ymin) bikram|=BOTTOM;
        else if(y>ymax) bikram|=TOP;
        return bikram;
    }

    public double[] BGCohenSutherland(double Xa,double Ya,double Xb,double Yb,double xmin,double ymin,double xmax,double ymax) {
        int Suru=BGRegionCode(Xa,Ya,xmin,ymin,xmax,ymax);
        int Antim=BGRegionCode(Xb,Yb,xmin,ymin,xmax,ymax);
        while(true) {
            if((Suru|Antim)==0) return new double[]{Xa,Ya,Xb,Yb};
            if((Suru&Antim)!=0) return null;
            double x,y;
            int plapa=(Suru!=0)?Suru:Antim;
            if((plapa&TOP)!=0) {
                x=Xa+(Xb-Xa)*(ymax-Ya)/(Yb-Ya);
                y=ymax;
            } else if((plapa&BOTTOM)!=0) {
                x=Xa+(Xb-Xa)*(ymin-Ya)/(Yb-Ya);
                y=ymin;
            } else if((plapa&RIGHT)!=0) {
                y=Ya+(Yb-Ya)*(xmax-Xa)/(Xb-Xa);
                x=xmax;
            } else {
                y=Ya+(Yb-Ya)*(xmin-Xa)/(Xb-Xa);
                x=xmin;
            }
            if(plapa==Suru) {
                Xa=x;
                Ya=y;
                Suru=BGRegionCode(Xa,Ya,xmin,ymin,xmax,ymax);
            } else {
                Xb=x;
                Yb=y;
                Antim=BGRegionCode(Xb,Yb,xmin,ymin,xmax,ymax);
            }
        }
    }
    public void BGHehe() {
        Scanner sa=new Scanner(System.in);
        BGhelperPackageClipping bg=new BGhelperPackageClipping();
        bg.inputWindow(sa);
        bg.inputLine(sa);
        int bikramG=BGRegionCode(bg.Xa,bg.Ya,bg.xmin,bg.ymin,bg.xmax,bg.ymax);
        int gyawaliB=BGRegionCode(bg.Xb,bg.Yb,bg.xmin,bg.ymin,bg.xmax,bg.ymax);
        System.out.println("\nCohen-Sutherland Region Codes:");
        System.out.println("Suru Code = "+bikramG);
        System.out.println("Antim Code = "+gyawaliB);
        double[] butwal=BGCohenSutherland(bg.Xa,bg.Ya,bg.Xb,bg.Yb,bg.xmin,bg.ymin,bg.xmax,bg.ymax);
        if(butwal==null) {
            System.out.println("Line is REJECTED.");
        } else {
            System.out.println("\nClipped Line Points:");
            System.out.println("Suru = ("+butwal[0]+","+butwal[1]+")");
            System.out.println("Antim = ("+butwal[2]+","+butwal[3]+")");
            System.out.println("Line is ACCEPTED.");
        }
        BGhelperPackageClipping.LinePanel AshliPanel=new BGhelperPackageClipping.LinePanel(bg.xmin,bg.ymin,bg.xmax,bg.ymax,bg.Xa,bg.Ya,bg.Xb,bg.Yb,butwal);
        BGhelperPackageClipping.createFrame("Cohen-Sutherland Line Clipping - Custom Function",AshliPanel);
    }
    public static void main(String[] args) {
        new CohenSutherland_BgCustom().BGHehe();
    }
}