package LibraryFunction;

import package2D.BGhelperPackage;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Shearing_XYAxis_BgLibrary {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage bg = new BGhelperPackage();
		bg.inputCoordinate(sa);
		System.out.print("Enter Shearing Factor Along X-Axis: ");
		double Shx = sa.nextDouble();

		System.out.print("Enter Shearing Factor Along Y-Axis: ");
		double Shy = sa.nextDouble();

		AffineTransform BGTransform = AffineTransform.getShearInstance(Shx, Shy);

		Point2D A_Naya = BGTransform.transform(new Point2D.Double(bg.Xa, bg.Ya), null);
		Point2D B_Naya = BGTransform.transform(new Point2D.Double(bg.Xb, bg.Yb), null);
		Point2D C_Naya = BGTransform.transform(new Point2D.Double(bg.Xc, bg.Yc), null);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				bg.Xa, bg.Ya, bg.Xb, bg.Yb, bg.Xc, bg.Yc,
				(int) Math.round(A_Naya.getX()), (int) Math.round(A_Naya.getY()),
				(int) Math.round(B_Naya.getX()), (int) Math.round(B_Naya.getY()),
				(int) Math.round(C_Naya.getX()), (int) Math.round(C_Naya.getY()));

		BGhelperPackage.createFrame("Shearing Along XY-Axis - Library Function With Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new Shearing_XYAxis_BgLibrary().BGHehe();
	}
}
