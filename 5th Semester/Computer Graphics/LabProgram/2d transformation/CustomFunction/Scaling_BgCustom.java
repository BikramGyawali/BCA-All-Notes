package CustomFunction;
import package2D.BGhelperPackage;
import java.util.Scanner;

public class Scaling_BgCustom {
	private int Xa, Ya;
	private int Xb, Yb;
	private int Xc, Yc;
	private double Sx, Sy;

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

		System.out.print("\nEnter Scaling Factor along X-Dhuri : ");
		Sx = sa.nextDouble();

		System.out.print("Enter Scaling Factor along Y-Dhuri : ");
		Sy = sa.nextDouble();

		int Xa_Naya = BGScalingX(Xa, Sx);
		int Ya_Naya = BGScalingY(Ya, Sy);

		int Xb_Naya = BGScalingX(Xb, Sx);
		int Yb_Naya = BGScalingY(Yb, Sy);

		int Xc_Naya = BGScalingX(Xc, Sx);
		int Yc_Naya = BGScalingY(Yc, Sy);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				Xa, Ya, Xb, Yb, Xc, Yc,
				Xa_Naya, Ya_Naya, Xb_Naya, Yb_Naya, Xc_Naya, Yc_Naya);

		BGhelperPackage.createFrame("2D Custom Scaling with Bikram", AshliPanel);
	}

	public int BGScalingX(int Xa, double Sx) {
		return (int) Math.round(Xa * Sx);
	}

	public int BGScalingY(int Ya, double Sy) {
		return (int) Math.round(Ya * Sy);
	}

	public static void main(String[] args) {
		new Scaling_BgCustom().BGHehe();
	}
}
