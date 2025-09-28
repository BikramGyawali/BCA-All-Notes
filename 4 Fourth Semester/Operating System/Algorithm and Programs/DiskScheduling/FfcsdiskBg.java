
import java.util.Scanner;

public class FfcsdiskBg {
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
		int totalHeadMovement = 0;
		int ailekoPosition = suruPosition;
		System.out.println("Disk head movements:");
		for (int m = 0; m < binti; m++) {
			System.out.println("Moving From " + ailekoPosition + " to " + requests[m]);
			totalHeadMovement += Math.abs(ailekoPosition - requests[m]);
			ailekoPosition = requests[m];
		}
		System.out.println("Total head movement is: " + totalHeadMovement);
	}
}
