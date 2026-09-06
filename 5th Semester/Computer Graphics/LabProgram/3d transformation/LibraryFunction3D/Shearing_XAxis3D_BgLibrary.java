package LibraryFunction3D;
import package3D.BGhelperPackage3D;
import package3D.BGhelper3DLibrary;
import java.util.Scanner;

public class Shearing_XAxis3D_BgLibrary {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage3D bg = new BGhelperPackage3D();

		bg.inputCoordinate(sa);

		System.out.print("Enter Y Shear Factor b: ");
		double b = sa.nextDouble();

		System.out.print("Enter Z Shear Factor c: ");
		double c = sa.nextDouble();

		double[][] BGOriginal = bg.getOriginalPoint();

		double[][] BGMatrix = BGhelper3DLibrary.BGShearingXMatrix(b, c);

		double[][] BGTransformed = BGhelper3DLibrary.BGApplyMatrix(BGOriginal, BGMatrix);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame("3D Shearing Along X-Axis - Library Function With Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new Shearing_XAxis3D_BgLibrary().BGHehe();
	}
}