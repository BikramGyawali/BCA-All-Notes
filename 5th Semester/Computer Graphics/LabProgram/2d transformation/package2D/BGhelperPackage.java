package package2D;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class BGhelperPackage {
	public int Xa, Ya;
	public int Xb, Yb;
	public int Xc, Yc;

	public void inputCoordinate(Scanner sa) {
		System.out.println("\nEnter Coordinate of Point A");
		System.out.print("First X Coordinate dinu hos : ");
		Xa = sa.nextInt();
		System.out.print("First Y Coordinate dinu hos : ");
		Ya = sa.nextInt();
		System.out.println("\nEnter Coordinate of Point B");
		System.out.print("Second X Coordinate dinu hos : ");
		Xb = sa.nextInt();
		System.out.print("Second Y Coordinate dinu hos : ");
		Yb = sa.nextInt();
		System.out.println("\nEnter Coordinate of Point C");
		System.out.print("Third X Coordinate dinu hos : ");
		Xc = sa.nextInt();
		System.out.print("Third Y Coordinate dinu hos : ");
		Yc = sa.nextInt();
	}

	public static void createFrame(String title, JPanel Panel) {
		JFrame BGF = new JFrame(title);
		BGF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BGF.setSize(900, 700);
		BGF.setLocationRelativeTo(null);
		BGF.add(Panel);
		BGF.setVisible(true);
	}

	public static int screenX(int xCoordinateBG, JPanel AshliPanel) {
		return AshliPanel.getWidth() / 2 + xCoordinateBG;
	}

	public static int screenY(int yCoordinateBG, JPanel AshliPanel) {
		return AshliPanel.getHeight() / 2 - yCoordinateBG;
	}

	public static void drawAxis(Graphics g, JPanel AshliPanel) {
		int centerXBG = AshliPanel.getWidth() / 2;
		int centerYBG = AshliPanel.getHeight() / 2;

		g.drawLine(0, centerYBG, AshliPanel.getWidth(), centerYBG);
		g.drawLine(centerXBG, 0, centerXBG, AshliPanel.getHeight());

		g.drawString("+X", AshliPanel.getWidth() - 35, centerYBG - 5);
		g.drawString("-X", 10, centerYBG - 5);
		g.drawString("+Y", centerXBG + 5, 20);
		g.drawString("-Y", centerXBG + 5, AshliPanel.getHeight() - 10);
		g.drawString("O(0,0)", centerXBG + 5, centerYBG + 15);
	}

	public static void BGDrawLine(Graphics g, JPanel AshliPanel, int Xa, int Ya, int Xb, int Yb) {

		int screenXaBG = screenX(Xa, AshliPanel);
		int screenYaBG = screenY(Ya, AshliPanel);
		int screenXbBG = screenX(Xb, AshliPanel);
		int screenYbBG = screenY(Yb, AshliPanel);
		int dxBG = screenXbBG - screenXaBG;
		int dyBG = screenYbBG - screenYaBG;
		int stepsBG = Math.max(Math.abs(dxBG), Math.abs(dyBG));

		if (stepsBG == 0) {
			g.fillRect(screenXaBG, screenYaBG, 3, 3);
			return;
		}

		float xIncrementBG = (float) dxBG / stepsBG;
		float yIncrementBG = (float) dyBG / stepsBG;
		float currentXBG = screenXaBG;
		float currentYBG = screenYaBG;
		for (int Bikram = 0; Bikram <= stepsBG; Bikram++) {
			g.fillRect(Math.round(currentXBG), Math.round(currentYBG), 2, 2);
			currentXBG = currentXBG + xIncrementBG;
			currentYBG = currentYBG + yIncrementBG;
		}
	}

	public static void drawPointName(Graphics g, JPanel AshliPanel,
			String pointNameBG, int xCoordinateBG, int yCoordinateBG) {

		int screenXBG = screenX(xCoordinateBG, AshliPanel);
		int screenYBG = screenY(yCoordinateBG, AshliPanel);

		g.drawString(
				pointNameBG + "(" + xCoordinateBG + "," + yCoordinateBG + ")", screenXBG + 5, screenYBG - 5);
	}

	public static class CustomPanel extends JPanel {

		private int Xa, Ya;
		private int Xb, Yb;
		private int Xc, Yc;

		private int Xa_Naya, Ya_Naya;
		private int Xb_Naya, Yb_Naya;
		private int Xc_Naya, Yc_Naya;

		public CustomPanel(

				int Xa, int Ya,
				int Xb, int Yb,
				int Xc, int Yc,

				int Xa_Naya, int Ya_Naya,
				int Xb_Naya, int Yb_Naya,
				int Xc_Naya, int Yc_Naya) {

			this.Xa = Xa;
			this.Ya = Ya;

			this.Xb = Xb;
			this.Yb = Yb;

			this.Xc = Xc;
			this.Yc = Yc;

			this.Xa_Naya = Xa_Naya;
			this.Ya_Naya = Ya_Naya;

			this.Xb_Naya = Xb_Naya;
			this.Yb_Naya = Yb_Naya;

			this.Xc_Naya = Xc_Naya;
			this.Yc_Naya = Yc_Naya;
		}

		@Override
		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			drawAxis(g, this);

			BGDrawLine(g, this, Xa, Ya, Xb, Yb);
			BGDrawLine(g, this, Xb, Yb, Xc, Yc);
			BGDrawLine(g, this, Xc, Yc, Xa, Ya);

			drawPointName(g, this, "A", Xa, Ya);
			drawPointName(g, this, "B", Xb, Yb);
			drawPointName(g, this, "C", Xc, Yc);

			BGDrawLine(g, this, Xa_Naya, Ya_Naya, Xb_Naya, Yb_Naya);
			BGDrawLine(g, this, Xb_Naya, Yb_Naya, Xc_Naya, Yc_Naya);
			BGDrawLine(g, this, Xc_Naya, Yc_Naya, Xa_Naya, Ya_Naya);

			drawPointName(g, this, "A'", Xa_Naya, Ya_Naya);
			drawPointName(g, this, "B'", Xb_Naya, Yb_Naya);
			drawPointName(g, this, "C'", Xc_Naya, Yc_Naya);
		}
	}
}
