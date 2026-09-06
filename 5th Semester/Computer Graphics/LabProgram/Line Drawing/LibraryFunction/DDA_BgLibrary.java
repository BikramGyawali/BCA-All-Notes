package LibraryFunction;

import packageLine.BGhelperPackageLine;
import java.util.Scanner;

public class DDA_BgLibrary {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackageLine bg = new BGhelperPackageLine();
		bg.inputCoordinate(sa);
		bg.showCoordinate();

		System.out.println("\nLibrary Line with Bikram:");
		System.out.println("Suru = (" + bg.Xa + "," + bg.Ya + ")");
		System.out.println("Antim = (" + bg.Xb + "," + bg.Yb + ")");

		BGhelperPackageLine.PointPanel AshliPanel = new BGhelperPackageLine.PointPanel(bg.Xa, bg.Ya, bg.Xb, bg.Yb);
		BGhelperPackageLine.createFrame("DDA Line Drawing - Library Function With Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new DDA_BgLibrary().BGHehe();
	}
}