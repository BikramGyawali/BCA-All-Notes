package CustomFunction3D;

import package3D.BGhelperPackage3D;
import java.util.Scanner;

public class Scaling_FixedPoint3D_BgCustom {
	public double[][] BGScalingFixedPoint(double[][] BGOriginal, double Sx, double Sy, double Sz, double Xfixed,
			double Yfixed, double Zfixed) {
		double[][] BGTransformed = new double[8][3];

		for (int Bikram = 0; Bikram < 8; Bikram++) {
			double XTranslate = BGOriginal[Bikram][0] - Xfixed;
			double YTranslate = BGOriginal[Bikram][1] - Yfixed;
			double ZTranslate = BGOriginal[Bikram][2] - Zfixed;

			double XScale = XTranslate * Sx;
			double YScale = YTranslate * Sy;
			double ZScale = ZTranslate * Sz;

			BGTransformed[Bikram][0] = XScale + Xfixed;
			BGTransformed[Bikram][1] = YScale + Yfixed;
			BGTransformed[Bikram][2] = ZScale + Zfixed;
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

		System.out.print("Enter Selected Fixed Point X: ");
		double Xfixed = sa.nextDouble();

		System.out.print("Enter Selected Fixed Point Y: ");
		double Yfixed = sa.nextDouble();

		System.out.print("Enter Selected Fixed Point Z: ");
		double Zfixed = sa.nextDouble();

		double[][] BGOriginal = bg.getOriginalPoint();
		double[][] BGTransformed = BGScalingFixedPoint(BGOriginal, Sx, Sy, Sz, Xfixed, Yfixed, Zfixed);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame("3D Scaling With Fixed Point - Custom Function With Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new Scaling_FixedPoint3D_BgCustom().BGHehe();
	}
}