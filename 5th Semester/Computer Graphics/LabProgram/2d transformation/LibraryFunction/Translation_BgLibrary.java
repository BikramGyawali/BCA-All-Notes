package LibraryFunction;

import package2D.BGhelperPackage;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class Translation_BgLibrary {
	private int Xa, Ya;
	private int Xb, Yb;
	private int Xc, Yc;
	private int Tx, Ty;

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage bg = new BGhelperPackage();
		bg.inputCoordinate(sa);

		Xa = bg.Xa;
		Ya = bg.Ya;

		Xb = bg.Xb;
		Yb = bg.Yb;

		Xc = bg.Xc;
		Yc = bg.Yc;

		System.out.print("\nEnter translation along X-Dhuri : ");
		Tx = sa.nextInt();

		System.out.print("Enter translation along Y-Dhuri : ");
		Ty = sa.nextInt();

		AffineTransform BGTransform = new AffineTransform();
		BGTransform.translate(Tx, Ty);

		Point2D A_Naya = BGTransform.transform(new Point2D.Double(Xa, Ya), null);
		Point2D B_Naya = BGTransform.transform(new Point2D.Double(Xb, Yb), null);
		Point2D C_Naya = BGTransform.transform(new Point2D.Double(Xc, Yc), null);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				Xa, Ya, Xb, Yb, Xc, Yc,

				(int) Math.round(A_Naya.getX()),
				(int) Math.round(A_Naya.getY()),

				(int) Math.round(B_Naya.getX()),
				(int) Math.round(B_Naya.getY()),

				(int) Math.round(C_Naya.getX()),
				(int) Math.round(C_Naya.getY()));

		BGhelperPackage.createFrame("2D Library Translation with Bikram", AshliPanel);
	}

	public static void main(String[] args) {
		new Translation_BgLibrary().BGHehe();
	}
}
