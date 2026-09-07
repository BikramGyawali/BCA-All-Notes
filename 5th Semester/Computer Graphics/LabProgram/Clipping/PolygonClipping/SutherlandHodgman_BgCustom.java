package PolygonClipping;
import packageClipping.BGhelperPackageClipping;
import java.util.ArrayList;
import java.util.Scanner;

public class SutherlandHodgman_BgCustom {
	private boolean BGInside(double[] point, int edge, double value) {
		if (edge == 0)
			return point[0] >= value;
		if (edge == 1)
			return point[0] <= value;
		if (edge == 2)
			return point[1] >= value;
		return point[1] <= value;
	}
	private double[] BGIntersection(double[] Suru, double[] Antim, int edge, double value) {
		double x1 = Suru[0], y1 = Suru[1], x2 = Antim[0], y2 = Antim[1];
		if (edge == 0 || edge == 1) {
			double y = y1 + (y2 - y1) * (value - x1) / (x2 - x1);
			return new double[] { value, y };
		}
		double x = x1 + (x2 - x1) * (value - y1) / (y2 - y1);
		return new double[] { x, value };
	}
	private double[][] BGClipEdge(double[][] points, int edge, double value) {
		ArrayList<double[]> butwal = new ArrayList<>();
		if (points.length == 0)
			return new double[0][2];
		for (int Bikram = 0; Bikram < points.length; Bikram++) {
			double[] Suru = points[Bikram];
			double[] Antim = points[(Bikram + 1) % points.length];
			boolean SuruInside = BGInside(Suru, edge, value);
			boolean AntimInside = BGInside(Antim, edge, value);
			if (SuruInside && AntimInside) {
				butwal.add(Antim);
			} else if (SuruInside && !AntimInside) {
				butwal.add(BGIntersection(Suru, Antim, edge, value));
			} else if (!SuruInside && AntimInside) {
				butwal.add(BGIntersection(Suru, Antim, edge, value));
				butwal.add(Antim);
			}
		}
		double[][] gyawaliB = new double[butwal.size()][2];
		for (int Bikram = 0; Bikram < butwal.size(); Bikram++)
			gyawaliB[Bikram] = butwal.get(Bikram);
		return gyawaliB;
	}
	public double[][] BGSutherlandHodgman(double[][] points, double xmin, double ymin, double xmax, double ymax) {
		double[][] bikramG = points;
		bikramG = BGClipEdge(bikramG, 0, xmin);
		bikramG = BGClipEdge(bikramG, 1, xmax);
		bikramG = BGClipEdge(bikramG, 2, ymin);
		bikramG = BGClipEdge(bikramG, 3, ymax);
		return bikramG;
	}
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackageClipping bg = new BGhelperPackageClipping();
		bg.inputWindow(sa);
		double[][] Suru = bg.inputPolygon(sa);
		double[][] Antim = BGSutherlandHodgman(Suru, bg.xmin, bg.ymin, bg.xmax, bg.ymax);
		System.out.println("\nOriginal Polygon Points:");
		for (int Bikram = 0; Bikram < Suru.length; Bikram++)
			System.out.println("P" + (Bikram + 1) + " = (" + Suru[Bikram][0] + "," + Suru[Bikram][1] + ")");
		System.out.println("\nClipped Polygon Points:");
		for (int Bikram = 0; Bikram < Antim.length; Bikram++)
			System.out.println("P" + (Bikram + 1) + "' = (" + Antim[Bikram][0] + "," + Antim[Bikram][1] + ")");
		BGhelperPackageClipping.PolygonPanel AshliPanel = new BGhelperPackageClipping.PolygonPanel(bg.xmin, bg.ymin,
				bg.xmax, bg.ymax, Suru, Antim);
		BGhelperPackageClipping.createFrame("Sutherland-Hodgman Polygon Clipping - Custom Function", AshliPanel);
	}
	public static void main(String[] args) {
		new SutherlandHodgman_BgCustom().BGHehe();
	}
}