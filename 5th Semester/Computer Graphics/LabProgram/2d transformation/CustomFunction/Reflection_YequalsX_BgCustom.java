package CustomFunction;

import package2D.BGhelperPackage;
import java.util.Scanner;

public class Reflection_YequalsX_BgCustom {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage bg = new BGhelperPackage();
		bg.inputCoordinate(sa);

		int Xa_Naya = BGReflectionX(bg.Ya);
		int Ya_Naya = BGReflectionY(bg.Xa);
		int Xb_Naya = BGReflectionX(bg.Yb);
		int Yb_Naya = BGReflectionY(bg.Xb);
		int Xc_Naya = BGReflectionX(bg.Yc);
		int Yc_Naya = BGReflectionY(bg.Xc);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				bg.Xa, bg.Ya, bg.Xb, bg.Yb, bg.Xc, bg.Yc,
				Xa_Naya, Ya_Naya, Xb_Naya, Yb_Naya, Xc_Naya, Yc_Naya);

		BGhelperPackage.createFrame("Reflection Along y = x - Custom Function with Bikram", AshliPanel);
	}

	public int BGReflectionX(int Ya) {
		return Ya;
	}

	public int BGReflectionY(int Xa) {
		return Xa;
	}

	public static void main(String[] args) {
		new Reflection_YequalsX_BgCustom().BGHehe();
	}
}
