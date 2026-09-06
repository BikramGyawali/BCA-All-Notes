package CustomFunction;

import packageLine.BGhelperPackageLine;
import java.util.Scanner;

public class DDA_BgCustom {
	public int[][] BGDDA(int Xa, int Ya, int Xb, int Yb) {
		int delx = Xb - Xa;
		int dely = Yb - Ya;
		int steps = Math.max(Math.abs(delx), Math.abs(dely));
		double XIncrement = (double) delx / steps;
		double YIncrement = (double) dely / steps;
		double XCurrent = Xa;
		double YCurrent = Ya;
		int[][] BGPoints = new int[steps + 1][2];

		System.out.println("\nDDA Calculated Points With Bikram:");
		for (int Bikram = 0; Bikram <= steps; Bikram++) {
			BGPoints[Bikram][0] = (int) Math.round(XCurrent);
			BGPoints[Bikram][1] = (int) Math.round(YCurrent);
			System.out.println("(" + BGPoints[Bikram][0] + "," + BGPoints[Bikram][1] + ")");
			XCurrent += XIncrement;
			YCurrent += YIncrement;
		}
		return BGPoints;
	}

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackageLine bg = new BGhelperPackageLine();
		bg.inputCoordinate(sa);
		bg.showCoordinate();
		int[][] BGPoints = BGDDA(bg.Xa, bg.Ya, bg.Xb, bg.Yb);
		BGhelperPackageLine.PointPanel AshliPanel = new BGhelperPackageLine.PointPanel(bg.Xa, bg.Ya, bg.Xb, bg.Yb,
				BGPoints);
		BGhelperPackageLine.createFrame("DDA Line Drawing - Custom Function With Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new DDA_BgCustom().BGHehe();
	}
}