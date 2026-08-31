package package3D;

public class BGhelper3DLibrary {

	public static double[][] BGIdentityMatrix() {
		return new double[][] {
				{ 1, 0, 0, 0 },
				{ 0, 1, 0, 0 },
				{ 0, 0, 1, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGTranslationMatrix(double Tx, double Ty, double Tz) {
		return new double[][] {
				{ 1, 0, 0, Tx },
				{ 0, 1, 0, Ty },
				{ 0, 0, 1, Tz },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGScalingMatrix(double Sx, double Sy, double Sz) {
		return new double[][] {
				{ Sx, 0, 0, 0 },
				{ 0, Sy, 0, 0 },
				{ 0, 0, Sz, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGRotationXMatrix(double BGAngle) {
		double BGRadian = Math.toRadians(BGAngle);
		double BGCos = Math.cos(BGRadian);
		double BGSin = Math.sin(BGRadian);

		return new double[][] {
				{ 1, 0, 0, 0 },
				{ 0, BGCos, -BGSin, 0 },
				{ 0, BGSin, BGCos, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGRotationYMatrix(double BGAngle) {
		double BGRadian = Math.toRadians(BGAngle);
		double BGCos = Math.cos(BGRadian);
		double BGSin = Math.sin(BGRadian);

		return new double[][] {
				{ BGCos, 0, BGSin, 0 },
				{ 0, 1, 0, 0 },
				{ -BGSin, 0, BGCos, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGRotationZMatrix(double BGAngle) {
		double BGRadian = Math.toRadians(BGAngle);
		double BGCos = Math.cos(BGRadian);
		double BGSin = Math.sin(BGRadian);

		return new double[][] {
				{ BGCos, -BGSin, 0, 0 },
				{ BGSin, BGCos, 0, 0 },
				{ 0, 0, 1, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGReflectionZXMatrix() {
		return new double[][] {
				{ 1, 0, 0, 0 },
				{ 0, -1, 0, 0 },
				{ 0, 0, 1, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGReflectionYZMatrix() {
		return new double[][] {
				{ -1, 0, 0, 0 },
				{ 0, 1, 0, 0 },
				{ 0, 0, 1, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGReflectionXYMatrix() {
		return new double[][] {
				{ 1, 0, 0, 0 },
				{ 0, 1, 0, 0 },
				{ 0, 0, -1, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGShearingXMatrix(double b, double c) {
		return new double[][] {
				{ 1, 0, 0, 0 },
				{ b, 1, 0, 0 },
				{ c, 0, 1, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGShearingYMatrix(double a, double c) {
		return new double[][] {
				{ 1, a, 0, 0 },
				{ 0, 1, 0, 0 },
				{ 0, c, 1, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGShearingZMatrix(double a, double b) {
		return new double[][] {
				{ 1, 0, a, 0 },
				{ 0, 1, b, 0 },
				{ 0, 0, 1, 0 },
				{ 0, 0, 0, 1 }
		};
	}

	public static double[][] BGMultiplyMatrix(double[][] BGFirst, double[][] BGSecond) {
		double[][] BGResult = new double[4][4];

		for (int Bikram = 0; Bikram < 4; Bikram++) {
			for (int Gyawali = 0; Gyawali < 4; Gyawali++) {
				for (int Ashli = 0; Ashli < 4; Ashli++) {
					BGResult[Bikram][Gyawali] += BGFirst[Bikram][Ashli] * BGSecond[Ashli][Gyawali];
				}
			}
		}

		return BGResult;
	}

	public static double[][] BGApplyMatrix(double[][] BGPoint, double[][] BGMatrix) {
		double[][] BGTransformed = new double[8][3];

		for (int Bikram = 0; Bikram < 8; Bikram++) {
			double[] BGCoordinate = {
					BGPoint[Bikram][0],
					BGPoint[Bikram][1],
					BGPoint[Bikram][2],
					1
			};

			double[] BGNaya = new double[4];

			for (int Gyawali = 0; Gyawali < 4; Gyawali++) {
				for (int Ashli = 0; Ashli < 4; Ashli++) {
					BGNaya[Gyawali] += BGMatrix[Gyawali][Ashli] * BGCoordinate[Ashli];
				}
			}

			BGTransformed[Bikram][0] = BGNaya[0];
			BGTransformed[Bikram][1] = BGNaya[1];
			BGTransformed[Bikram][2] = BGNaya[2];
		}

		return BGTransformed;
	}
}