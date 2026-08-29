package CustomFunction;

import package2D.BGhelperPackage;
import java.util.Scanner;

public class Rotation_ArbitraryPoint_BgCustom {

	private int Xa, Ya, Xb, Yb, Xc, Yc;
	private int Xp, Yp;
	private double Angle;

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

		System.out.print("\nEnter Arbitrary Point X Coordinate : ");
		Xp = sa.nextInt();

		System.out.print("Enter Arbitrary Point Y Coordinate : ");
		Yp = sa.nextInt();

		System.out.print("\nEnter Rotation Angle : ");
		Angle = sa.nextDouble();
		double Radian = Math.toRadians(Angle);

		int Xa_Naya = BGRotationX(Xa, Ya, Xp, Yp, Radian);
		int Ya_Naya = BGRotationY(Xa, Ya, Xp, Yp, Radian);

		int Xb_Naya = BGRotationX(Xb, Yb, Xp, Yp, Radian);
		int Yb_Naya = BGRotationY(Xb, Yb, Xp, Yp, Radian);

		int Xc_Naya = BGRotationX(Xc, Yc, Xp, Yp, Radian);
		int Yc_Naya = BGRotationY(Xc, Yc, Xp, Yp, Radian);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				Xa, Ya,
				Xb, Yb,
				Xc, Yc,
				Xa_Naya, Ya_Naya,
				Xb_Naya, Yb_Naya,
				Xc_Naya, Yc_Naya);

		BGhelperPackage.createFrame("Rotation through Arbitrary Point - Custom Function", AshliPanel);
	}

	public int BGRotationX(int Xa, int Ya, int Xp, int Yp, double Radian) {
		return (int) Math.round(Xp + (Xa - Xp) * Math.cos(Radian) - (Ya - Yp) * Math.sin(Radian));
	}

	public int BGRotationY(int Xa, int Ya, int Xp, int Yp, double Radian) {
		return (int) Math.round(Yp + (Xa - Xp) * Math.sin(Radian) + (Ya - Yp) * Math.cos(Radian));
	}

	public static void main(String[] args) {
		new Rotation_ArbitraryPoint_BgCustom().BGHehe();
	}
}
