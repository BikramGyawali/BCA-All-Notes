package LibraryFunction3D;

import package3D.BGhelperPackage3D;
import package3D.BGhelper3DLibrary;
import java.util.Scanner;

public class Scaling_FixedPoint3D_BgLibrary {
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

		System.out.print("Enter Fixed Point X: ");
		double Xfixed = sa.nextDouble();

		System.out.print("Enter Fixed Point Y: ");
		double Yfixed = sa.nextDouble();

		System.out.print("Enter Fixed Point Z: ");
		double Zfixed = sa.nextDouble();

		double[][] BGOriginal = bg.getOriginalPoint();

		double[][] BGTranslate = BGhelper3DLibrary.BGTranslationMatrix(
				-Xfixed, -Yfixed, -Zfixed);

		double[][] BGScale = BGhelper3DLibrary.BGScalingMatrix(Sx, Sy, Sz);

		double[][] BGInverseTranslate = BGhelper3DLibrary.BGTranslationMatrix(
				Xfixed, Yfixed, Zfixed);

		double[][] BGMatrix = BGhelper3DLibrary.BGMultiplyMatrix(
				BGInverseTranslate,
				BGhelper3DLibrary.BGMultiplyMatrix(
						BGScale,
						BGTranslate));

		double[][] BGTransformed = BGhelper3DLibrary.BGApplyMatrix(BGOriginal, BGMatrix);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame(
				"3D Scaling With Fixed Point - Library Function With Bikram",
				AshliPanel);
	}

	public static void main(String[] args) {
		new Scaling_FixedPoint3D_BgLibrary().BGHehe();
	}
}