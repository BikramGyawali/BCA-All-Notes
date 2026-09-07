package LineClipping;
import packageClipping.BGhelperPackageClipping;
import java.awt.geom.Line2D;
import java.util.Scanner;

public class CohenSutherland_BgLibrary {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackageClipping bg = new BGhelperPackageClipping();
		bg.inputWindow(sa);
		bg.inputLine(sa);

		System.out.println("\nLibrary Line Clipping:");
		System.out.println("Suru = (" + bg.Xa + "," + bg.Ya + ")");
		System.out.println("Antim = (" + bg.Xb + "," + bg.Yb + ")");
		System.out.println("Line clipping is handled using Java Graphics clipping.");

		double[] butwal = null;
		Line2D gyawaliB = new Line2D.Double(bg.Xa, bg.Ya, bg.Xb, bg.Yb);

		if (gyawaliB.intersects(bg.xmin, bg.ymin, bg.xmax - bg.xmin, bg.ymax - bg.ymin)
				|| bg.xmin <= bg.Xa && bg.Xa <= bg.xmax && bg.ymin <= bg.Ya && bg.Ya <= bg.ymax
				|| bg.xmin <= bg.Xb && bg.Xb <= bg.xmax && bg.ymin <= bg.Yb && bg.Yb <= bg.ymax) {
			butwal = new double[] { bg.Xa, bg.Ya, bg.Xb, bg.Yb };
		}

		BGhelperPackageClipping.LinePanel AshliPanel = new BGhelperPackageClipping.LinePanel(bg.xmin, bg.ymin, bg.xmax,
				bg.ymax, bg.Xa, bg.Ya, bg.Xb, bg.Yb, butwal);
		BGhelperPackageClipping.createFrame("Cohen-Sutherland Line Clipping - Library Function", AshliPanel);
	}

	public static void main(String[] args) {
		new CohenSutherland_BgLibrary().BGHehe();
	}
}