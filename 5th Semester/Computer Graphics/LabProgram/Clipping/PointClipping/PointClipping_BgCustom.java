package PointClipping;
import packageClipping.BGhelperPackageClipping;
import java.util.ArrayList;
import java.util.Scanner;

public class PointClipping_BgCustom {
	public boolean BGPointClip(double x, double y, double xmin, double ymin, double xmax, double ymax) {
		return x >= xmin && x <= xmax && y >= ymin && y <= ymax;
	}
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackageClipping bg = new BGhelperPackageClipping();
		bg.inputWindow(sa);
		bg.inputPoint(sa);
		double[][] Suru = bg.inputPoints(sa);
		ArrayList<double[]> gyawaliB = new ArrayList<>();
		System.out.println("\nPoint Clipping Result:");
		for (int Bikram = 0; Bikram < Suru.length; Bikram++) {
			boolean butwal = BGPointClip(Suru[Bikram][0], Suru[Bikram][1], bg.xmin, bg.ymin, bg.xmax, bg.ymax);
			System.out.println("P" + (Bikram + 1) + " = (" + Suru[Bikram][0] + "," + Suru[Bikram][1] + ") -> "
					+ (butwal ? "ACCEPTED" : "REJECTED"));
			if (butwal)
				gyawaliB.add(Suru[Bikram]);
		}

		double[][] Antim = new double[gyawaliB.size()][2];
		for (int Bikram = 0; Bikram < gyawaliB.size(); Bikram++)
			Antim[Bikram] = gyawaliB.get(Bikram);

		BGhelperPackageClipping.PointPanel AshliPanel = new BGhelperPackageClipping.PointPanel(bg.xmin, bg.ymin,
				bg.xmax, bg.ymax, Suru, Antim);
		BGhelperPackageClipping.createFrame("Point Clipping - Custom Function", AshliPanel);
	}

	public static void main(String[] args) {
		new PointClipping_BgCustom().BGHehe();
	}
}