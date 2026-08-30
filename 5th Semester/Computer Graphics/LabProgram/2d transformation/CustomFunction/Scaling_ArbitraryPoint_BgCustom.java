package CustomFunction;
import package2D.BGhelperPackage;
import java.util.Scanner;

public class Scaling_ArbitraryPoint_BgCustom {
	private int Xa, Ya, Xb, Yb, Xc, Yc;
	private int Xf, Yf;
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

		System.out.print("\nEnter Fixed Point X Coordinate : ");
		Xf = sa.nextInt();

		System.out.print("Enter Fixed Point Y Coordinate : ");
		Yf = sa.nextInt();

		System.out.print("\nEnter Scaling Factor along X-Dhuri : ");
		Sx = sa.nextDouble();

		System.out.print("Enter Scaling Factor along Y-Dhuri : ");
		Sy = sa.nextDouble();

		int Xa_Naya = BGScalingX(Xa, Xf, Sx);
		int Ya_Naya = BGScalingY(Ya, Yf, Sy);

		int Xb_Naya = BGScalingX(Xb, Xf, Sx);
		int Yb_Naya = BGScalingY(Yb, Yf, Sy);

		int Xc_Naya = BGScalingX(Xc, Xf, Sx);
		int Yc_Naya = BGScalingY(Yc, Yf, Sy);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(

				Xa, Ya,
				Xb, Yb,
				Xc, Yc,

				Xa_Naya, Ya_Naya,
				Xb_Naya, Yb_Naya,
				Xc_Naya, Yc_Naya);

		BGhelperPackage.createFrame("Scaling about Arbitrary Point - Custom Function", AshliPanel);
	}

	public int BGScalingX(int Xa, int Xf, double Sx) {
		return (int) Math.round(Xf + (Xa - Xf) * Sx);
	}

	public int BGScalingY(int Ya, int Yf, double Sy) {
		return (int) Math.round(Yf + (Ya - Yf) * Sy);
	}

	public static void main(String[] args) {
		new Scaling_ArbitraryPoint_BgCustom().BGHehe();
	}
}
