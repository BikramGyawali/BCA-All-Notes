package LibraryFunction;

import package2D.BGhelperPackage;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Reflection_YequalsMXplusC_BgLibrary {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage bg = new BGhelperPackage();
		bg.inputCoordinate(sa);

		System.out.print("Enter m (Slope): ");
		double m = sa.nextDouble();

		System.out.print("Enter c (Intercept): ");
		double c = sa.nextDouble();

		double denominator = m * m + 1;
		double matrixA = (1 - m * m) / denominator;
		double matrixB = (2 * m) / denominator;
		double matrixC = matrixB;
		double matrixD = (m * m - 1) / denominator;
		double translateX = (-2 * m * c) / denominator;
		double translateY = (2 * c) / denominator;

		AffineTransform BGTransform = new AffineTransform(
				matrixA, matrixB, matrixC, matrixD, translateX, translateY);

		Point2D A_Naya = BGTransform.transform(new Point2D.Double(bg.Xa, bg.Ya), null);
		Point2D B_Naya = BGTransform.transform(new Point2D.Double(bg.Xb, bg.Yb), null);
		Point2D C_Naya = BGTransform.transform(new Point2D.Double(bg.Xc, bg.Yc), null);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				bg.Xa, bg.Ya, bg.Xb, bg.Yb, bg.Xc, bg.Yc,
				(int) Math.round(A_Naya.getX()), (int) Math.round(A_Naya.getY()),
				(int) Math.round(B_Naya.getX()), (int) Math.round(B_Naya.getY()),
				(int) Math.round(C_Naya.getX()), (int) Math.round(C_Naya.getY()));

		BGhelperPackage.createFrame("Reflection Along y = mx + c - Library Function with Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new Reflection_YequalsMXplusC_BgLibrary().BGHehe();
	}

}
