import java.util.Scanner;

public class BankersBG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of processes");
		int processNum = sc.nextInt();
		System.out.println("Enter the number of resources");
		int resourceNum = sc.nextInt();

		int[][] max = new int[processNum][resourceNum];
		int[][] allocation = new int[processNum][resourceNum];
		int[][] chiyeko = new int[processNum][resourceNum];
		int[] vako = new int[resourceNum];
		boolean[] visited = new boolean[processNum];
		int[] safe = new int[processNum];
		System.out.println("Enter the max matrix");
		for (int i = 0; i < processNum; i++) {
			for (int j = 0; j < resourceNum; j++) {
				max[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the allocation matrix");
		for (int i = 0; i < processNum; i++) {
			for (int j = 0; j < resourceNum; j++) {
				allocation[i][j] = sc.nextInt();
				chiyeko[i][j] = max[i][j] - allocation[i][j];
			}
		}
		System.out.println("Enter the available resources");
		for (int i = 0; i < resourceNum; i++) {
			vako[i] = sc.nextInt();
		}

		int c = 0;
		System.out.println("Safe sequence is:");
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
						safe[c++] = i;
						visited[i] = true;
						vitiyo = true;
					}
				}
			}
			if (!vitiyo) {
				System.out.println("The system is not in safe state");
				return;
			}
		}
		System.out.print("Hence, the SAFE Sequence is as follows: ");
		for (int i = 0; i < processNum; i++) {
			System.out.print("P" + safe[i]);
			if (i != processNum - 1) {
				System.out.print(" -> ");
			}
		}
		System.out.println(".");
		sc.close();
	}
}
