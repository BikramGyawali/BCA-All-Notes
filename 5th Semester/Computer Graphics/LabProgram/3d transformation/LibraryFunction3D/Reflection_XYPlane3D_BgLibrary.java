package LibraryFunction3D;

import package3D.BGhelperPackage3D;
import package3D.BGhelper3DLibrary;
import java.util.Scanner;

public class Reflection_XYPlane3D_BgLibrary {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage3D bg = new BGhelperPackage3D();

		bg.inputCoordinate(sa);

		double[][] BGOriginal = bg.getOriginalPoint();

		double[][] BGMatrix = BGhelper3DLibrary.BGReflectionXYMatrix();

		double[][] BGTransformed = BGhelper3DLibrary.BGApplyMatrix(BGOriginal, BGMatrix);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame(
				"Reflection Along XY Plane - Library Function With Bikram",
				AshliPanel);
	}

	public static void main(String[] args) {
		new Reflection_XYPlane3D_BgLibrary().BGHehe();
	}
}