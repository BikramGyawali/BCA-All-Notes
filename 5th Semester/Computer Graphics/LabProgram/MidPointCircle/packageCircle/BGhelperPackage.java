package packageCircle;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class BGhelperPackage {
	public static Scanner suru = new Scanner(System.in);
	public static int getRadius() {
		System.out.print("Enter radius: ");
		return suru.nextInt();
	}

	public static void showCircle(int[][] gyawali, String butwal) {
		JFrame antim = new JFrame(butwal);
		antim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		antim.setSize(700, 700);
		antim.setLocationRelativeTo(null);
		antim.add(new CirclePanel(gyawali));
		antim.setVisible(true);
	}

	public static void showLibraryCircle(int radius, String butwal) {
		JFrame antim = new JFrame(butwal);
		antim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		antim.setSize(700, 700);
		antim.setLocationRelativeTo(null);
		antim.add(new LibraryCirclePanel(radius));
		antim.setVisible(true);
	}

	static class CirclePanel extends JPanel {
		private int[][] gyawali;
		public CirclePanel(int[][] gyawali) {
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

	static class LibraryCirclePanel extends JPanel {
		private int radius;
		public LibraryCirclePanel(int radius) {
			this.radius = radius;
		}

		@Override
		protected void paintComponent(Graphics ashli) {
			super.paintComponent(ashli);

			int suru = getWidth() / 2;
			int antim = getHeight() / 2;
			ashli.drawLine(0, antim, getWidth(), antim);
			ashli.drawLine(suru, 0, suru, getHeight());
			ashli.drawOval(suru - radius, antim - radius, 2 * radius, 2 * radius);
			ashli.drawString("X Axis", getWidth() - 60, antim - 5);
			ashli.drawString("Y Axis", suru + 5, 20);
		}
	}
}