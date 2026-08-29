package LibraryFunction;

import package2D.BGhelperPackage;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Scaling_Origin_BgLibrary {

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage bg = new BGhelperPackage();
		bg.inputCoordinate(sa);
		System.out.print("\nEnter Scaling Factor along X-Dhuri : ");
		double Sx = sa.nextDouble();

		System.out.print("Enter Scaling Factor along Y-Dhuri : ");
		double Sy = sa.nextDouble();

		AffineTransform BGTransform = AffineTransform.getScaleInstance(Sx, Sy);

		Point2D A_Naya = BGTransform.transform(new Point2D.Double(bg.Xa, bg.Ya), null);
		Point2D B_Naya = BGTransform.transform(new Point2D.Double(bg.Xb, bg.Yb), null);
		Point2D C_Naya = BGTransform.transform(new Point2D.Double(bg.Xc, bg.Yc), null);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				bg.Xa, bg.Ya, bg.Xb, bg.Yb, bg.Xc, bg.Yc,

				(int) Math.round(A_Naya.getX()),
				(int) Math.round(A_Naya.getY()),

				(int) Math.round(B_Naya.getX()),
				(int) Math.round(B_Naya.getY()),

				(int) Math.round(C_Naya.getX()),
				(int) Math.round(C_Naya.getY()));

		BGhelperPackage.createFrame("Scaling about Origin - Library Function with Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new Scaling_Origin_BgLibrary().BGHehe();
	}
}
