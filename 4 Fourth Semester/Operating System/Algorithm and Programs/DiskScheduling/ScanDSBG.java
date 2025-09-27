import java.util.Arrays;
import java.util.Scanner;

public class ScanDSBG{
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
		System.out.println("Enter total number of disks");
		int totalDisks=sc.nextInt();
		System.out.println("Enter the direction (0 for left and 1 for right):");
		int direction = sc.nextInt();
		Arrays.sort(requests)
		boolean visited[] = new boolean[binti];
		int totalHeadMovement = 0;
		int ailekoPosition = suruPosition;
		System.out.println("Disk head movements:");
	}
}