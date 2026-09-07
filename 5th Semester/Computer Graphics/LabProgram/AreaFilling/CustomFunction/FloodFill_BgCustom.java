
package CustomFunction;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Stack;
import java.util.Scanner;
import packageAreaFilling.BGAreaFilling;

public class FloodFill_BgCustom {
	static void floodFill8(BufferedImage butwal, int bikramG, int gyawaliB, Color oldColor, Color newColor) {
		if (oldColor.getRGB() == newColor.getRGB()) {
			return;
		}

		Stack<Point> plapa = new Stack<>();
		plapa.push(new Point(bikramG, gyawaliB));
		int[] suruX = { -1, 0, 1, -1, 1, -1, 0, 1 };
		int[] suruY = { -1, -1, -1, 0, 0, 1, 1, 1 };

		while (!plapa.isEmpty()) {
			Point bikram = plapa.pop();
			int x = bikram.x;
			int y = bikram.y;

			if (BGAreaFilling.getPixelColor(butwal, x, y) == oldColor.getRGB()) {
				BGAreaFilling.setPixelColor(butwal, x, y, newColor);

				for (int gyawaliBi = 0; gyawaliBi < 8; gyawaliBi++) {
					int nextX = x + suruX[gyawaliBi];
					int nextY = y + suruY[gyawaliBi];

					if (BGAreaFilling.getPixelColor(butwal, nextX, nextY) == oldColor.getRGB()) {
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

		System.out.println("8 Connected Flood Fill With Bikram");
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
		floodFill8(butwal, seedX, seedY, Color.WHITE, Color.GREEN);
		System.out.println("antim filling.");
		System.out.println("Seed Point: (" + seedX + ", " + seedY + ")");
		System.out.println("Old Color: WHITE");
		System.out.println("New Color: GREEN");

		BGAreaFilling.showImage(butwal, "Bikram - 8 Connected Flood Fill");
		bikram.close();
	}
}
