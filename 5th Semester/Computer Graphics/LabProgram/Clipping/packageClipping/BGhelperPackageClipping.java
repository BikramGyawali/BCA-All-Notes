package packageClipping;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class BGhelperPackageClipping {
	public double xmin, ymin, xmax, ymax;
	public double Xa, Ya, Xb, Yb;
	public int plapa;
	public void inputWindow(Scanner sa) {
		System.out.println("\nEnter Clipping Window Coordinates:");
		System.out.print("xmin enter garnu hos: ");
		xmin = sa.nextDouble();
		System.out.print("ymin enter garnu hos: ");
		ymin = sa.nextDouble();
		System.out.print("xmax enter garnu hos: ");
		xmax = sa.nextDouble();
		System.out.print("ymax enter garnu hos: ");
		ymax = sa.nextDouble();
	}
	public void inputPoint(Scanner sa) {
		System.out.print("\nNumber of Points enter garnu hos: ");
		plapa = sa.nextInt();
	}
	public double[][] inputPoints(Scanner sa) {
		double[][] bikramG = new double[plapa][2];
		for (int Bikram = 0; Bikram < plapa; Bikram++) {
			System.out.print("Point " + (Bikram + 1) + " X enter garnu hos: ");
			bikramG[Bikram][0] = sa.nextDouble();
			System.out.print("Point " + (Bikram + 1) + " Y enter garnu hos: ");
			bikramG[Bikram][1] = sa.nextDouble();
		}
		return bikramG;
	}
	public void inputLine(Scanner sa) {
		System.out.println("\nEnter Line Coordinates:");
		System.out.print("Suru X Coordinate enter garnu hos: ");
		Xa = sa.nextDouble();
		System.out.print("Suru Y Coordinate enter garnu hos: ");
		Ya = sa.nextDouble();
		System.out.print("Antim X Coordinate enter garnu hos: ");
		Xb = sa.nextDouble();
		System.out.print("Antim Y Coordinate enter garnu hos: ");
		Yb = sa.nextDouble();
	}
	public double[][] inputPolygon(Scanner sa) {
		System.out.print("\nNumber of Polygon Points enter garnu hos: ");
		plapa = sa.nextInt();
		double[][] gyawaliB = new double[plapa][2];
		for (int Bikram = 0; Bikram < plapa; Bikram++) {
			System.out.print("Point " + (Bikram + 1) + " X enter garnu hos: ");
			gyawaliB[Bikram][0] = sa.nextDouble();
			System.out.print("Point " + (Bikram + 1) + " Y enter garnu hos: ");
			gyawaliB[Bikram][1] = sa.nextDouble();
		}
		return gyawaliB;
	}
	public static void createFrame(String BGTitle, JPanel AshliPanel) {
		JFrame Bikram = new JFrame(BGTitle + " With Bikram");
		Bikram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Bikram.setSize(1100, 650);
		Bikram.setLocationRelativeTo(null);
		Bikram.add(AshliPanel);
		Bikram.setVisible(true);
	}
	public static int BGScreenX(double x, double scale, int width) {
		return (int) Math.round(width / 2 + x * scale);
	}
	public static int BGScreenY(double y, double scale, int height) {
		return (int) Math.round(height / 2 - y * scale);
	}
	public static void BGDrawAxes(Graphics2D g2, JPanel panel, double scale) {
		int centerX = panel.getWidth() / 2;
		int centerY = panel.getHeight() / 2;
		g2.drawLine(0, centerY, panel.getWidth(), centerY);
		g2.drawLine(centerX, 0, centerX, panel.getHeight());
		g2.drawString("X-Axis", panel.getWidth() - 60, centerY - 8);
		g2.drawString("Y-Axis", centerX + 8, 20);
		g2.drawString("O(0,0)", centerX + 8, centerY + 18);
	}
	public static void BGDrawWindow(Graphics2D g2, double xmin, double ymin, double xmax, double ymax, JPanel panel,
			double scale) {
		int X1 = BGScreenX(xmin, scale, panel.getWidth());
		int Y1 = BGScreenY(ymax, scale, panel.getHeight());
		int X2 = BGScreenX(xmax, scale, panel.getWidth());
		int Y2 = BGScreenY(ymin, scale, panel.getHeight());
		g2.drawRect(X1, Y1, X2 - X1, Y2 - Y1);
		g2.drawString("Clipping Window", X1, Y1 - 8);
	}
	public static class TwoBoxPanel extends JPanel {
		protected double xmin, ymin, xmax, ymax;
		protected double scale = 22;
		public TwoBoxPanel(double xmin, double ymin, double xmax, double ymax) {
			this.xmin = xmin;
			this.ymin = ymin;
			this.xmax = xmax;
			this.ymax = ymax;
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			int half = getWidth() / 2;
			g2.drawLine(half, 0, half, getHeight());
			g2.drawString("BEFORE CLIPPING", half / 2 - 65, 25);
			g2.drawString("AFTER CLIPPING", half + half / 2 - 60, 25);
		}
		protected void BGBeforeAxes(Graphics2D g2, int width) {
			int centerX = width / 2;
			int centerY = getHeight() / 2;
			g2.drawLine(0, centerY, width, centerY);
			g2.drawLine(centerX, 0, centerX, getHeight());
			g2.drawString("X-Axis", width - 55, centerY - 8);
			g2.drawString("Y-Axis", centerX + 8, 20);
			g2.drawString("O(0,0)", centerX + 8, centerY + 18);
		}
		protected int BGX(double x, int boxWidth) {
			return BGScreenX(x, scale, boxWidth);
		}
		protected int BGY(double y) {
			return BGScreenY(y, scale, getHeight());
		}
		protected void BGWindow(Graphics2D g2, int offset, int boxWidth) {
			int X1 = offset + BGX(xmin, boxWidth);
			int Y1 = BGY(ymax);
			int X2 = offset + BGX(xmax, boxWidth);
			int Y2 = BGY(ymin);
			g2.drawRect(X1, Y1, X2 - X1, Y2 - Y1);
			g2.drawString("Clipping Window", X1, Y1 - 8);
		}
	}
	public static class PointPanel extends TwoBoxPanel {
		private double[][] BGOriginal;
		private double[][] BGClipped;
		public PointPanel(double xmin, double ymin, double xmax, double ymax, double[][] BGOriginal,double[][] BGClipped) {
			super(xmin, ymin, xmax, ymax);
			this.BGOriginal = BGOriginal;
			this.BGClipped = BGClipped;
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			int half = getWidth() / 2;
			int boxWidth = half - 10;
			BGBeforeAxes(g2, boxWidth);
			BGWindow(g2, 0, boxWidth);
			BGWindow(g2, half, boxWidth);
			for (int Bikram = 0; Bikram < BGOriginal.length; Bikram++) {
				int X = BGX(BGOriginal[Bikram][0], boxWidth);
				int Y = BGY(BGOriginal[Bikram][1]);
				g2.fillOval(X - 4, Y - 4, 8, 8);
				g2.drawString("P" + (Bikram + 1) + " (" + BGOriginal[Bikram][0] + "," + BGOriginal[Bikram][1] + ")",X + 6, Y - 6);
			}
			for (int Bikram = 0; Bikram < BGClipped.length; Bikram++) {
				int X = half + BGX(BGClipped[Bikram][0], boxWidth);
				int Y = BGY(BGClipped[Bikram][1]);
				g2.fillOval(X - 4, Y - 4, 8, 8);
				g2.drawString("P" + (Bikram + 1) + " (" + BGClipped[Bikram][0] + "," + BGClipped[Bikram][1] + ")",X + 6, Y - 6);
			}
		}
	}
	public static class LinePanel extends TwoBoxPanel {
		private double Xa, Ya, Xb, Yb;
		private double[] BGClipped;
		public LinePanel(double xmin, double ymin, double xmax, double ymax, double Xa, double Ya, double Xb, double Yb,double[] BGClipped) {
			super(xmin, ymin, xmax, ymax);
			this.Xa = Xa;
			this.Ya = Ya;
			this.Xb = Xb;
			this.Yb = Yb;
			this.BGClipped = BGClipped;
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			int half = getWidth() / 2;
			int boxWidth = half - 10;
			BGBeforeAxes(g2, boxWidth);
			BGWindow(g2, 0, boxWidth);
			BGWindow(g2, half, boxWidth);
			int SX = BGX(Xa, boxWidth);
			int SY = BGY(Ya);
			int EX = BGX(Xb, boxWidth);
			int EY = BGY(Yb);
			g2.drawLine(SX, SY, EX, EY);
			g2.drawString("Suru (" + Xa + "," + Ya + ")", SX + 8, SY + 20);
			g2.drawString("Antim (" + Xb + "," + Yb + ")", EX + 8, EY - 8);
			if (BGClipped != null) {
				int CX1 = half + BGX(BGClipped[0], boxWidth);
				int CY1 = BGY(BGClipped[1]);
				int CX2 = half + BGX(BGClipped[2], boxWidth);
				int CY2 = BGY(BGClipped[3]);
				g2.drawLine(CX1, CY1, CX2, CY2);
				g2.drawString("Suru (" + BGClipped[0] + "," + BGClipped[1] + ")", CX1 + 8, CY1 + 20);
				g2.drawString("Antim (" + BGClipped[2] + "," + BGClipped[3] + ")", CX2 + 8, CY2 - 8);
			}
		}
	}
	public static class PolygonPanel extends TwoBoxPanel {
		private double[][] BGOriginal;
		private double[][] BGClipped;
		public PolygonPanel(double xmin, double ymin, double xmax, double ymax, double[][] BGOriginal,
				double[][] BGClipped) {
			super(xmin, ymin, xmax, ymax);
			this.BGOriginal = BGOriginal;
			this.BGClipped = BGClipped;
		}
		private void BGDrawPolygon(Graphics2D g2, double[][] points, int offset, int boxWidth) {
			if (points == null || points.length == 0)
				return;
			for (int Bikram = 0; Bikram < points.length; Bikram++) {
				int Antim = (Bikram + 1) % points.length;
				int X1 = offset + BGX(points[Bikram][0], boxWidth);
				int Y1 = BGY(points[Bikram][1]);
				int X2 = offset + BGX(points[Antim][0], boxWidth);
				int Y2 = BGY(points[Antim][1]);
				g2.drawLine(X1, Y1, X2, Y2);
				g2.fillOval(X1 - 3, Y1 - 3, 6, 6);
				g2.drawString("P" + (Bikram + 1), X1 + 6, Y1 - 6);
			}
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			int half = getWidth() / 2;
			int boxWidth = half - 10;
			BGBeforeAxes(g2, boxWidth);
			BGWindow(g2, 0, boxWidth);
			BGWindow(g2, half, boxWidth);
			BGDrawPolygon(g2, BGOriginal, 0, boxWidth);
			BGDrawPolygon(g2, BGClipped, half, boxWidth);
		}
	}
}