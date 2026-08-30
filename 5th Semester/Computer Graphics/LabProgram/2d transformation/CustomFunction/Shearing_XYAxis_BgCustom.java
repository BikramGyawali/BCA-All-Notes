package CustomFunction;

import package2D.BGhelperPackage;
import java.util.Scanner;

public class Shearing_XYAxis_BgCustom {
	private double Shx;
	private double Shy;

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage bg = new BGhelperPackage();
		bg.inputCoordinate(sa);

		System.out.print("Enter Shearing Factor Along X-Axis: ");
		Shx = sa.nextDouble();

		System.out.print("Enter Shearing Factor Along Y-Axis: ");
		Shy = sa.nextDouble();

		int Xa_Naya = BGShearingX(bg.Xa, bg.Ya);
		int Ya_Naya = BGShearingY(bg.Xa, bg.Ya);
		int Xb_Naya = BGShearingX(bg.Xb, bg.Yb);
		int Yb_Naya = BGShearingY(bg.Xb, bg.Yb);
		int Xc_Naya = BGShearingX(bg.Xc, bg.Yc);
		int Yc_Naya = BGShearingY(bg.Xc, bg.Yc);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				bg.Xa, bg.Ya, bg.Xb, bg.Yb, bg.Xc, bg.Yc,
				Xa_Naya, Ya_Naya, Xb_Naya, Yb_Naya, Xc_Naya, Yc_Naya);

		BGhelperPackage.createFrame("Shearing Along XY-Axis - Custom Function With Bikram", AshliPanel);
	}

	public int BGShearingX(int Xa, int Ya) {
		return (int) Math.round(Xa + Shx * Ya);
	}

	public int BGShearingY(int Xa, int Ya) {
		return (int) Math.round(Ya + Shy * Xa);
	}

	public static void main(String[] args) {
		new Shearing_XYAxis_BgCustom().BGHehe();
	}
}
