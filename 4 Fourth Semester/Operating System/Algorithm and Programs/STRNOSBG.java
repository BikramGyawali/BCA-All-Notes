import java.util.Scanner;

public class STRNOSBG {
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
		int[] remainingTime = new int[PuraProcesses];
		int[] processStatus = new int[PuraProcesses];
		float avgwt = 0, avgta = 0;

		for (int p = 0; p < PuraProcesses; p++) {
			System.out.println("Enter process" + (p + 1) + " Burst Time:");
			burstTime[p] = sc.nextInt();
			System.out.println("Enter process" + (p + 1) + " Release Time:");
			releaseTime[p] = sc.nextInt();
			processId[p] = p + 1;
			remainingTime[p] = burstTime[p];
		}

		int systemTime = 0, completeProcess = 0;

		while (completeProcess < PuraProcesses) {
			int shortestKamIndex = -1;
			int min = 9999;

			for (int i = 0; i < PuraProcesses; i++) {
				if ((releaseTime[i] <= systemTime) && remainingTime[i] > 0 && remainingTime[i] < min) {
					min = remainingTime[i];
					shortestKamIndex = i;
				}
			}

			if (shortestKamIndex == -1) {
				systemTime++;
				continue;
			}

			remainingTime[shortestKamIndex]--;
			systemTime++;

			if (remainingTime[shortestKamIndex] == 0) {
				completeProcess++;
				processStatus[shortestKamIndex] = 1;
				completionTime[shortestKamIndex] = systemTime;
				turnAroundTime[shortestKamIndex] = completionTime[shortestKamIndex] - releaseTime[shortestKamIndex];
				waitingTime[shortestKamIndex] = turnAroundTime[shortestKamIndex] - burstTime[shortestKamIndex];
				avgta += turnAroundTime[shortestKamIndex];
				avgwt += waitingTime[shortestKamIndex];
			}
		}

		System.out.println("Process ID\tRelease Time\tBurst Time\tCompletion Time\tTurn Around Time\tWaiting Time");
		for (int n = 0; n < PuraProcesses; n++) {
			System.out.println(processId[n] + "\t\t" + releaseTime[n] + "\t\t" +
					burstTime[n] + "\t\t" + completionTime[n] + "\t\t" +
					turnAroundTime[n] + "\t\t\t" + waitingTime[n]);
		}

		System.out.println("\nAverage Turn Around Time: " + (avgta / PuraProcesses));
		System.out.println("Average Waiting Time: " + (avgwt / PuraProcesses));

		sc.close();

	}
}
