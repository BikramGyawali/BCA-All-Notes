package CustomFunction;
import package2D.BGhelperPackage;
import java.util.Scanner;

public class Reflection_Origin_BgCustom {
	public void BGHehe() {
		Scanner sa = new Scanner(System.in);
		BGhelperPackage bg = new BGhelperPackage();
		bg.inputCoordinate(sa);

		int Xa_Naya = BGReflectionX(bg.Xa);
		int Ya_Naya = BGReflectionY(bg.Ya);
		int Xb_Naya = BGReflectionX(bg.Xb);
		int Yb_Naya = BGReflectionY(bg.Yb);
		int Xc_Naya = BGReflectionX(bg.Xc);
		int Yc_Naya = BGReflectionY(bg.Yc);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				bg.Xa, bg.Ya, bg.Xb, bg.Yb, bg.Xc, bg.Yc,
				Xa_Naya, Ya_Naya, Xb_Naya, Yb_Naya, Xc_Naya, Yc_Naya);

		BGhelperPackage.createFrame("Reflection Along Origin - Custom Function With Bikram", AshliPanel);
	}

	public int BGReflectionX(int Xa) {
		return -Xa;
	}

	public int BGReflectionY(int Ya) {
		return -Ya;
	}

	public static void main(String[] args) {
		new Reflection_Origin_BgCustom().BGHehe();
	}

}
