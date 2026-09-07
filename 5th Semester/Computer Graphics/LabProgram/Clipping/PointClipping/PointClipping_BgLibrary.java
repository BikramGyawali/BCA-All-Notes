package PointClipping;

import packageClipping.BGhelperPackageClipping;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Scanner;

public class PointClipping_BgLibrary {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackageClipping bg = new BGhelperPackageClipping();
		bg.inputWindow(sa);
		bg.inputPoint(sa);
		double[][] Suru = bg.inputPoints(sa);
		Rectangle2D bikramG = new Rectangle2D.Double(bg.xmin, bg.ymin, bg.xmax - bg.xmin, bg.ymax - bg.ymin);
		ArrayList<double[]> gyawaliB = new ArrayList<>();

		System.out.println("\nLibrary Point Clipping Result:");
		for (int Bikram = 0; Bikram < Suru.length; Bikram++) {
			boolean butwal = bikramG.contains(Suru[Bikram][0], Suru[Bikram][1]);
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
		BGhelperPackageClipping.createFrame("Point Clipping - Library Function", AshliPanel);
	}

	public static void main(String[] args) {
		new PointClipping_BgLibrary().BGHehe();
	}
}