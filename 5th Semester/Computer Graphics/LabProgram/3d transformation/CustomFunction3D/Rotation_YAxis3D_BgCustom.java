package CustomFunction3D;

import package3D.BGhelperPackage3D;
import java.util.Scanner;

public class Rotation_YAxis3D_BgCustom {
	public double[][] BGRotationY(double[][] BGOriginal, double BGAngle) {
		double[][] BGTransformed = new double[8][3];
		double BGRadian = Math.toRadians(BGAngle);

		for (int Bikram = 0; Bikram < 8; Bikram++) {
			double X = BGOriginal[Bikram][0];
			double Y = BGOriginal[Bikram][1];
			double Z = BGOriginal[Bikram][2];

			BGTransformed[Bikram][0] = X * Math.cos(BGRadian) + Z * Math.sin(BGRadian);
			BGTransformed[Bikram][1] = Y;
			BGTransformed[Bikram][2] = -X * Math.sin(BGRadian) + Z * Math.cos(BGRadian);
		}

		return BGTransformed;
	}

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage3D bg = new BGhelperPackage3D();

		bg.inputCoordinate(sa);

		System.out.print("Enter Rotation Angle in Degree: ");
		double BGAngle = sa.nextDouble();

		double[][] BGOriginal = bg.getOriginalPoint();
		double[][] BGTransformed = BGRotationY(BGOriginal, BGAngle);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame("3D Rotation Along Y-Axis - Custom Function With Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new Rotation_YAxis3D_BgCustom().BGHehe();
	}
}