package CustomFunction;

import packageCircle.BGhelperPackage;
import java.util.ArrayList;

public class MidPoint_BgCustom {
	public static void main(String[] args) {
		int radius = BGhelperPackage.getRadius();

		int suru = 0;
		int antim = radius;
		int ashli = 1 - radius;

		ArrayList<int[]> gyawali = new ArrayList<>();
		System.out.println("\nCalculated Points:");

		while (suru <= antim) {
			int[][] butwal = {
					{ suru, antim },
					{ antim, suru },
					{ -suru, antim },
					{ -antim, suru },
					{ -suru, -antim },
					{ -antim, -suru },
					{ suru, -antim },
					{ antim, -suru }
			};

			for (int[] bghehe : butwal) {
				System.out.println("(" + bghehe[0] + "," + bghehe[1] + ")");
				gyawali.add(bghehe);
			}

			if (ashli < 0) {
				ashli = ashli + 2 * suru + 3;
			} else {
				ashli = ashli + 2 * (suru - antim) + 5;
				antim--;
			}

			suru++;
		}
		System.out.println("Circle drawing completed.");

		int[][] bghehe = new int[gyawali.size()][2];

		for (int nsuru = 0; nsuru < gyawali.size(); nsuru++) {
			bghehe[nsuru] = gyawali.get(nsuru);
		}

		BGhelperPackage.showCircle(bghehe, "Mid Point Circle Drawing With Bikram - Custom");
	}
}