package CustomFunction3D;

import package3D.BGhelperPackage3D;
import java.util.Scanner;

public class Shearing_XAxis3D_BgCustom {
	public double[][] BGShearingX(double[][] BGOriginal, double b, double c) {
		double[][] BGTransformed = new double[8][3];

		for (int Bikram = 0; Bikram < 8; Bikram++) {
			double X = BGOriginal[Bikram][0];
			double Y = BGOriginal[Bikram][1];
			double Z = BGOriginal[Bikram][2];

			BGTransformed[Bikram][0] = X;
			BGTransformed[Bikram][1] = Y + b * X;
			BGTransformed[Bikram][2] = Z + c * X;
		}

		return BGTransformed;
	}

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage3D bg = new BGhelperPackage3D();

		bg.inputCoordinate(sa);

		System.out.print("Enter Y Shear Factor b: ");
		double b = sa.nextDouble();

		System.out.print("Enter Z Shear Factor c: ");
		double c = sa.nextDouble();

		double[][] BGOriginal = bg.getOriginalPoint();
		double[][] BGTransformed = BGShearingX(BGOriginal, b, c);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame("3D Shearing Along X-Axis - Custom Function With Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new Shearing_XAxis3D_BgCustom().BGHehe();
	}
}