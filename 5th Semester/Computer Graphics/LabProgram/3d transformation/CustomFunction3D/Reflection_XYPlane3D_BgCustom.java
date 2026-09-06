package CustomFunction3D;
import package3D.BGhelperPackage3D;
import java.util.Scanner;

public class Reflection_XYPlane3D_BgCustom {
	public double[][] BGReflectionXY(double[][] BGOriginal) {
		double[][] BGTransformed = new double[8][3];

		for (int Bikram = 0; Bikram < 8; Bikram++) {
			BGTransformed[Bikram][0] = BGOriginal[Bikram][0];
			BGTransformed[Bikram][1] = BGOriginal[Bikram][1];
			BGTransformed[Bikram][2] = -BGOriginal[Bikram][2];
		}
		return BGTransformed;
	}

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage3D bg = new BGhelperPackage3D();

		bg.inputCoordinate(sa);

		double[][] BGOriginal = bg.getOriginalPoint();
		double[][] BGTransformed = BGReflectionXY(BGOriginal);

		bg.showOriginalCoordinate(BGOriginal);
		bg.showTransformedCoordinate(BGTransformed);

		BGhelperPackage3D.CustomPanel3D AshliPanel = new BGhelperPackage3D.CustomPanel3D(BGOriginal, BGTransformed);

		BGhelperPackage3D.createFrame("Reflection Along XY Plane - Custom Function With Bikram", AshliPanel);
	}
	public static void main(String[] args) {
		new Reflection_XYPlane3D_BgCustom().BGHehe();
	}
}