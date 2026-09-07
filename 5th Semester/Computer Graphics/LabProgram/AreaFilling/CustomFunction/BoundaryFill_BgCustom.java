package CustomFunction;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Stack;
import java.util.Scanner;
import packageAreaFilling.BGAreaFilling;

public class BoundaryFill_BgCustom {
	static void boundaryFill8(BufferedImage butwal, int bikramG, int gyawaliB, Color boundaryColor, Color fillColor) {
		Stack<Point> plapa = new Stack<>();
		plapa.push(new Point(bikramG, gyawaliB));
		int[] suruX = { -1, 0, 1, -1, 1, -1, 0, 1 };
		int[] suruY = { -1, -1, -1, 0, 0, 1, 1, 1 };
		while (!plapa.isEmpty()) {
			Point bikram = plapa.pop();
			int x = bikram.x;
			int y = bikram.y;
			int currentColor = BGAreaFilling.getPixelColor(butwal, x, y);
			if (currentColor != boundaryColor.getRGB() && currentColor != fillColor.getRGB()) {
				BGAreaFilling.setPixelColor(butwal, x, y, fillColor);
				for (int bikramgg = 0; bikramgg < 8; bikramgg++) {
					int nextX = x + suruX[bikramgg];
					int nextY = y + suruY[bikramgg];
					int nextColor = BGAreaFilling.getPixelColor(butwal, nextX, nextY);
					if (nextColor != boundaryColor.getRGB() && nextColor != fillColor.getRGB()) {
						plapa.push(new Point(nextX, nextY));
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner bikram = new Scanner(System.in);
		int canvasWidth = 600;
		int canvasHeight = 450;
		System.out.println("8 Connected Boundary Fill With Bikram");
		System.out.print("Enter garnu hos suru X: ");
		int suruX = bikram.nextInt();
		System.out.print("Enter garnu hos suru Y: ");
		int suruY = bikram.nextInt();
		System.out.print("Enter garnu hos antim X: ");
		int antimX = bikram.nextInt();
		System.out.print("Enter garnu hos antim Y: ");
		int antimY = bikram.nextInt();
		System.out.print("Enter garnu hos seed X: ");
		int seedX = bikram.nextInt();
		System.out.print("Enter garnu hos seed Y: ");
		int seedY = bikram.nextInt();
		BufferedImage butwal = BGAreaFilling.createImage(canvasWidth, canvasHeight);
		BGAreaFilling.drawBoundary(butwal, suruX, suruY, antimX, antimY);
		System.out.println("suru filling...");
		boundaryFill8(butwal, seedX, seedY, Color.BLACK, Color.RED);
		System.out.println("antim filling.");
		System.out.println("Seed Point: (" + seedX + ", " + seedY + ")");
		System.out.println("Fill Color: RED");
		BGAreaFilling.showImage(butwal, "Bikram - 8 Connected Boundary Fill");
		bikram.close();
	}
}
