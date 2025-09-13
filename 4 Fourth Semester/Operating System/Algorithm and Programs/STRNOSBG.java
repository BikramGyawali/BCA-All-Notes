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
			System.out.println("Enter process" + (p + 1) + " Brust Time:");
			burstTime[p] = sc.nextInt();
			System.out.println("Enter process" + (p + 1) + " Release Time:");
			releaseTime[p] = sc.nextInt();

			remainingTime[p] = burstTime[p];
		}
		int systemTime = 0, completeProcess = 0;

		while (completeProcess < PuraProcesses) {
			int shotestKamIndex = -1;
			int min = 9999;
			for (int i = 0; i < PuraProcesses; i++) {
				if ((releaseTime[i] <= systemTime) && releaseTime[i] > 0 && remainingTime[i] < min) {
					min = remainingTime[i];
					shotestKamIndex = i;
				}
			}
			if (shotestKamIndex == -1) {
				systemTime++;
				continue;
			}
			remainingTime[shotestKamIndex]--;
			systemTime++;
			if (remainingTime[shotestKamIndex] == 0) {
				completeProcess++;
				processStatus[shotestKamIndex] = 1;
				completionTime[shotestKamIndex] = systemTime;
				turnAroundTime[shotestKamIndex] = completionTime[shotestKamIndex] - releaseTime[shotestKamIndex];
				waitingTime[shotestKamIndex] = turnAroundTime[shotestKamIndex] - burstTime[shotestKamIndex];
				avgta += turnAroundTime[shotestKamIndex];
				avgwt += waitingTime[shotestKamIndex];
			}
		}
		System.out.println("Process ID\tRelease Time\tBrust Time\tCompletion Time\tTurn Around Time\tWaiting Time");
		for (int n = 0; n < PuraProcesses; n++) {
			// avgwt += waitingTime[n];
			// avgta += turnAroundTime[n];
			int idx = processId[n] - 1; // FIX
			System.out.println(processId[n] + "\t\t" + releaseTime[idx] + "\t\t" +
					burstTime[idx] + "\t\t" + completionTime[idx] + "\t\t" +
					turnAroundTime[idx] + "\t\t\t" + waitingTime[idx]);
		}

		System.out.println("\n Average Turn Around Time: " + (float) (avgta / PuraProcesses));
		System.out.println("\n Average Waiting  Time: " + (float) (avgwt / PuraProcesses));
		sc.close();
		for (int i = 0; i < PuraProcesses; i++) {
			System.out.print("| P" + processId[i] + " ");
		}
	}
}
