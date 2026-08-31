package CustomFunction3D;

import package3D.BGhelperPackage3D;
import java.util.Scanner;

public class Scaling_Origin3D_BgCustom {
	public double[][] BGScaling(double[][] BGOriginal, double Sx, double Sy, double Sz) {
		double[][] BGTransformed = new double[8][3];

		for (int Bikram = 0; Bikram < 8; Bikram++) {
			BGTransformed[Bikram][0] = BGOriginal[Bikram][0] * Sx;
			BGTransformed[Bikram][1] = BGOriginal[Bikram][1] * Sy;
			BGTransformed[Bikram][2] = BGOriginal[Bikram][2] * Sz;
		}

		return BGTransformed;
	}

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage3D bg = new BGhelperPackage3D();

		bg.inputCoordinate(sa);

		System.out.print("Enter Scaling Factor Along X-Axis: ");
		double Sx = sa.nextDouble();

		System.out.print("Enter Scaling Factor Along Y-Axis: ");
		double Sy = sa.nextDouble();

		System.out.print("Enter Scaling Factor Along Z-Axis: ");
		double Sz = sa.nextDouble();

		double[][] BGOriginal = bg.getOriginalPoint();
		double[][] BGTransformed = BGScaling(BGOriginal, Sx, Sy, Sz);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame("3D Scaling About Origin - Custom Function With Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new Scaling_Origin3D_BgCustom().BGHehe();
	}
}