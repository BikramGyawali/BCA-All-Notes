
import java.util.Scanner;

public class SSTNdiskBg {
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
		boolean visited[] = new boolean[binti];
		int totalHeadMovement = 0;
		int ailekoPosition = suruPosition;
		System.out.println("Disk head movements:");
		for (int m = 0; m < binti; m++) {
			int thoriiDistance = Integer.MAX_VALUE;
			int index = -1;
			for (int j = 0; j < binti; j++) {
				if (!visited[j]) {
					int distance = Math.abs(ailekoPosition - requests[j]);
					if (distance < thoriiDistance) {
						thoriiDistance = distance;
						index = j;
					}
				}
			}
			visited[index] = true;
			System.out.println("Moving From " + ailekoPosition + " to " + requests[index]);
			totalHeadMovement += thoriiDistance;
			ailekoPosition = requests[index];
		}
		System.out.println("Total head movement is: " + totalHeadMovement);
	}
}
