package CustomFunction3D;
import package3D.BGhelperPackage3D;
import java.util.Scanner;

public class Shearing_ZAxis3D_BgCustom {
	public double[][] BGShearingZ(double[][] BGOriginal, double a, double b) {
		double[][] BGTransformed = new double[8][3];

		for (int Bikram = 0; Bikram < 8; Bikram++) {
			double X = BGOriginal[Bikram][0];
			double Y = BGOriginal[Bikram][1];
			double Z = BGOriginal[Bikram][2];

			BGTransformed[Bikram][0] = X + a * Z;
			BGTransformed[Bikram][1] = Y + b * Z;
			BGTransformed[Bikram][2] = Z;
		}
		return BGTransformed;
	}

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage3D bg = new BGhelperPackage3D();

		bg.inputCoordinate(sa);

		System.out.print("Enter X Shear Factor a: ");
		double a = sa.nextDouble();

		System.out.print("Enter Y Shear Factor b: ");
		double b = sa.nextDouble();

		double[][] BGOriginal = bg.getOriginalPoint();
		double[][] BGTransformed = BGShearingZ(BGOriginal, a, b);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame("3D Shearing Along Z-Axis - Custom Function", AshliPanel);
	}

	public static void main(String[] args) {
		new Shearing_ZAxis3D_BgCustom().BGHehe();
	}
}