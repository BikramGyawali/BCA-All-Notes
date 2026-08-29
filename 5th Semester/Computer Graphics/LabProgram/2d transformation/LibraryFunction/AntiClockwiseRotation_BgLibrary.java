package LibraryFunction;

import package2D.BGhelperPackage;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class AntiClockwiseRotation_BgLibrary {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage bg = new BGhelperPackage();
		bg.inputCoordinate(sa);
		System.out.print("\nEnter Anti-Clockwise Rotation Angle : ");
		double Angle = sa.nextDouble();

		double Radian = Math.toRadians(Angle);
		AffineTransform BGTransform = AffineTransform.getRotateInstance(Radian);
		Point2D A_Naya = BGTransform.transform(new Point2D.Double(bg.Xa, bg.Ya), null);
		Point2D B_Naya = BGTransform.transform(new Point2D.Double(bg.Xb, bg.Yb), null);
		Point2D C_Naya = BGTransform.transform(new Point2D.Double(bg.Xc, bg.Yc), null);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				bg.Xa, bg.Ya,
				bg.Xb, bg.Yb,
				bg.Xc, bg.Yc,
				(int) Math.round(A_Naya.getX()),
				(int) Math.round(A_Naya.getY()),

				(int) Math.round(B_Naya.getX()),
				(int) Math.round(B_Naya.getY()),

				(int) Math.round(C_Naya.getX()),
				(int) Math.round(C_Naya.getY()));
		BGhelperPackage.createFrame("AntiClockwise Rotation - Library Function With Bikram ", AshliPanel);
	}

	public static void main(String[] args) {
		new AntiClockwiseRotation_BgLibrary().BGHehe();
	}
}
