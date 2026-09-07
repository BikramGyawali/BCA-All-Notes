package PolygonClipping;
import packageClipping.BGhelperPackageClipping;
import java.awt.geom.Area;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Scanner;

public class SutherlandHodgman_BgLibrary {
	public double[][] BGClipPolygon(double[][] points, double xmin, double ymin, double xmax, double ymax) {
		if (points.length == 0)  return new double[0][2];
		Path2D.Double Suru = new Path2D.Double();
		Suru.moveTo(points[0][0], points[0][1]);
		for (int Bikram = 1; Bikram < points.length; Bikram++)
			Suru.lineTo(points[Bikram][0], points[Bikram][1]);
		Suru.closePath();
		Area gyawaliB = new Area(Suru);
		Area butwal = new Area(new Rectangle2D.Double(xmin, ymin, xmax - xmin, ymax - ymin));
		gyawaliB.intersect(butwal);
		PathIterator plapa = gyawaliB.getPathIterator(null);
		double[] data = new double[6];
		ArrayList<double[]> result = new ArrayList<>();
		while (!plapa.isDone()) {
			int Bikram = plapa.currentSegment(data);
			if (Bikram == PathIterator.SEG_MOVETO || Bikram == PathIterator.SEG_LINETO)
				result.add(new double[] { data[0], data[1] });
			plapa.next();
		}
		double[][] Antim = new double[result.size()][2];
		for (int Bikram = 0; Bikram < result.size(); Bikram++)
			Antim[Bikram] = result.get(Bikram);
		return Antim;
	}

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackageClipping bg = new BGhelperPackageClipping();
		bg.inputWindow(sa);
		double[][] Suru = bg.inputPolygon(sa);
		double[][] Antim = BGClipPolygon(Suru, bg.xmin, bg.ymin, bg.xmax, bg.ymax);
		System.out.println("\nLibrary Polygon Clipping Result:");
		for (int Bikram = 0; Bikram < Antim.length; Bikram++)
			System.out.println("P" + (Bikram + 1) + "' = (" + Antim[Bikram][0] + "," + Antim[Bikram][1] + ")");
		BGhelperPackageClipping.PolygonPanel AshliPanel = new BGhelperPackageClipping.PolygonPanel(bg.xmin, bg.ymin,
				bg.xmax, bg.ymax, Suru, Antim);
		BGhelperPackageClipping.createFrame("Sutherland-Hodgman Polygon Clipping - Library Function", AshliPanel);
	}
	public static void main(String[] args) {
		new SutherlandHodgman_BgLibrary().BGHehe();
	}
}