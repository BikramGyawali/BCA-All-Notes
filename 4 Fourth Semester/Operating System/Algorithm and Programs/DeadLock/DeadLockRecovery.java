import java.util.Scanner;

public class DeadLockRecovery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of processes");
		int processNum = sc.nextInt();
		System.out.println("Enter the number of resources");
		int resourceNum = sc.nextInt();

		int[][] allocation = new int[processNum][resourceNum];
		int[][] chiyeko = new int[processNum][resourceNum];
		int[] vako = new int[resourceNum];
		boolean[] visited = new boolean[processNum];

		System.out.println("Enter the allocation matrix");
		for (int i = 0; i < processNum; i++) {
			for (int j = 0; j < resourceNum; j++) {
				allocation[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the request resources");
		for (int i = 0; i < processNum; i++) {
			for (int j = 0; j < resourceNum; j++) {
				chiyeko[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the available resources");
		for (int i = 0; i < resourceNum; i++) {
			vako[i] = sc.nextInt();
		}

		boolean deadlockExists = isDeadlock(allocation, chiyeko, vako, visited, processNum, resourceNum);

		if (deadlockExists) {
			System.out.println("\nDeadlock Detected!");
			System.out.println("Starting Recovery Process...\n");
			boolean[] visited2 = new boolean[processNum];
			deadlockrecovery(allocation, chiyeko, vako, visited2, processNum, resourceNum);
		} else {
			System.out.println("\nNo Deadlock.  System is Safe.");
		}
	}

	public static boolean isDeadlock(int[][] allocation, int[][] chiyeko, int[] vako, boolean[] visited,
			int processNum, int resourceNum) {
		int c = 0;
		int[] vakoTemp = new int[resourceNum];
		for (int i = 0; i < resourceNum; i++) {
			vakoTemp[i] = vako[i];
		}

		while (c < processNum) {
			boolean vitiyo = false;
			for (int i = 0; i < processNum; i++) {
				if (visited[i] == false) {
					int j;
					for (j = 0; j < resourceNum; j++) {
						if (chiyeko[i][j] > vakoTemp[j]) {
							break;
						}
					}
					if (j == resourceNum) {
						for (int k = 0; k < resourceNum; k++) {
							vakoTemp[k] += allocation[i][k];
						}
						visited[i] = true;
						vitiyo = true;
						c++;
					}
				}
			}
			if (!vitiyo) {
				return true;
			}
		}
		return false;
	}

	public static void deadlockrecovery(int[][] allocation, int[][] chiyeko, int[] vako, boolean[] visited,
			int processNum, int resourceNum) {
		int c = 0;
		int terminatedCount = 0;

		while (c < processNum) {
			boolean vitiyo = false;
			for (int i = 0; i < processNum; i++) {
				if (visited[i] == false) {
					int j;
					for (j = 0; j < resourceNum; j++) {
						if (chiyeko[i][j] > vako[j]) {
							break;
						}
					}
					if (j == resourceNum) {
						for (int k = 0; k < resourceNum; k++) {
							vako[k] += allocation[i][k];
						}
						visited[i] = true;
						vitiyo = true;
						c++;
						terminatedCount++;
						System.out.println("Process " + i + " is terminated to recover from deadlock.");
					}
				}
			}
			if (!vitiyo) {
				for (int i = 0; i < processNum; i++) {
					if (visited[i] == false) {
						System.out.println("Process " + i + " is terminated to recover from deadlock.");
						for (int k = 0; k < resourceNum; k++) {
							vako[k] += allocation[i][k];
						}
						visited[i] = true;
						terminatedCount++;
						c++;
					}
				}
				if (c < processNum) {
					System.out.println("\nDeadlock cannot be resolved further.");
				} else {
					System.out.println("\nDeadlock successfully recovered!");
					System.out.println("Total processes terminated: " + terminatedCount);
				}
				return;
			}
		}
		System.out.println("\nDeadlock successfully recovered!");
		System.out.println("Total processes terminated: " + terminatedCount);
	}
}