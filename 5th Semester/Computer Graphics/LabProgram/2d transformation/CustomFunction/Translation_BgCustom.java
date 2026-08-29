package CustomFunction;

import package2D.BGhelperPackage;

import java.util.Scanner;

public class Translation_BgCustom {
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

		int Xa_Naya = BGTranslationX(Xa, Tx);
		int Ya_Naya = BGTranslationY(Ya, Ty);
		int Xb_Naya = BGTranslationX(Xb, Tx);
		int Yb_Naya = BGTranslationY(Yb, Ty);
		int Xc_Naya = BGTranslationX(Xc, Tx);
		int Yc_Naya = BGTranslationY(Yc, Ty);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				Xa, Ya, Xb, Yb, Xc, Yc, Xa_Naya, Ya_Naya, Xb_Naya, Yb_Naya, Xc_Naya, Yc_Naya);

		BGhelperPackage.createFrame("2D Custom Translation with Bikram", AshliPanel);
	}

	public int BGTranslationX(int Xa, int Tx) {
		return Xa + Tx;
	}

	public int BGTranslationY(int Ya, int Ty) {
		return Ya + Ty;
	}

	public static void main(String[] args) {
		new Translation_BgCustom().BGHehe();
	}
}
