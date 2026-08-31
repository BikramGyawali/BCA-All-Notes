package LibraryFunction3D;

import package3D.BGhelperPackage3D;
import package3D.BGhelper3DLibrary;
import java.util.Scanner;

public class Scaling_Origin3D_BgLibrary {
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

		double[][] BGMatrix = BGhelper3DLibrary.BGScalingMatrix(Sx, Sy, Sz);

		double[][] BGTransformed = BGhelper3DLibrary.BGApplyMatrix(BGOriginal, BGMatrix);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame(
				"3D Scaling About Origin - Library Function With Bikram,",
				AshliPanel);
	}

	public static void main(String[] args) {
		new Scaling_Origin3D_BgLibrary().BGHehe();
	}
}