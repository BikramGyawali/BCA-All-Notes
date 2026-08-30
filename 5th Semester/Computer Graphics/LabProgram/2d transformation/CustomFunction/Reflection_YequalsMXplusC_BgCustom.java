package CustomFunction;

import package2D.BGhelperPackage;
import java.util.Scanner;

public class Reflection_YequalsMXplusC_BgCustom {
	private double m;
	private double c;

	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage bg = new BGhelperPackage();
		bg.inputCoordinate(sa);

		System.out.print("Enter m (Slope): ");
		m = sa.nextDouble();

		System.out.print("Enter c (Intercept): ");
		c = sa.nextDouble();

		int Xa_Naya = BGReflectionX(bg.Xa, bg.Ya);
		int Ya_Naya = BGReflectionY(bg.Xa, bg.Ya);
		int Xb_Naya = BGReflectionX(bg.Xb, bg.Yb);
		int Yb_Naya = BGReflectionY(bg.Xb, bg.Yb);
		int Xc_Naya = BGReflectionX(bg.Xc, bg.Yc);
		int Yc_Naya = BGReflectionY(bg.Xc, bg.Yc);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				bg.Xa, bg.Ya, bg.Xb, bg.Yb, bg.Xc, bg.Yc,
				Xa_Naya, Ya_Naya, Xb_Naya, Yb_Naya, Xc_Naya, Yc_Naya);

		BGhelperPackage.createFrame("Reflection Along y = mx + c - Custom Function with Bikram", AshliPanel);
	}

	public int BGReflectionX(int Xa, int Ya) {
		double BGDistance = (m * Xa - Ya + c) / (m * m + 1);
		return (int) Math.round(Xa - 2 * m * BGDistance);
	}

	public int BGReflectionY(int Xa, int Ya) {
		double BGDistance = (m * Xa - Ya + c) / (m * m + 1);
		return (int) Math.round(Ya + 2 * BGDistance);
	}

	public static void main(String[] args) {
		new Reflection_YequalsMXplusC_BgCustom().BGHehe();
	}
}
