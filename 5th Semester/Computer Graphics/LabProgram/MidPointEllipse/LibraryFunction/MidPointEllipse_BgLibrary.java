package LibraryFunction;

import packageEllipse.BGhelperPackage;

public class MidPointEllipse_BgLibrary {
	public static void main(String[] args) {
		int Xc = BGhelperPackage.getCenterX();
		int Yc = BGhelperPackage.getCenterY();
		int rx = BGhelperPackage.getXRadius();
		int ry = BGhelperPackage.getYRadius();

		System.out.println("\nEllipse Information With Bikram:");
		System.out.println("Center: (" + Xc + "," + Yc + ")");
		System.out.println("X Radius: " + rx);
		System.out.println("Y Radius: " + ry);
		System.out.println("Library function: drawOval()");
		System.out.println("Ellipse drawing completed.");

		BGhelperPackage.showLibraryEllipse(
				Xc, Yc, rx, ry, "Ellipse Drawing With Bikram - Library");
	}
}