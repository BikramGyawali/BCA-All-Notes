import java.util.Scanner;

public class DeadLockDetectionBg {
public static void main(String[] args){
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
		if (isDeadLock(allocation, chiyeko, vako, visited, processNum, resourceNum)) {
			System.out.println("The system is in deadlock state");
		} else {
			System.out.println("The system is not in deadlock state");
		}
}
public static boolean isDeadLock(int[][] allocation, int[][] chiyeko, int[] vako, boolean[] visited,
			int processNum, int resourceNum) {
		int c = 0;
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
					}
				}
			}
			if (!vitiyo) {
				return true;
			}
		}
		return false;
	

	}
}