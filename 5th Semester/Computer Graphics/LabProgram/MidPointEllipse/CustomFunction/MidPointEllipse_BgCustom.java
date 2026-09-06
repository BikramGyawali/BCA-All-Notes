package CustomFunction;

import packageEllipse.BGhelperPackage;
import java.util.ArrayList;

public class MidPointEllipse_BgCustom {
	public static void main(String[] args) {
		int Xc = BGhelperPackage.getCenterX();
		int Yc = BGhelperPackage.getCenterY();
		int rx = BGhelperPackage.getXRadius();
		int ry = BGhelperPackage.getYRadius();

		ArrayList<int[]> gyawali = new ArrayList<>();

		int suru = 0;
		int antim = ry;

		double ashli = (double) (ry * ry) - (double) (rx * rx) * ry + (double) (rx * rx) / 4;

		double rx2 = (double) rx * rx;
		double ry2 = (double) ry * ry;

		System.out.println("\nCalculated Points With Bikram:");

		while (2 * ry2 * suru < 2 * rx2 * antim) {
			int[][] butwal = {
					{ Xc + suru, Yc + antim },
					{ Xc - suru, Yc + antim },
					{ Xc + suru, Yc - antim },
					{ Xc - suru, Yc - antim }
			};

			for (int[] bghehe : butwal) {
				System.out.println("(" + bghehe[0] + "," + bghehe[1] + ")");
				gyawali.add(bghehe);
			}

			if (ashli < 0) {
				suru++;
				ashli = ashli + 2 * ry2 * suru + ry2;
			} else {
				suru++;
				antim--;
				ashli = ashli + 2 * ry2 * suru - 2 * rx2 * antim + ry2;
			}
		}

		double butwalDecision = ry2 * (suru + 0.5) * (suru + 0.5)
				+ rx2 * (antim - 1) * (antim - 1)
				- rx2 * ry2;

		while (antim >= 0) {
			int[][] bghehe = {
					{ Xc + suru, Yc + antim },
					{ Xc - suru, Yc + antim },
					{ Xc + suru, Yc - antim },
					{ Xc - suru, Yc - antim }
			};

			for (int[] ashliPoint : bghehe) {
				System.out.println("(" + ashliPoint[0] + "," + ashliPoint[1] + ")");
				gyawali.add(ashliPoint);
			}

			if (butwalDecision > 0) {
				antim--;
				butwalDecision = butwalDecision - 2 * rx2 * antim + rx2;
			} else {
				suru++;
				antim--;
				butwalDecision = butwalDecision + 2 * ry2 * suru - 2 * rx2 * antim + rx2;
			}
		}
		int[][] bghehe = new int[gyawali.size()][2];

		for (int suruIndex = 0; suruIndex < gyawali.size(); suruIndex++) {
			bghehe[suruIndex] = gyawali.get(suruIndex);
		}
		BGhelperPackage.showEllipse(bghehe, "Mid Point Ellipse Drawing With Bikram- Custom");
	}
}