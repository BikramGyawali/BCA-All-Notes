import java.util.Arrays;
import java.util.Scanner;

public class LookDSBG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of requests:");
		int binti = sc.nextInt();
		int requests[] = new int[binti];
		System.out.println("Enter the disk sequence:");
		for (int b = 0; b < binti; b++) {
			requests[b] = sc.nextInt();
		}
		System.out.println("Enter the initial head position:");
		int suruPosition = sc.nextInt();

		System.out.println("Enter the direction (0 for left and 1 for right):");
		int direction = sc.nextInt();
		Arrays.sort(requests);
		int totalHeadMovement = 0;
		int ailekoPosition = suruPosition;
		System.out.println("Disk head movements:");

		if (direction == 1) {
			for (int j = 0; j < binti; j++) {
				if (requests[j] >= suruPosition) {
					System.out.println("Moving From " + ailekoPosition + " to " + requests[j]);
					totalHeadMovement += Math.abs(ailekoPosition - requests[j]);
					ailekoPosition = requests[j];
				}
			}

			for (int k = binti - 1; k >= 0; k--) {
				if (requests[k] < suruPosition) {
					System.out.println("Moving From " + ailekoPosition + " to " + requests[k]);
					totalHeadMovement += Math.abs(ailekoPosition - requests[k]);
					ailekoPosition = requests[k];
				}
			}
		} else {
			for (int j = binti - 1; j >= 0; j--) {
				if (requests[j] <= suruPosition) {
					System.out.println("Moving From " + ailekoPosition + " to " + requests[j]);
					totalHeadMovement += Math.abs(ailekoPosition - requests[j]);
					ailekoPosition = requests[j];
				}
			}

			for (int k = 0; k < binti; k++) {
				if (requests[k] > suruPosition) {
					System.out.println("Moving From " + ailekoPosition + " to " + requests[k]);
					totalHeadMovement += Math.abs(ailekoPosition - requests[k]);
					ailekoPosition = requests[k];
				}
			}
		}
		System.out.println("Total head movement: " + totalHeadMovement);
		sc.close();
	}
}
