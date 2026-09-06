package LibraryFunction;

import packageCircle.BGhelperPackage;

public class MidPoint_BgLibrary {
	public static void main(String[] args) {
		int radius = BGhelperPackage.getRadius();

		System.out.println("\nUsing Java Graphics Library");
		System.out.println("Radius: " + radius);
		System.out.println("Circle drawing completed.");

		BGhelperPackage.showLibraryCircle(radius, "Mid Point Circle Drawing With Bikram - Library");
	}
}