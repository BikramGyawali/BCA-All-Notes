package LibraryFunction3D;
import package3D.BGhelperPackage3D;
import package3D.BGhelper3DLibrary;
import java.util.Scanner;

public class Translation3D_BgLibrary {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage3D bg = new BGhelperPackage3D();

		bg.inputCoordinate(sa);

		System.out.print("Enter Translation Along X-Axis: ");
		double Tx = sa.nextDouble();

		System.out.print("Enter Translation Along Y-Axis: ");
		double Ty = sa.nextDouble();

		System.out.print("Enter Translation Along Z-Axis: ");
		double Tz = sa.nextDouble();

		double[][] BGOriginal = bg.getOriginalPoint();

		double[][] BGMatrix = BGhelper3DLibrary.BGTranslationMatrix(Tx, Ty, Tz);

		double[][] BGTransformed = BGhelper3DLibrary.BGApplyMatrix(BGOriginal, BGMatrix);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame(
				"3D Translation - Library Function",
				AshliPanel);
	}

	public static void main(String[] args) {
		new Translation3D_BgLibrary().BGHehe();
	}
}