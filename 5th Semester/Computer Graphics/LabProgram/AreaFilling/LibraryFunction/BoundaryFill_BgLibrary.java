package LibraryFunction;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;
import packageAreaFilling.BGAreaFilling;

public class BoundaryFill_BgLibrary {
	public static void main(String[] args) {
		Scanner bikram = new Scanner(System.in);
		int canvasWidth = 600;
		int canvasHeight = 450;
		System.out.println(" Library Boundary Fill With Bikram");
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

		Graphics2D gyawaliB = butwal.createGraphics();
		gyawaliB.setColor(Color.RED);
		gyawaliB.fillRect(suruX + 1, suruY + 1, antimX - suruX - 1, antimY - suruY - 1);
		gyawaliB.setColor(Color.BLACK);
		gyawaliB.drawRect(suruX, suruY, antimX - suruX, antimY - suruY);
		gyawaliB.dispose();

		System.out.println("suru library filling...");
		System.out.println("antim library filling.");
		System.out.println("Seed Point: (" + seedX + ", " + seedY + ")");
		System.out.println("Library Fill Color: RED");

		BGAreaFilling.showImage(butwal, "Bikram - Library Boundary Fill");
		bikram.close();
	}
}
