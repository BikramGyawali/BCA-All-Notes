package CustomFunction3D;
import package3D.BGhelperPackage3D;
import java.util.Scanner;

public class Translation3D_BgCustom {
    public double[][] BGTranslation(double[][] BGOriginal,double Tx,double Ty,double Tz) {
        double[][] BGTransformed=new double[8][3];

        for(int Bikram=0;Bikram<8;Bikram++) {
            BGTransformed[Bikram][0]=BGOriginal[Bikram][0]+Tx;
            BGTransformed[Bikram][1]=BGOriginal[Bikram][1]+Ty;
            BGTransformed[Bikram][2]=BGOriginal[Bikram][2]+Tz;
        }

        return BGTransformed;
    }

    public void BGHehe() {
        Scanner sa=new Scanner(System.in);
        BGhelperPackage3D bg=new BGhelperPackage3D();

        bg.inputCoordinate(sa);

        System.out.print("Enter Translation Along X-Axis: ");
        double Tx=sa.nextDouble();

        System.out.print("Enter Translation Along Y-Axis: ");
        double Ty=sa.nextDouble();

        System.out.print("Enter Translation Along Z-Axis: ");
        double Tz=sa.nextDouble();

        double[][] BGOriginal=bg.getOriginalPoint();
        double[][] BGTransformed=BGTranslation(BGOriginal,Tx,Ty,Tz);

        bg.showOriginalCoordinate(BGOriginal);
        bg.showTransformedCoordinate(BGTransformed);

        BGhelperPackage3D.CustomPanel3D AshliPanel=
            new BGhelperPackage3D.CustomPanel3D(BGOriginal,BGTransformed);

        BGhelperPackage3D.createFrame("3D Translation - Custom Function",AshliPanel);
    }

    public static void main(String[] args) {
        new Translation3D_BgCustom().BGHehe();
    }
}