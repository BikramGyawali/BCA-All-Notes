package CustomFunction;

import packageLine.BGhelperPackageLine;
import java.util.Scanner;

public class Bresenham_BgCustom {
	public int[][] BGBresenham(int Xa, int Ya, int Xb, int Yb) {
		int delx = Math.abs(Xb - Xa);
		int dely = Math.abs(Yb - Ya);
		int p = 2 * dely - delx;
		int x, y, xantim;

		if (Xb > Xa) {
			x = Xa;
			y = Ya;
			xantim = Xb;
		} else {
			x = Xb;
			y = Yb;
			xantim = Xa;
		}

		int steps = xantim - x;
		int[][] BGPoints = new int[steps + 1][2];
		int Bikram = 0;

		System.out.println("\nBresenham Calculated Points With Bikram:");
		BGPoints[Bikram][0] = x;
		BGPoints[Bikram][1] = y;
		System.out.println("(" + x + "," + y + ")");

		while (x < xantim) {
			x++;
			if (p < 0) {
				p = p + 2 * dely;
			} else {
				y++;
				p = p + 2 * dely - 2 * delx;
			}
			Bikram++;
			BGPoints[Bikram][0] = x;
			BGPoints[Bikram][1] = y;
			System.out.println("(" + x + "," + y + ")");
		}
		return BGPoints;
	}

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackageLine bg = new BGhelperPackageLine();
		bg.inputCoordinate(sa);
		bg.showCoordinate();
		int[][] BGPoints = BGBresenham(bg.Xa, bg.Ya, bg.Xb, bg.Yb);
		BGhelperPackageLine.PointPanel AshliPanel = new BGhelperPackageLine.PointPanel(bg.Xa, bg.Ya, bg.Xb, bg.Yb,
				BGPoints);
		BGhelperPackageLine.createFrame("Bresenham Line Drawing - Custom Function With Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new Bresenham_BgCustom().BGHehe();
	}
}