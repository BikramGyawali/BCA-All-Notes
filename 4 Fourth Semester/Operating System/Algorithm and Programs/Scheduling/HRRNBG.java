import java.util.Scanner;

public class HRRNBG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of processes:");
		int PuraProcesses = sc.nextInt();
		int[] processId = new int[PuraProcesses];
		int[] burstTime = new int[PuraProcesses];
		int[] releaseTime = new int[PuraProcesses];
		int[] completionTime = new int[PuraProcesses];
		int[] turnAroundTime = new int[PuraProcesses];
		int[] waitingTime = new int[PuraProcesses];
		boolean[] sakiyo = new boolean[PuraProcesses];

		for (int p = 0; p < PuraProcesses; p++) {
			System.out.println("Enter process" + (p + 1) + " Burst Time:");
			burstTime[p] = sc.nextInt();
			System.out.println("Enter process" + (p + 1) + " Release Time:");
			releaseTime[p] = sc.nextInt();
			processId[p] = p + 1;

		}
		int systemTime = 0, completeProcess = 0;
		float totalTT = 0, totalWT = 0;
		while (completeProcess < PuraProcesses) {
			int thuloResponseIndex = -1;
			float maxResponseRatio = -1;
			for (int i = 0; i < PuraProcesses; i++) {
				if (!sakiyo[i] && releaseTime[i] <= systemTime) {
					float responseRatio = (float) (systemTime - releaseTime[i] + burstTime[i]) / burstTime[i];
					if (responseRatio > maxResponseRatio) {
						maxResponseRatio = responseRatio;
						thuloResponseIndex = i;
					} else if (responseRatio == maxResponseRatio && thuloResponseIndex != -1) {
						if (releaseTime[i] < releaseTime[thuloResponseIndex]) {
							thuloResponseIndex = i;
						}
					}
				}
			}
			if (thuloResponseIndex == -1) {
				systemTime++;
				continue;
			} else {
				systemTime += burstTime[thuloResponseIndex];
				completionTime[thuloResponseIndex] = systemTime;
				turnAroundTime[thuloResponseIndex] = completionTime[thuloResponseIndex]
						- releaseTime[thuloResponseIndex];
				waitingTime[thuloResponseIndex] = turnAroundTime[thuloResponseIndex] - burstTime[thuloResponseIndex];
				totalTT += turnAroundTime[thuloResponseIndex];
				totalWT += waitingTime[thuloResponseIndex];
				sakiyo[thuloResponseIndex] = true;
				completeProcess++;
			}
		}
		System.out.println("Process ID\tRelease Time\tBurst Time\tCompletion Time\tTurn Around Time\tWaiting Time");
		for (int n = 0; n < PuraProcesses; n++) {

			System.out.println(processId[n] + "\t\t" + releaseTime[n] + "\t\t" +
					burstTime[n] + "\t\t" + completionTime[n] + "\t\t" +
					turnAroundTime[n] + "\t\t\t" + waitingTime[n]);
		}
		System.out.println("\nAverage Turn Around Time: " + (totalTT / PuraProcesses));
		System.out.println("Average Waiting Time: " + (totalWT / PuraProcesses));
		sc.close();
	}
}
