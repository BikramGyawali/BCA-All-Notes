package CustomFunction;

import package2D.BGhelperPackage;
import java.util.Scanner;

public class AntiClockWiseRotation_BgCustom {
	private int Xa, Ya;
	private int Xb, Yb;
	private int Xc, Yc;
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

		System.out.print("\nEnter Anti-Clock Rotation Angle in Degree : ");
		Angle = sa.nextDouble();
		double Radian = Math.toRadians(Angle);
		int Xa_Naya = BGRotationX(Xa, Ya, Radian);
		int Ya_Naya = BGRotationY(Xa, Ya, Radian);

		int Xb_Naya = BGRotationX(Xb, Yb, Radian);
		int Yb_Naya = BGRotationY(Xb, Yb, Radian);

		int Xc_Naya = BGRotationX(Xc, Yc, Radian);
		int Yc_Naya = BGRotationY(Xc, Yc, Radian);

		BGhelperPackage.CustomPanel AshliPanel = new BGhelperPackage.CustomPanel(
				Xa, Ya,
				Xb, Yb,
				Xc, Yc,
				Xa_Naya, Ya_Naya,
				Xb_Naya, Yb_Naya,
				Xc_Naya, Yc_Naya);

		BGhelperPackage.createFrame("2D Custom Rotation with Bikram", AshliPanel);
	}

	public int BGRotationX(int Xa, int Ya, double Radian) {
		return (int) Math.round(Xa * Math.cos(Radian) - Ya * Math.sin(Radian));
	}

	public int BGRotationY(int Xa, int Ya, double Radian) {
		return (int) Math.round(Xa * Math.sin(Radian) + Ya * Math.cos(Radian));
	}

	public static void main(String[] args) {
		new AntiClockWiseRotation_BgCustom().BGHehe();
	}
}
