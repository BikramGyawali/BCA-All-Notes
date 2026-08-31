package package3D;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class BGhelperPackage3D {
	public double Xa, Ya, Za;
	public double Xb, Yb, Zb;
	public double Xc, Yc, Zc;
	public double Xd, Yd, Zd;
	public double Xe, Ye, Ze;
	public double Xf, Yf, Zf;
	public double Xg, Yg, Zg;
	public double Xh, Yh, Zh;

	public void inputCoordinate(Scanner sa) {
		System.out.println("Enter 8 Coordinates for Ghan (Cube):");

		System.out.print("A - Enter garnus X,Y,Z: ");
		Xa = sa.nextDouble();
		Ya = sa.nextDouble();
		Za = sa.nextDouble();

		System.out.print("B - Enter garnus X,Y,Z: ");
		Xb = sa.nextDouble();
		Yb = sa.nextDouble();
		Zb = sa.nextDouble();

		System.out.print("C - Enter garnus X,Y,Z: ");
		Xc = sa.nextDouble();
		Yc = sa.nextDouble();
		Zc = sa.nextDouble();

		System.out.print("D - Enter garnus X,Y,Z: ");
		Xd = sa.nextDouble();
		Yd = sa.nextDouble();
		Zd = sa.nextDouble();

		System.out.print("E - Enter garnus X,Y,Z: ");
		Xe = sa.nextDouble();
		Ye = sa.nextDouble();
		Ze = sa.nextDouble();

		System.out.print("F - Enter garnus X,Y,Z: ");
		Xf = sa.nextDouble();
		Yf = sa.nextDouble();
		Zf = sa.nextDouble();

		System.out.print("G - Enter garnus X,Y,Z: ");
		Xg = sa.nextDouble();
		Yg = sa.nextDouble();
		Zg = sa.nextDouble();

		System.out.print("H - Enter garnus X,Y,Z: ");
		Xh = sa.nextDouble();
		Yh = sa.nextDouble();
		Zh = sa.nextDouble();
	}

	public double[][] getOriginalPoint() {
		return new double[][] {
				{ Xa, Ya, Za },
				{ Xb, Yb, Zb },
				{ Xc, Yc, Zc },
				{ Xd, Yd, Zd },
				{ Xe, Ye, Ze },
				{ Xf, Yf, Zf },
				{ Xg, Yg, Zg },
				{ Xh, Yh, Zh }
		};
	}

	public void showOriginalCoordinate(double[][] BGPoint) {
		char[] BGName = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		System.out.println("\nOriginal Coordinates:");
		for (int Bikram = 0; Bikram < 8; Bikram++) {
			System.out.println(BGName[Bikram] + " = (" +
					BGPoint[Bikram][0] + ", " +
					BGPoint[Bikram][1] + ", " +
					BGPoint[Bikram][2] + ")");
		}
	}

	public void showTransformedCoordinate(double[][] BGPoint) {
		char[] BGName = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		System.out.println("\nTransformed Coordinates:");
		for (int Bikram = 0; Bikram < 8; Bikram++) {
			System.out.println(BGName[Bikram] + "' = (" +
					BGPoint[Bikram][0] + ", " +
					BGPoint[Bikram][1] + ", " +
					BGPoint[Bikram][2] + ")");
		}
	}

	public static void createFrame(String BGTitle, JPanel AshliPanel) {
		JFrame BGF = new JFrame(BGTitle);
		BGF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BGF.setSize(1000, 750);
		BGF.setLocationRelativeTo(null);
		BGF.add(AshliPanel);
		BGF.setVisible(true);
	}

	public static class CustomPanel3D extends JPanel {
		private double[][] BGOriginal;
		private double[][] BGTransformed;

		public CustomPanel3D(double[][] BGOriginal, double[][] BGTransformed) {
			this.BGOriginal = BGOriginal;
			this.BGTransformed = BGTransformed;
		}

		public int BGScreenX(double XCoordinate, double ZCoordinate) {
			return (int) Math.round(getWidth() / 2 + XCoordinate * 30 - ZCoordinate * 15);
		}

		public int BGScreenY(double YCoordinate, double ZCoordinate) {
			return (int) Math.round(getHeight() / 2 - YCoordinate * 30 + ZCoordinate * 15);
		}

		public void BGDrawAxes(Graphics2D g2) {
			int centerX = getWidth() / 2;
			int centerY = getHeight() / 2;

			g2.setStroke(new BasicStroke(2));
			g2.drawLine(0, centerY, getWidth(), centerY);
			g2.drawString("X", getWidth() - 25, centerY - 8);

			g2.drawLine(centerX, 0, centerX, getHeight());
			g2.drawString("Y", centerX + 8, 25);

			g2.drawLine(centerX, centerY, centerX - 180, centerY + 180);
			g2.drawString("Z", centerX - 200, centerY + 190);

			g2.drawString("O(0,0,0)", centerX + 8, centerY + 18);
		}

		public void BGDrawCube(Graphics2D g2, double[][] BGPoint, boolean BGIsTransformed) {
			int[][] BGEdge = {
					{ 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 0 },
					{ 4, 5 }, { 5, 6 }, { 6, 7 }, { 7, 4 },
					{ 0, 4 }, { 1, 5 }, { 2, 6 }, { 3, 7 }
			};

			char[] BGName = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
			g2.setStroke(new BasicStroke(2));

			for (int[] BGLine : BGEdge) {
				int BGFirst = BGLine[0];
				int BGSecond = BGLine[1];

				int X1 = BGScreenX(BGPoint[BGFirst][0], BGPoint[BGFirst][2]);
				int Y1 = BGScreenY(BGPoint[BGFirst][1], BGPoint[BGFirst][2]);

				int X2 = BGScreenX(BGPoint[BGSecond][0], BGPoint[BGSecond][2]);
				int Y2 = BGScreenY(BGPoint[BGSecond][1], BGPoint[BGSecond][2]);

				g2.drawLine(X1, Y1, X2, Y2);
			}

			for (int Bikram = 0; Bikram < 8; Bikram++) {
				int X = BGScreenX(BGPoint[Bikram][0], BGPoint[Bikram][2]);
				int Y = BGScreenY(BGPoint[Bikram][1], BGPoint[Bikram][2]);

				g2.fillOval(X - 4, Y - 4, 8, 8);

				String BGLabel = BGIsTransformed
						? BGName[Bikram] + "'"
						: String.valueOf(BGName[Bikram]);

				g2.drawString(BGLabel, X + 6, Y - 6);
			}
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;

			BGDrawAxes(g2);
			BGDrawCube(g2, BGOriginal, false);
			BGDrawCube(g2, BGTransformed, true);

			g2.drawString("Original Cube: A,B,C,D,E,F,G,H", 20, 30);
			g2.drawString("Transformed Cube: A',B',C',D',E',F',G',H'", 20, 55);
		}
	}
}