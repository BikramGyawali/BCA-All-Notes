package packageEllipse;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class BGhelperPackage {
	public static Scanner suru = new Scanner(System.in);

	public static int getCenterX() {
		System.out.print("Enter center X: ");
		return suru.nextInt();
	}

	public static int getCenterY() {
		System.out.print("Enter center Y: ");
		return suru.nextInt();
	}

	public static int getXRadius() {
		System.out.print("Enter X radius: ");
		return suru.nextInt();
	}

	public static int getYRadius() {
		System.out.print("Enter Y radius: ");
		return suru.nextInt();
	}

	public static void showEllipse(int[][] gyawali, String butwal) {
		JFrame antim = new JFrame(butwal);
		antim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		antim.setSize(700, 700);
		antim.setLocationRelativeTo(null);
		antim.add(new EllipsePanel(gyawali));
		antim.setVisible(true);
	}

	public static void showLibraryEllipse(int Xc, int Yc, int rx, int ry, String butwal) {
		JFrame antim = new JFrame(butwal);
		antim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		antim.setSize(700, 700);
		antim.setLocationRelativeTo(null);
		antim.add(new LibraryEllipsePanel(Xc, Yc, rx, ry));
		antim.setVisible(true);
	}

	static class EllipsePanel extends JPanel {
		private int[][] gyawali;

		public EllipsePanel(int[][] gyawali) {
			this.gyawali = gyawali;
		}

		@Override
		protected void paintComponent(Graphics ashli) {
			super.paintComponent(ashli);
			int suru = getWidth() / 2;
			int antim = getHeight() / 2;
			ashli.drawLine(0, antim, getWidth(), antim);
			ashli.drawLine(suru, 0, suru, getHeight());
			for (int[] butwal : gyawali) {
				int x = suru + butwal[0];
				int y = antim - butwal[1];
				ashli.fillRect(x, y, 1, 1);
			}
			ashli.drawString("X Axis", getWidth() - 60, antim - 5);
			ashli.drawString("Y Axis", suru + 5, 20);
		}
	}

	static class LibraryEllipsePanel extends JPanel {
		private int Xc;
		private int Yc;
		private int rx;
		private int ry;

		public LibraryEllipsePanel(int Xc, int Yc, int rx, int ry) {
			this.Xc = Xc;
			this.Yc = Yc;
			this.rx = rx;
			this.ry = ry;
		}

		@Override
		protected void paintComponent(Graphics ashli) {
			super.paintComponent(ashli);
			int suru = getWidth() / 2;
			int antim = getHeight() / 2;
			ashli.drawLine(0, antim, getWidth(), antim);
			ashli.drawLine(suru, 0, suru, getHeight());
			int centerX = suru + Xc;
			int centerY = antim - Yc;
			ashli.drawOval(centerX - rx, centerY - ry, 2 * rx, 2 * ry);
			ashli.drawString("X Axis", getWidth() - 60, antim - 5);
			ashli.drawString("Y Axis", suru + 5, 20);
		}
	}
}