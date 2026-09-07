package packageAreaFilling;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class BGAreaFilling {
	public static BufferedImage createImage(int bikramG, int gyawaliB) {
		BufferedImage butwal = new BufferedImage(bikramG, gyawaliB, BufferedImage.TYPE_INT_RGB);
		Graphics2D plapa = butwal.createGraphics();
		plapa.setColor(Color.WHITE);
		plapa.fillRect(0, 0, bikramG, gyawaliB);
		plapa.dispose();
		return butwal;
	}
	public static void drawBoundary(BufferedImage butwal, int suruX, int suruY, int antimX, int antimY) {
		Graphics2D bikram = butwal.createGraphics();
		bikram.setColor(Color.BLACK);
		bikram.drawRect(suruX, suruY, antimX - suruX, antimY - suruY);
		bikram.dispose();
	}
	public static int getPixelColor(BufferedImage butwal, int bikramG, int gyawaliB) {
		if (bikramG < 0 || bikramG >= butwal.getWidth() || gyawaliB < 0 || gyawaliB >= butwal.getHeight()) {
			return Color.BLACK.getRGB();
		}
		return butwal.getRGB(bikramG, gyawaliB);
	}
	public static void setPixelColor(BufferedImage butwal, int bikramG, int gyawaliB, Color plapa) {
		if (bikramG >= 0 && bikramG < butwal.getWidth() && gyawaliB >= 0 && gyawaliB < butwal.getHeight()) {
			butwal.setRGB(bikramG, gyawaliB, plapa.getRGB());
		}
	}
	public static void showImage(BufferedImage butwal, String bikram) {
		JFrame suru = new JFrame(bikram);
		suru.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		suru.add(new JPanel() {
			protected void paintComponent(Graphics gyawaliB) {
				super.paintComponent(gyawaliB);
				gyawaliB.drawImage(butwal, 0, 0, null);
			}
			public Dimension getPreferredSize() {
				return new Dimension(butwal.getWidth(), butwal.getHeight());
			}
		});
		suru.pack();
		suru.setLocationRelativeTo(null);
		suru.setVisible(true);
	}
}
